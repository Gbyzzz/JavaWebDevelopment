package by.gbyzzz.task01javalinear.controller.menu;


import by.gbyzzz.task01javalinear.view.IOData;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class BackMenu {
    static IOData io = new IOData();
    static StartMenu startMenu = new StartMenu();
    public void start() throws IOException, ParserConfigurationException, SAXException {


        io.output("");
        io.output("1. Return to main menu");
        io.output("2. Exit");
        int select = io.input("range",1,2);
        if(select == 1) {
            startMenu.start();
        }
        else {
            System.exit(0);
        }
    }
}
