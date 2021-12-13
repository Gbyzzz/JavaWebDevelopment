package by.gbyzzz.task01javalinear.controller.menu;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.controller.taskthreeimpl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class executes the task which user chose in start menu from part 3.
 * @author Anton Pinchuk
 *
 */

public final class PartThreeExec implements TaskExec {
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
        LOGGER.trace("Executing TaskThreeMenu method start");
        LOGGER.debug("Executing task %d method input form source %d", sourceSelect, taskSelect);
        switch (taskSelect) {
            case SELECT_ONE:
                command = new RowOfNums();
                command.exec(sourceSelect);
                break;
            case SELECT_TWO:
                command = new SumMinMax();
                command.exec(sourceSelect);
                break;
            case SELECT_THREE:
                command = new Guess();
                command.exec(sourceSelect);
                break;
            case SELECT_FOUR:
                command = new RowMultiply();
                command.exec(sourceSelect);
                break;
            case SELECT_FIVE:
                command = new MultiplyTable();
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
