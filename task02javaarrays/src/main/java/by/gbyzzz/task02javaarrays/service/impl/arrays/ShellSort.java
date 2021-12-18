package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.beans.Array;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.FileIOService;
import by.gbyzzz.task02javaarrays.service.factory.ServiceFactory;

public class ShellSort implements ArrayService {
    @Override
    public Array execute(String str) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        FileIOService fileIOServiceImpl = serviceFactory.getFileIOService();
        Array array = fileIOServiceImpl.readFileToArray(str);
        Number[][] arr = array.getArr();

        if(arr[0][0]instanceof Integer) {
            for (int step = arr.length / 2; step > 0; step /= 2) {
                for (int i = step; i < arr.length; i++) {
                    for (int j = i - step; j >= 0 && arr[j][0].intValue() > arr[j + step][0].intValue(); j -= step) {
                        int x = arr[j][0].intValue();
                        arr[j][0] = arr[j + step][0];
                        arr[j + step][0] = x;
                    }
                }
            }
        }else if(arr[0][0]instanceof Double) {
            for (int step = arr.length / 2; step > 0; step /= 2) {
                for (int i = step; i < arr.length; i++) {
                    for (int j = i - step; j >= 0 && arr[j][0].doubleValue() > arr[j + step][0].doubleValue(); j -= step) {
                        double x = arr[j][0].doubleValue();
                        arr[j][0] = arr[j + step][0];
                        arr[j + step][0] = x;
                    }
                }
            }
        }
        array.setArr(arr);
        return array;
    }
}

