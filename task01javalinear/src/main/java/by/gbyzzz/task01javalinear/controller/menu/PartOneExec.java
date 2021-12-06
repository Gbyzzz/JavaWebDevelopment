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

    private static final Logger LOGGER = LogManager.getLogger();

    private Command command;
    @Override
    public void start(final int taskSelect, final int sourceSelect) {
        LOGGER.trace("Executing TaskOneMenu method start");
        LOGGER.debug("Executing task %d method input form source %d", sourceSelect, taskSelect);
        switch (taskSelect) {
            case 1:
                command = new Triangle();
                command.exec(sourceSelect);
                break;
            case 2:
                command = new Average();
                command.exec(sourceSelect);
                break;
            case 3:
                command = new Boat();
                command.exec(sourceSelect);
                break;
            case 4:
                command = new AverageCubed();
                command.exec(sourceSelect);
                break;
            case 5:
                command = new Expression();
                command.exec(sourceSelect);
                break;
            case 6:
                LOGGER.trace("Exiting application");
                System.exit(0);
            default:
                break;
        }
    }
}


