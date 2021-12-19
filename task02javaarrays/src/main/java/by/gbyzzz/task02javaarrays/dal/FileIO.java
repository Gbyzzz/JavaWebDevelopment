package by.gbyzzz.task02javaarrays.dal;

import by.gbyzzz.task02javaarrays.beans.MyArray;

public interface FileIO {
    MyArray readFileToArray(String str);

    String filePath(String str);

    void arrayWriteToFile(MyArray arr, String str);
}
