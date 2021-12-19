package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.dal.FileIOFactory;
import by.gbyzzz.task02javaarrays.service.ArrayService;

public class InsertAddrSort implements ArrayService {

    @Override
    public MyArray execute(String... str) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        MyArray myArray = fileIOFactory.getFileIO().readFileToArray(str[0]);
        Number[][] arr = myArray.getArr();
// TODO write code
        myArray.setArr(arr);
        return myArray;
    }
}
