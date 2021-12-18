package by.gbyzzz.task02javaarrays.dal;

import by.gbyzzz.task02javaarrays.beans.MyArray;
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
    public MyArray fileReadToArray(String str) {
        EntityFactory entityFactory = new EntityFactory();
        MyArray myArray = null;
        File file = new File(str);
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
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
                Integer numArr[] = new Integer[array.length];
                for (int a = 0; a < array.length; a++) {
                    numArr[a] = Integer.parseInt(array[a]);
                }
                lines.add(numArr);
                i = array.length;
            }
            arr = new Integer[j][i];
            for(int a = 0; a < lines.size(); a++) {

                    for (int b = 0; b < i; b++)
                        arr[a][b] = lines.get(a)[b];

            }
            myArray = entityFactory.makeNewIntArray((Integer[][]) arr);
        } else if (scanner.hasNextDouble()) {
            Double[][] arr;
            List<Double[]> lines = new ArrayList<>();
            while (scanner.hasNextLine()) {
                j++;
                String[] array = scanner.nextLine().split(" ");
                Double numArr[] = new Double[array.length];
                for (int a = 0; a < array.length; a++) {
                    numArr[a] = Double.parseDouble(array[a]);
                }
                lines.add(numArr);
                i = i + array.length;
            }
            arr = new Double[j][i];
            for(int a = 0; a < lines.size(); a++) {
                for (Double[] nums : arr) {
                    for (int b = 0; b < nums.length; b++)
                        nums[b] = lines.get(a)[b];
                }
            }
            myArray = entityFactory.makeNewDoubleArray((Double[][]) arr);
        }
        scanner.close();
        return myArray;

    }
}


//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = new FileInputStream(str);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        InputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
//        scanner = new Scanner(bufferedInputStream);
//        Number[][] arr;
//        if(scanner.hasNextInt()) {
//            arr = new Integer[i][j];
//            List<Integer> numbers = new ArrayList<Integer>();
//            for(int a = 0; a < j; a++){
//            while (scanner.hasNextInt()) {
//                numbers.add(scanner.nextInt());
//            }
//            arr = numbers.toArray(new Integer[i][j-1]);
//            myArray = entityFactory.makeNewIntArray((Integer[][]) arr);
//
//
//        } else if(scanner.hasNextDouble()) {
//            List<Double> numbers = new ArrayList<Double>();
//            while (scanner.hasNextDouble()) {
//                numbers.add(scanner.nextDouble());
//            }
//            arr = numbers.toArray(new Double[i][j]);
//            myArray = entityFactory.makeNewDoubleArray((Double[][]) arr);
//        }
//        scanner.close();
//        return myArray;
//    }
//        FileInputStream fileInputStream = null;
//        try {
//            fileInputStream = new FileInputStream(str);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        InputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
//        Scanner in = null;
//        EntityFactory entityFactory = new EntityFactory();
////        int j = 1;
////        try {
////            byte[] c = new byte[1024];
////            int readChars = 0;
////            boolean empty = true;
////            while ((readChars = bufferedInputStream.read(c)) != -1) {
////                empty = false;
////                for (int i = 0; i < readChars; ++i) {
////                    if (c[i] == '\n') {
////                        ++j;
////                    }
////                }
////            }
////            j =  (j == 1 && !empty) ? 1 : j;
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        try {
////            bufferedInputStream.reset();
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
//
//
//        MyArray myArray = null;
//        int j = 1;
//        in = new Scanner(fileInputStream);
//        while(in.hasNextLine()){
//            j++;
//        }
//
//        Number[][] arr;
//        if(in.hasNextInt()) {
//            List<Integer> numbers = new ArrayList<Integer>();
//            while (in.hasNextInt()) {
//                numbers.add(in.nextInt());
//            }
//            int length = numbers.size();
//            arr = numbers.toArray(new Integer[length][j]);
//            myArray = entityFactory.makeNewIntArray((Integer[][]) arr);
//
//
//        } else if(in.hasNextDouble()) {
//            List<Double> numbers = new ArrayList<Double>();
//            while (in.hasNextDouble()) {
//                numbers.add(in.nextDouble());
//            }
//            int length = numbers.size();
//            arr = numbers.toArray(new Double[length][j]);
//            myArray = entityFactory.makeNewDoubleArray((Double[][]) arr);
//        }
//        in.close();
//        return myArray;
//    }

