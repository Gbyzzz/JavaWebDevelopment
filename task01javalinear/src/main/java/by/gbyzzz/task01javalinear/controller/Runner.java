package by.gbyzzz.task01javalinear.controller;

import by.gbyzzz.task01javalinear.controller.menu.StartMenu;
import by.gbyzzz.task01javalinear.controller.taskoneimpl.Triangle;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Runner {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.trace("Launching application");
//        try{
        StartMenu startMenu = new StartMenu();
        startMenu.start();
//        }
//        catch(Throwable t) {
//            logger.error("Can't start menu");
//        }
    }
}
