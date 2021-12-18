package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.beans.Array;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.FileIOService;
import by.gbyzzz.task02javaarrays.service.factory.ServiceFactory;

public class ShakeSort implements ArrayService {
    @Override
    public Array execute(String str) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        FileIOService fileIOServiceImpl = serviceFactory.getFileIOService();
        Array array = fileIOServiceImpl.readFileToArray(str);
        Number[][] arr = array.getArr();
        int left = 0;
        int right = arr.length - 1;

        if (arr[0][0] instanceof Integer) {
                do {
                    int temp;
                    for (int i = left; i < right; i++) {
                        if (arr[i][0].intValue() > arr[i + 1][0].intValue()) {
                            temp = arr[i][0].intValue();
                            arr[i][0] = arr[i + 1][0];
                            arr[i + 1][0] = temp;
                        }
                    }
                    right--;
                    for (int i = right; i > left; i--) {
                        if (arr[i][0].intValue() < arr[i - 1][0].intValue()) {
                            temp = arr[i][0].intValue();
                            arr[i][0] = arr[i - 1][0];
                            arr[i - 1][0] = temp;
                        }
                    }
                    left++;
                } while (left < right);

            } else if (arr[0][0] instanceof Double) {
                do {
                    double temp;
                    for (int i = left; i < right; i++) {
                        if (arr[i][0].doubleValue() > arr[i + 1][0].doubleValue()) {
                            temp = arr[i][0].doubleValue();
                            arr[i][0] = arr[i + 1][0];
                            arr[i + 1][0] = temp;
                        }
                    }
                    right--;
                    for (int i = right; i > left; i--) {
                        if (arr[i][0].doubleValue() < arr[i - 1][0].doubleValue()) {
                            temp = arr[i][0].doubleValue();
                            arr[i][0] = arr[i - 1][0];
                            arr[i - 1][0] = temp;
                        }
                    }
                    left++;
                } while (left < right);
            }
            array.setArr(arr);
            return array;
    }
}


