package by.gbyzzz.task02javaarrays.service;

import by.gbyzzz.task02javaarrays.beans.Array;
import by.gbyzzz.task02javaarrays.beans.factory.EntityFactory;
import by.gbyzzz.task02javaarrays.dal.FileIO;
import by.gbyzzz.task02javaarrays.dal.FileIOFactory;

public interface ArrayService {

    void sort(double[] arg);

    void sort(int[] arg);

    static Array readFile(String str){
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        FileIO fileIO =  fileIOFactory.getFileIO();
        EntityFactory entityFactory = new EntityFactory();
        Number[] arr = fileIO.fileReadArray(str);
        return entityFactory.makeNewArray(arr);
    }
}
