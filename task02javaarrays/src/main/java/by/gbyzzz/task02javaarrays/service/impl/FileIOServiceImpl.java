package by.gbyzzz.task02javaarrays.service.impl;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.dal.FileIO;
import by.gbyzzz.task02javaarrays.dal.FileIOFactory;
import by.gbyzzz.task02javaarrays.service.FileIOService;

public class FileIOServiceImpl implements FileIOService {
    FileIOFactory fileIOFactory = FileIOFactory.getInstance();
    FileIO fileIO = fileIOFactory.getFileIO();

    public MyArray readFileToArray(String str) {
        return fileIO.fileReadToArray(str);
    }
}
