package by.gbyzzz.task04figures.dal.fileio;

import java.io.IOException;
import java.lang.reflect.Type;

public interface FileIOInterface {
    void parseJSON(String file, Type type) throws IOException;
    void parseTXT(String file, Type type) throws IOException;
}
