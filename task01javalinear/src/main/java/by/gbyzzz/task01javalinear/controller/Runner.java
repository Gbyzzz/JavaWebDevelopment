package by.gbyzzz.task01javalinear.controller;

import by.gbyzzz.task01javalinear.controller.menu.StartMenu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * main method starting program, creates instance of StartMenu and calls method start
 * @author Anton Pinchuk
 *
 */

public class Runner {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {
        logger.trace("Launching application");
//        try{
        StartMenu startMenu = new StartMenu();
        startMenu.start();
//        }
//        catch(Exception e) {
//            logger.error("Can't start menu");
//        }
    }
}
