package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.dal.FileIOFactory;
import by.gbyzzz.task02javaarrays.service.ArrayService;

public class ShakeSort implements ArrayService {
    @Override
    public MyArray execute(String... str) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        MyArray myArray = fileIOFactory.getFileIO().readFileToArray(str[0]);
        Number[][] arr = myArray.getArr();
        int left = 0;
        int right = arr[0].length - 1;

        if (arr[0][0] instanceof Integer) {
                do {
                    int temp;
                    for (int i = left; i < right; i++) {
                        if (arr[0][i].intValue() > arr[0][i + 1].intValue()) {
                            temp = arr[0][i].intValue();
                            arr[0][i] = arr[0][i + 1];
                            arr[0][i + 1] = temp;
                        }
                    }
                    right--;
                    for (int i = right; i > left; i--) {
                        if (arr[0][i].intValue() < arr[0][i - 1].intValue()) {
                            temp = arr[0][i].intValue();
                            arr[0][i] = arr[0][i - 1];
                            arr[0][i - 1] = temp;
                        }
                    }
                    left++;
                } while (left < right);

            } else if (arr[0][0] instanceof Double) {
                do {
                    double temp;
                    for (int i = left; i < right; i++) {
                        if (arr[0][i].doubleValue() > arr[0][i + 1].doubleValue()) {
                            temp = arr[0][i].doubleValue();
                            arr[0][i] = arr[0][i + 1];
                            arr[0][i + 1] = temp;
                        }
                    }
                    right--;
                    for (int i = right; i > left; i--) {
                        if (arr[i][0].doubleValue() < arr[i - 1][0].doubleValue()) {
                            temp = arr[0][i].doubleValue();
                            arr[0][i] = arr[0][i - 1];
                            arr[0][i - 1] = temp;
                        }
                    }
                    left++;
                } while (left < right);
            }
            myArray.setArr(arr);
            return myArray;
    }
}


