package by.gbyzzz.task02javaarrays.dal;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * This class reads data from a txt file and converts it to the
 * type specified in the arg.
 * @author Anton Pinchuk
 *
 */

public final class FileIO {
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
//
//    Scanner sc = new Scanner(fr);
//
//
//
//
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
//    }
}

