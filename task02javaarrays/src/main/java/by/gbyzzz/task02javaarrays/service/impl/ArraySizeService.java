package by.gbyzzz.task02javaarrays.service.impl;

import by.gbyzzz.task02javaarrays.beans.Array;
import by.gbyzzz.task02javaarrays.beans.factory.EntityFactory;
import by.gbyzzz.task02javaarrays.service.ArrayService;

import java.io.*;
import java.util.Scanner;

public class ArraySizeService {

    public Array execute(String str) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        InputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
        Scanner in = new Scanner(bufferedInputStream);
        EntityFactory entityFactory = new EntityFactory();
        int j = 1;
        try {
            byte[] c = new byte[1024];
            int readChars = 0;
            boolean empty = true;
            while ((readChars = bufferedInputStream.read(c)) != -1) {
                empty = false;
                for (int i = 0; i < readChars; ++i) {
                    if (c[i] == '\n') {
                        ++j;
                    }
                }
            }
            j =  (j == 1 && !empty) ? 1 : j;
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bufferedInputStream.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
