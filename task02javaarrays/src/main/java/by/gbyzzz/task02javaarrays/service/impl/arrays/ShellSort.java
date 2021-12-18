package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.FileIOService;
import by.gbyzzz.task02javaarrays.service.factory.ServiceFactory;

public class ShellSort implements ArrayService {
    @Override
    public MyArray execute(String... str) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        FileIOService fileIOServiceImpl = serviceFactory.getFileIOService();
        MyArray myArray = fileIOServiceImpl.readFileToArray(str[0]);
        Number[][] arr = myArray.getArr();

        if(arr[0][0]instanceof Integer) {
            for (int step = arr[0].length / 2; step > 0; step /= 2) {
                for (int i = step; i < arr[0].length; i++) {
                    for (int j = i - step; j >= 0 && arr[0][j].intValue() > arr[0][j + step].intValue(); j -= step) {
                        int x = arr[0][j].intValue();
                        arr[0][j] = arr[0][j + step];
                        arr[0][j + step] = x;
                    }
                }
            }
        }else if(arr[0][0]instanceof Double) {
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

