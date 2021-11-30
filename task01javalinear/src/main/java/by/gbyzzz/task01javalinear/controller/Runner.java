package by.gbyzzz.task01javalinear.controller;

import by.gbyzzz.task01javalinear.controller.menu.StartMenu;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Runner {

    public static void main(String[] args) throws IOException, ParserConfigurationException, SAXException {
        StartMenu startMenu = new StartMenu();
        startMenu.start();
    }
}
