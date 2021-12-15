package by.gbyzzz.task02javaarrays.service;

import by.gbyzzz.task02javaarrays.beans.Array;
import by.gbyzzz.task02javaarrays.beans.factory.EntityFactory;
import by.gbyzzz.task02javaarrays.dal.FileIO;
import by.gbyzzz.task02javaarrays.dal.FileIOFactory;

public class FileReadService {
    public Array readFile(String str){
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        FileIO fileIO =  fileIOFactory.getFileIO();
        EntityFactory entityFactory = new EntityFactory();
        Number[] arr = fileIO.fileReadArray(str);
        return entityFactory.makeNewArray(arr);
        }
}
