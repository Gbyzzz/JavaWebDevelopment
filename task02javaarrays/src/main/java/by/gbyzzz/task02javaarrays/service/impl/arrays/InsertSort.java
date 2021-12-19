package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.dal.FileIOFactory;
import by.gbyzzz.task02javaarrays.service.ArrayService;

public class InsertSort implements ArrayService {
    @Override
    public MyArray execute(String... str) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        MyArray myArray = fileIOFactory.getFileIO().readFileToArray(str[0]);
        Number[][] arr = myArray.getArr();

        if (arr[0][0] instanceof Integer) {
            for (int i = 1; i < arr[0].length; i++) {
                int current = arr[0][i].intValue();
                int j = i;
                while (j > 0 && arr[0][j - 1].intValue() > current) {
                    arr[0][j] = arr[0][j - 1];
                    j--;
                }
                arr[0][j] = current;
            }
        } else if (arr[0][0] instanceof Double) {
            for (int i = 1; i < arr[0].length; i++) {
                double current = arr[0][i].doubleValue();
                int j = i;
                while (j > 0 && arr[0][j - 1].doubleValue() > current) {
                    arr[0][j] = arr[0][j - 1];
                    j--;
                }
                arr[0][j] = current;
            }
        }

        myArray.setArr(arr);
        return myArray;
    }
}
