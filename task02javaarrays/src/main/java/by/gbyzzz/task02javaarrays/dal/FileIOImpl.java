package by.gbyzzz.task02javaarrays.dal;

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

    public Number[] fileReadArray(String str){

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 200);
        Scanner in = new Scanner(bufferedInputStream);

        Number[] arr = null;
        if(in.hasNextDouble()) {
            List<Double> numbers = new ArrayList<Double>();
            while (in.hasNextDouble()) {
                numbers.add(in.nextDouble());
            }
            int length = numbers.size();
            arr = numbers.toArray(new Double[length]);
        }else if(in.hasNextInt()) {
            List<Integer> numbers = new ArrayList<Integer>();
            while (in.hasNextInt()) {
                numbers.add(in.nextInt());
            }
            int length = numbers.size();
            arr = numbers.toArray(new Integer[length]);
        }

        return arr;
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

//    private static final Logger LOGGER = LogManager.getLogger();
//
//
//    public Data readFile(final String arg) {
//        FileReader fr = null;
//        Data res = new Data();
//        try {
//            fr = new FileReader("C:\\Java\\MyWorkSpace\\task01javalinear\\src\\main\\resources\\data\\numbers.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//    Scanner sc = new Scanner(fr);
//
//        switch (arg) {
//            case "int":
//                while (sc.hasNextLine()) {
//                    res.add(Integer.parseInt(sc.nextLine()));
//                }
//                break;
//
//            case "double":
//                while (sc.hasNextLine()) {
//                    res.add(Double.parseDouble(sc.nextLine()));
//                }
//                break;
//
//            default:
//                break;
//        }
//        try {
//            fr.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return res;
