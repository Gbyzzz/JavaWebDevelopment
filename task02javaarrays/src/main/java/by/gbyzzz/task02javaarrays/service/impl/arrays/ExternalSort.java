package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.FileIOService;
import by.gbyzzz.task02javaarrays.service.factory.ServiceFactory;

public class ExternalSort implements ArrayService {

    @Override
    public MyArray execute(String... str) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        FileIOService fileIOServiceImpl = serviceFactory.getFileIOService();
        MyArray myArray = fileIOServiceImpl.readFileToArray(str[0]);
        Number[][] arr = myArray.getArr();
// TODO write code
        myArray.setArr(arr);
        return myArray;
    }
}
