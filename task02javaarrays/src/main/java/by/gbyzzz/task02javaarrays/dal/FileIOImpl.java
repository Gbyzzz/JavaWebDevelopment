package by.gbyzzz.task02javaarrays.dal;

import by.gbyzzz.task02javaarrays.beans.Array;
import by.gbyzzz.task02javaarrays.beans.factory.EntityFactory;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
        Scanner in = new Scanner(bufferedInputStream);
        EntityFactory entityFactory = new EntityFactory();
        Array array = null;

        Number[] arr = null;
        if(in.hasNextInt()) {
            List<Integer> numbers = new ArrayList<Integer>();
            while (in.hasNextInt()) {
                numbers.add(in.nextInt());
            }
            int length = numbers.size();
            arr = numbers.toArray(new Integer[length]);
            array = entityFactory.makeNewIntArray((Integer[]) arr);


        } else if(in.hasNextDouble()) {
            List<Double> numbers = new ArrayList<Double>();
            while (in.hasNextDouble()) {
                numbers.add(in.nextDouble());
            }
            int length = numbers.size();
            arr = numbers.toArray(new Double[length]);
            array = entityFactory.makeNewDoubleArray((Double[]) arr);
        }
        return array;
    }

    public Number[][] fileReadMatrix(String str){

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
        Scanner in = new Scanner(bufferedInputStream);

        Number[][] arr = null;
        if(in.hasNextDouble()) {
            List<Double> numbers = new ArrayList<Double>();
            while (in.hasNextDouble()) {
                numbers.add(in.nextDouble());
            }
            int length = numbers.size();
            arr = numbers.toArray(new Double[length][]);
        }else if(in.hasNextInt()) {
            List<Integer> numbers = new ArrayList<Integer>();
            while (in.hasNextInt()) {
                numbers.add(in.nextInt());
            }
            int length = numbers.size();
            arr = numbers.toArray(new Integer[length][]);
        }

        return arr;
    }
}
