package by.gbyzzz.task05multithreading.dal;

import by.gbyzzz.task05multithreading.beans.MyArray;

public interface FileIO {
    MyArray readFileToArray(String str);

    String filePath(String str);
    String[] readFileToStringArray(String str, int i);

    void arrayWriteToFile(MyArray arr, String str);
}
