package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.dal.FileIOFactory;
import by.gbyzzz.task02javaarrays.service.ArrayService;

public class BubbleSort implements ArrayService {

    @Override
    public MyArray execute(String ... str) {
        FileIOFactory  fileIOFactory = FileIOFactory.getInstance();
        MyArray myArray = fileIOFactory.getFileIO().readFileToArray(str[0]);
        Number[][] arr = myArray.getArr();

        boolean isSorted = false;
        while(!isSorted) {
            if(arr[0][0]instanceof Integer){
                int buf;
            isSorted = true;
            for (int i = 0; i < arr[0].length-1; i++) {
                if(arr[0][i].intValue()>arr[0][i+1].intValue()) {
                    isSorted = false;

                    buf = (int) arr[0][i];
                    arr[0][i] = arr[0][i + 1];
                    arr[0][i + 1] = buf;
                }
            }
            }else if(arr[0][0]instanceof Double){
                double buf;
                isSorted = true;
                for (int i = 0; i < arr.length-1; i++) {
                    if(arr[i][0].doubleValue()>arr[i+1][0].doubleValue()) {
                        isSorted = false;

                        buf = (double) arr[i][0];
                        arr[i][0] = arr[i + 1][0];
                        arr[i + 1][0] = buf;
                    }
                }
            }
        }
        myArray.setArr(arr);
        fileIOFactory.getFileIO().arrayWriteToFile(myArray, str[0]);
        return myArray;
    }
}
