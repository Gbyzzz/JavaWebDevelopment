package by.gbyzzz.task05multithreading.dal;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.beans.factory.EntityFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.net.URL;
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
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public MyArray readFileToArray(final String strIn) {
        LOGGER.trace("Reading from file");
        String str = filePath(strIn);
        EntityFactory entityFactory = new EntityFactory();
        MyArray myArray = null;
        File file = new File(str);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            LOGGER.error("File not found");
            e.printStackTrace();
        }
        int i = 0;
        int j = 0;

        if (scanner.hasNextInt()) {
            Integer[][] arr;
            List<Integer[]> lines = new ArrayList<>();
            while (scanner.hasNextLine()) {
                j++;
                String[] array = scanner.nextLine().split(" ");
                Integer[] numArr = new Integer[array.length];
                for (int a = 0; a < array.length; a++) {
                    numArr[a] = Integer.parseInt(array[a]);
                }
                lines.add(numArr);
                i = array.length;
            }
            arr = new Integer[j][i];
            for (int a = 0; a < lines.size(); a++) {

                for (int b = 0; b < i; b++) {
                    arr[a][b] = lines.get(a)[b];
                }

            }
            myArray = entityFactory.makeNewIntArray((Integer[][]) arr);
        } else if (scanner.hasNextDouble()) {
            Double[][] arr;
            List<Double[]> lines = new ArrayList<>();
            while (scanner.hasNextLine()) {
                j++;
                String[] array = scanner.nextLine().split(" ");
                Double[] numArr = new Double[array.length];
                for (int a = 0; a < array.length; a++) {
                    numArr[a] = Double.parseDouble(array[a]);
                }
                lines.add(numArr);
                i = i + array.length;
            }
            arr = new Double[j][i];
            for (int a = 0; a < lines.size(); a++) {
                for (Double[] nums : arr) {
                    for (int b = 0; b < nums.length; b++) {
                        nums[b] = lines.get(a)[b];
                    }
                }
            }
            myArray = entityFactory.makeNewDoubleArray((Double[][]) arr);
        }
        scanner.close();
        return myArray;


}

    @Override
    public String filePath(final String str) {
        LOGGER.trace("Getting path to the file");
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            LOGGER.error("File not found");
            throw new IllegalArgumentException("file not found! " + str);
        }
        return resource.getPath();
    }

    @Override
    public String[] readFileToStringArray(String file, int i) {
        List<String> list = new ArrayList<>();
        String str;
        BufferedReader in;
        try {
        in = new BufferedReader(new FileReader(filePath(file)));
        while ((str = in.readLine()) != null) {
            list.add(str);
        }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] array;
        array = list.get(i).split(" ");
        return array;
    }

    @Override
    public void arrayWriteToFile(final MyArray arr, final String str) {
        LOGGER.trace("writing array to file");
        Number[][] temp = arr.getArr();
        try (FileWriter writer = new FileWriter(filePath("executed_" + str), false)) {
            for (int i = 0; i < temp.length; ++i) {
                for (int j = 0; j < temp[i].length; ++j) {
                    writer.write(temp[i][j].toString());
                    writer.write(" ");
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            LOGGER.error("File not found");
            e.printStackTrace();
        }
    }
}

