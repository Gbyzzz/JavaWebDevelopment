package by.gbyzzz.task01javalinear.controller.menu;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.controller.taskoneimpl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class executes the task which user chose in start menu from part 1.
 * @author Anton Pinchuk
 *
 */

public final class PartOneExec implements TaskExec {
    private static final int SELECT_ONE = 1;
    private static final int SELECT_TWO = 2;
    private static final int SELECT_THREE = 3;
    private static final int SELECT_FOUR = 4;
    private static final int SELECT_FIVE = 5;
    private static final int SELECT_SIX = 6;

    private static final Logger LOGGER = LogManager.getLogger();

    private Command command;
    @Override
    public void start(final int taskSelect, final int sourceSelect) {
        LOGGER.trace("Executing TaskOneMenu method start");
        LOGGER.debug("Executing task %d method input form source %d", sourceSelect, taskSelect);
        switch (taskSelect) {
            case SELECT_ONE:
                command = new Triangle();
                command.exec(sourceSelect);
                break;
            case SELECT_TWO:
                command = new Average();
                command.exec(sourceSelect);
                break;
            case SELECT_THREE:
                command = new Boat();
                command.exec(sourceSelect);
                break;
            case SELECT_FOUR:
                command = new AverageCubed();
                command.exec(sourceSelect);
                break;
            case SELECT_FIVE:
                command = new Expression();
                command.exec(sourceSelect);
                break;
            case SELECT_SIX:
                LOGGER.trace("Exiting application");
                System.exit(0);
            default:
                break;
        }
    }
}


