package by.gbyzzz.task01javalinear.controller.menu;

import by.gbyzzz.task01javalinear.view.Menu;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static by.gbyzzz.task01javalinear.controller.menu.BackMenu.io;

public class StartMenu {

    private static final Logger LOGGER = LogManager.getLogger();

    public void start() {
        LOGGER.trace("Executing StartMenu.start");

        TaskMenu taskMenu;
        BackMenu backMenu = new BackMenu();

        Menu menu = new Menu();
        menu.mainMenu();
        int[] select = new int[3];
        select[0] = io.input("range", 1, 4);
        LOGGER.trace("User selected task part " + select[0]);
        switch (select[0]) {
            case 4:{
                LOGGER.trace("Exiting application");
                System.exit(0);}
            case 1:{
                menu.taskOneMenu();
                select[1] = io.input("range", 1, 6);
                LOGGER.debug("User selected task " + select[1]);
                menu.sourceMenu();
                select[2] = io.input("range", 1, 4);
                LOGGER.debug("User selected source from menu " + select[2]);
                LOGGER.debug("Starting task " + select[1] + " from part one with source argument " + select[2]);
                taskMenu = new TaskOneMenuExec();
                taskMenu.start(select[1], select[2]);
                backMenu.start();}
            case 2:{
                menu.taskTwoMenu();
                select[1] = io.input("range", 1, 6);
                LOGGER.debug("User selected task " + select[1]);
                menu.sourceMenu();
                select[2] = io.input("range", 1, 4);
                LOGGER.debug("User selected source from menu " + select[2]);
                taskMenu = new TaskTwoMenuExec();
                taskMenu.start(select[1], select[2]);
                LOGGER.debug("Starting task " + select[1] + " from part two with source argument " + select[2]);
                backMenu.start();}
            case 3:{
                menu.taskThreeMenu();
                select[1] = io.input("range", 1, 6);
                LOGGER.debug("User selected task " + select[1]);
                menu.sourceMenu();
                select[2] = io.input("range", 1, 4);
                LOGGER.debug("User selected source from menu " + select[2]);
                taskMenu = new TaskThreeMenuExec();
                taskMenu.start(select[1], select[2]);
                LOGGER.debug("Starting task " + select[1] + " from part three with source argument " + select[2]);
                backMenu.start();}
            default: break;
        }
        }
    }

