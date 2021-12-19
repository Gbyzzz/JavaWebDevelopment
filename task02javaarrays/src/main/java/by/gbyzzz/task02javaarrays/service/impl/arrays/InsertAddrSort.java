package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.dal.FileIOFactory;
import by.gbyzzz.task02javaarrays.service.ArrayService;

import java.util.TreeMap;

public class InsertAddrSort implements ArrayService {

    @Override
    public MyArray execute(final String... str) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        MyArray myArray = fileIOFactory.getFileIO().readFileToArray(str[0]);
        Number[][] arr = myArray.getArr();
        TreeMap<Integer, Integer> sort = new TreeMap<>();
        for (int i = 0; i < arr[0].length; i++) {
            sort.put(arr[0][i].intValue(), arr[0][i].intValue());
        }
        String string = sort.values().toString().substring(1);
        string = string.substring(0, string.length() - 1);
        String[] array = string.split(", ");
        Number[][] res = new Number[1][array.length];
        for (int i = 0; i < array.length; i++) {
            if (arr[0][0] instanceof Integer) {
                res[0][i] = Integer.parseInt(array[i]);
            } else if (arr[0][0] instanceof Double) {
                res[0][i] = Double.parseDouble(array[i]);
            }
        }
        myArray.setArr(res);
        return myArray;
    }
}
