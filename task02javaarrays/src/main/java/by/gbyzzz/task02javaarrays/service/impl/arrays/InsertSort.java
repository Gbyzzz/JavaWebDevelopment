package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.beans.Array;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.FileIOService;
import by.gbyzzz.task02javaarrays.service.factory.ServiceFactory;

public class InsertSort implements ArrayService {
    @Override
    public Array execute(String str) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        FileIOService fileIOServiceImpl = serviceFactory.getFileIOService();
        Array array = fileIOServiceImpl.readFileToArray(str);
        Number[][] arr = array.getArr();

        if (arr[0][0] instanceof Integer) {
            for (int i = 1; i < arr.length; i++) {
                int current = arr[i][0].intValue();
                int j = i;
                while (j > 0 && arr[j - 1][0].intValue() > current) {
                    arr[j][0] = arr[j - 1][0];
                    j--;
                }
                arr[j][0] = current;
            }
        } else if (arr[0][0] instanceof Double) {
            for (int i = 1; i < arr.length; i++) {
                double current = arr[i][0].doubleValue();
                int j = i;
                while (j > 0 && arr[j - 1][0].doubleValue() > current) {
                    arr[j][0] = arr[j - 1][0];
                    j--;
                }
                arr[j][0] = current;
            }
        }

        array.setArr(arr);
        return array;
    }
}
