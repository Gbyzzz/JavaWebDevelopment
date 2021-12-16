package by.gbyzzz.task02javaarrays.service;

import by.gbyzzz.task02javaarrays.beans.Array;
import by.gbyzzz.task02javaarrays.dal.FileIO;
import by.gbyzzz.task02javaarrays.dal.FileIOFactory;

public interface ArrayService {

    void sort(Number[] arr);

//    void sort(double[] arg);
//
//    void sort(int[] arg);

    static Array readFileToArray(String str){
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        FileIO fileIO =  fileIOFactory.getFileIO();
        return fileIO.fileReadToArray(str);
    }

}
