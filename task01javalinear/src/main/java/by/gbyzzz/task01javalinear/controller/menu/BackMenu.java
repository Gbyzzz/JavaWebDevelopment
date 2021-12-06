package by.gbyzzz.task01javalinear.controller.menu;

import by.gbyzzz.task01javalinear.view.IOData;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * menu to ask user if he wants to return to start of the program or exit.
 * @author Anton Pinchuk
 *
 */

public final class BackMenu {
    private void backMenu() {
        //not called
    }
    private static final Logger LOGGER = LogManager.getLogger();
    static IOData io = new IOData();
    static StartMenu startMenu = new StartMenu();

     public static void start() {
        io.output("");
        io.output("1. Return to main menu");
        io.output("2. Exit");
        int select = io.input("range", 1, 2);
        if (select == 1) {
            startMenu.start();
        } else {
            LOGGER.trace("Exiting application");
            System.exit(0);
        }
    }
}
