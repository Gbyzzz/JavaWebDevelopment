package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.dal.FileIOFactory;
import by.gbyzzz.task02javaarrays.service.ArrayService;

public class SelectSort implements ArrayService {
    @Override
    public MyArray execute(final String... str) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        MyArray myArray = fileIOFactory.getFileIO().readFileToArray(str[0]);
        Number[][] arr = myArray.getArr();

        if (arr[0][0] instanceof Integer) {
            for (int i = 0; i < arr[0].length; i++) {
                int pos = i;
                int min = arr[0][i].intValue();
                for (int j = i + 1; j < arr[0].length; j++) {
                    if (arr[0][j].intValue() < min) {
                        pos = j;
                        min = arr[0][j].intValue();
                    }
                }
                arr[0][pos] = arr[0][i];
                arr[0][i] = min;
            }
        } else if (arr[0][0] instanceof Double) {
            for (int i = 0; i < arr.length; i++) {
                int pos = i;
                double min = arr[0][i].doubleValue();
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[0][j].doubleValue() < min) {
                        pos = j;
                        min = arr[0][j].doubleValue();
                    }
                }
                arr[0][pos] = arr[0][i];
                arr[0][i] = min;
            }
        }
        myArray.setArr(arr);
        return myArray;
    }
}
