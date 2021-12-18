package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.beans.Array;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.FileIOService;
import by.gbyzzz.task02javaarrays.service.factory.ServiceFactory;

public class SelectSort implements ArrayService {
    @Override
    public Array execute(String str) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        FileIOService fileIOServiceImpl = serviceFactory.getFileIOService();
        Array array = fileIOServiceImpl.readFileToArray(str);
        Number[][] arr = array.getArr();

        if (arr[0][0] instanceof Integer) {
            for (int i = 0; i < arr.length; i++) {
                int pos = i;
                int min = arr[i][0].intValue();
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j][0].intValue() < min) {
                        pos = j;
                        min = arr[j][0].intValue();
                    }
                }
                arr[pos][0] = arr[i][0];
                arr[i][0] = min;
            }
        } else if (arr[0][0] instanceof Double) {
            for (int i = 0; i < arr.length; i++) {
                int pos = i;
                double min = arr[i][0].doubleValue();
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j][0].doubleValue() < min) {
                        pos = j;
                        min = arr[j][0].doubleValue();
                    }
                }
                arr[pos][0] = arr[i][0];
                arr[i][0] = min;
            }
        }
        array.setArr(arr);
        return array;
    }
}
