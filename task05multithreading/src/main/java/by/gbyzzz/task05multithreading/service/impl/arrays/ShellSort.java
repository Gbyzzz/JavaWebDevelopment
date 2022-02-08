package by.gbyzzz.task05multithreading.service.impl.arrays;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.dal.FileIOFactory;
import by.gbyzzz.task05multithreading.service.ArrayService;

public class ShellSort implements ArrayService {
    @Override
    public MyArray execute(final String... str) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        MyArray myArray = fileIOFactory.getFileIO().readFileToArray(str[0]);
        Number[][] arr = myArray.getArr();

        if (arr[0][0]instanceof Integer) {
            for (int step = arr[0].length / 2; step > 0; step /= 2) {
                for (int i = step; i < arr[0].length; i++) {
                    for (int j = i - step; j >= 0 && arr[0][j].intValue() > arr[0][j + step].intValue(); j -= step) {
                        int x = arr[0][j].intValue();
                        arr[0][j] = arr[0][j + step];
                        arr[0][j + step] = x;
                    }
                }
            }
        } else if (arr[0][0]instanceof Double) {
            for (int step = arr[0].length / 2; step > 0; step /= 2) {
                for (int i = step; i < arr[0].length; i++) {
                    for (int j = i - step; j >= 0 && arr[0][j].doubleValue() > arr[0][j + step].doubleValue(); j -= step) {
                        double x = arr[0][j].doubleValue();
                        arr[0][j] = arr[0][j + step];
                        arr[0][j + step] = x;
                    }
                }
            }
        }
        myArray.setArr(arr);
        return myArray;
    }
}

