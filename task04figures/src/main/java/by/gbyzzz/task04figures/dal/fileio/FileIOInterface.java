package by.gbyzzz.task04figures.dal.fileio;

import java.lang.reflect.Type;
import java.util.List;

public interface FileIOInterface {
    List parseJSON(String file, Type type);
    void parseTXT(String file);
}
