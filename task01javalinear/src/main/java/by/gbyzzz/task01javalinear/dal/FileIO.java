package by.gbyzzz.task01javalinear.dal;

import by.gbyzzz.task01javalinear.entity.Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
    private static final Logger LOGGER = LogManager.getLogger();


    public Data readFile(String arg) {
        FileReader fr = null;
        Data res = new Data();
        try {
            fr = new FileReader("C:\\Java\\MyWorkSpace\\task01javalinear\\src\\main\\resources\\data\\numbers.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    Scanner sc = new Scanner(fr);





        switch (arg) {
            case "int":
                while (sc.hasNextLine()) {
                    res.add(Integer.parseInt(sc.nextLine()));
                }
                break;

            case "double": {
                while (sc.hasNextLine()) {
                    res.add(Double.parseDouble(sc.nextLine()));
                }
                break;
            }
            default:
                break;
        }
        try {
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
}

