package by.gbyzzz.task02javaarrays.dal;

import by.gbyzzz.task02javaarrays.beans.Array;
import by.gbyzzz.task02javaarrays.beans.factory.EntityFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * This class reads data from a txt file and converts it to the
 * type specified in the arg.
 * @author Anton Pinchuk
 *
 */

public final class FileIOImpl implements FileIO {

    @Override
    public Array fileReadToArray(String str){

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


        Array array = null;
//        int j = 1;
//        while(bufferedInputStream.read()){
//            j++;
//        }
        Number[][] arr;
        if(in.hasNextInt()) {
            List<Integer> numbers = new ArrayList<Integer>();
            while (in.hasNextInt()) {
                numbers.add(in.nextInt());
            }
            int length = numbers.size();
            arr = numbers.toArray(new Integer[length][j]);
            array = entityFactory.makeNewIntArray((Integer[][]) arr);


        } else if(in.hasNextDouble()) {
            List<Double> numbers = new ArrayList<Double>();
            while (in.hasNextDouble()) {
                numbers.add(in.nextDouble());
            }
            int length = numbers.size();
            arr = numbers.toArray(new Double[length][j]);
            array = entityFactory.makeNewDoubleArray((Double[][]) arr);
        }
        in.close();
        return array;
    }
}
