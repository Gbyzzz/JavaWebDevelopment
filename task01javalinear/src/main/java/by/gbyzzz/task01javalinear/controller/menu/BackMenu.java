package by.gbyzzz.task01javalinear.controller.menu;


import by.gbyzzz.task01javalinear.view.IOData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BackMenu {
    private static final Logger LOGGER = LogManager.getLogger();
    static IOData io = new IOData();
    static StartMenu startMenu = new StartMenu();
    public void start() {


        io.output("");
        io.output("1. Return to main menu");
        io.output("2. Exit");
        int select = io.input("range",1,2);
        if(select == 1) {
            startMenu.start();
        }
        else {
            LOGGER.trace("Exiting application");
            System.exit(0);
        }
    }
}
