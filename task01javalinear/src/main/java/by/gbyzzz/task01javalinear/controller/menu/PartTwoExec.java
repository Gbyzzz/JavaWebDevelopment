package by.gbyzzz.task01javalinear.controller.menu;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.controller.tasktwoimpl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class executes the task which user chose in start menu from part 2.
 * @author Anton Pinchuk
 *
 */

public final class PartTwoExec implements TaskExec {

    private static final Logger LOGGER = LogManager.getLogger();

    private Command command;

    @Override
    public void start(final int taskSelect, final int sourceSelect) {
        LOGGER.trace("Executing TaskThreeMenu method start");
        LOGGER.debug("Executing task %d method input form source %d", sourceSelect, taskSelect);
        switch (taskSelect) {
            case 1:
                command = new PositiveNumCount();
                command.exec(sourceSelect);
                break;
            case 2:
                command = new CompareTwoNums();
                command.exec(sourceSelect);
                break;
            case 3:
                command = new PassOrNot();
                command.exec(sourceSelect);
                break;
            case 4:
                command = new TaskWithTwoNums();
                command.exec(sourceSelect);
                break;
            case 5:
                command = new CompareWithThree();
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
