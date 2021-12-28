package by.gbyzzz.task03classes.controller;

import by.gbyzzz.task03classes.dal.FileIOFactory;
import by.gbyzzz.task03classes.dal.FileIOInterface;

public class Runner {
    public static void main(String[] args) {

        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        FileIOInterface fileIO = fileIOFactory.getFileIO();
        System.out.println(fileIO.parseJSON("flowers.json"));
    }
}
