package by.gbyzzz.task01javalinear.controller.menu;

import by.gbyzzz.task01javalinear.view.MenuText;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static by.gbyzzz.task01javalinear.controller.menu.BackMenu.io;

/**
 * This class shows menu to the user and calls other classes' instances and its methods according to users choice.
 * @author Anton Pinchuk
 *
 */

public final class StartMenu {
    private static final int SELECT_ONE = 1;
    private static final int SELECT_TWO = 2;
    private static final int SELECT_THREE = 3;
    private static final int SELECT_FOUR = 4;
    private static final int SELECT_FIVE = 5;

    private static final Logger LOGGER = LogManager.getLogger();

    public void start() {
        LOGGER.trace("Executing StartMenu.start");

        TaskExec taskExec;
        BackMenu backMenu = new BackMenu();

        MenuText menuText = new MenuText();
        menuText.mainMenu();
        int[] select = new int[3];
        select[0] = io.input("range", 1, 5);
        LOGGER.trace("User selected task part " + select[0]);
        switch (select[0]) {
            case SELECT_FIVE:
                LOGGER.trace("Exiting application");
                System.exit(0);
            case SELECT_ONE:
                menuText.taskOneMenu();
                select[1] = io.input("range", 1, 6);
                if (select[1] == 6) {
                    LOGGER.trace("Exiting application");
                    System.exit(0);
                }
                LOGGER.debug("User selected task " + select[1]);
                menuText.sourceMenu();
                select[2] = io.input("range", 1, 4);
                LOGGER.debug("User selected source from menu " + select[2]);
                taskExec = new PartOneExec();
                LOGGER.debug("Starting task " + select[1] + " from part one with source argument " + select[2]);
                taskExec.start(select[1], select[2]);
                LOGGER.debug("Opening  Back Menu" + select[2]);
                backMenu.start();
            case SELECT_TWO:
                menuText.taskTwoMenu();
                select[1] = io.input("range", 1, 6);
                if (select[1] == 6) {
                    LOGGER.trace("Exiting application");
                    System.exit(0);
                }
                LOGGER.debug("User selected task " + select[1]);
                menuText.sourceMenu();
                select[2] = io.input("range", 1, 4);
                LOGGER.debug("User selected source from menu " + select[2]);
                taskExec = new PartTwoExec();
                LOGGER.debug("Starting task " + select[1] + " from part two with source argument " + select[2]);
                taskExec.start(select[1], select[2]);
                LOGGER.debug("Opening  Back Menu" + select[2]);
                backMenu.start();
            case SELECT_THREE:
                menuText.taskThreeMenu();
                select[1] = io.input("range", 1, 6);
                if (select[1] == 6) {
                    LOGGER.trace("Exiting application");
                    System.exit(0);
                }
                LOGGER.debug("User selected task " + select[1]);
                menuText.sourceMenu();
                select[2] = io.input("range", 1, 4);
                LOGGER.debug("User selected source from menu " + select[2]);
                taskExec = new PartThreeExec();
                LOGGER.debug("Starting task " + select[1] + " from part three with source argument " + select[2]);
                taskExec.start(select[1], select[2]);
                LOGGER.debug("Opening  Back Menu" + select[2]);
                backMenu.start();
            case SELECT_FOUR:
                menuText.additionalTask();
                select[1] = io.input("range", 1, 4);
                if (select[1] == 4) {
                    LOGGER.trace("Exiting application");
                    System.exit(0);
                }
                LOGGER.debug("User selected task " + select[1]);
                menuText.sourceMenu();
                select[2] = io.input("range", 1, 4);
                LOGGER.debug("User selected source from menu " + select[2]);
                taskExec = new AdditionalTaskExec();
                LOGGER.debug("Starting task " + select[1] + " from part three with source argument " + select[2]);
                taskExec.start(select[1], select[2]);
                LOGGER.debug("Opening  Back Menu" + select[2]);
                backMenu.start();
            default: break;
        }
        }
    }

