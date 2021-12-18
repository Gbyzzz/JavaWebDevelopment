package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.beans.Array;
import by.gbyzzz.task02javaarrays.service.ArrayService;
import by.gbyzzz.task02javaarrays.service.FileIOService;
import by.gbyzzz.task02javaarrays.service.factory.ServiceFactory;

public class InsertAddrSort implements ArrayService {

    @Override
    public Array execute(String str) {
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        FileIOService fileIOServiceImpl = serviceFactory.getFileIOService();
        Array array = fileIOServiceImpl.readFileToArray(str);
        Number[][] arr = array.getArr();
// TODO write code
        array.setArr(arr);
        return array;
    }
}
