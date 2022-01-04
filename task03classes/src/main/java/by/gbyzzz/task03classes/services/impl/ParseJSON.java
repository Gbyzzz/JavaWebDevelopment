package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.dal.FileIOFactory;
import by.gbyzzz.task03classes.dal.FileIOImpl;
import by.gbyzzz.task03classes.services.ParseJSONService;

public class ParseJSON implements ParseJSONService {
    public void JsonIO(String file) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        FileIOImpl fileIO = fileIOFactory.getFileIO();
        fileIO.parseJSON(file);
    }
}
