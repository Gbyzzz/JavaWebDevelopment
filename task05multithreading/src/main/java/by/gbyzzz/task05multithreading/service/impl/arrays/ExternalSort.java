package by.gbyzzz.task05multithreading.service.impl.arrays;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.dal.FileIOFactory;
import by.gbyzzz.task05multithreading.service.ArrayService;

public class ExternalSort implements ArrayService {

    @Override
    public MyArray execute(final String... str) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        MyArray myArray = fileIOFactory.getFileIO().readFileToArray(str[0]);
        Number[][] arr = myArray.getArr();
// TODO write code
        myArray.setArr(arr);
        return myArray;
    }
}
