package by.gbyzzz.task01javalinear.controller.menu;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.controller.additionaltaskimpl.SwitchTwoNumsArithm;
import by.gbyzzz.task01javalinear.controller.additionaltaskimpl.SwitchTwoNumsBuff;
import by.gbyzzz.task01javalinear.controller.additionaltaskimpl.SwitchTwoNumsxXOR;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class executes the task which user chose in start menu from additional task.
 * @author Anton Pinchuk
 *
 */

public final class AdditionalTaskExec implements TaskExec {
    private static final int SELECT_ONE = 1;
    private static final int SELECT_TWO = 2;
    private static final int SELECT_THREE = 3;
    private static final int SELECT_FOUR = 4;

    private static final Logger LOGGER = LogManager.getLogger();

    private Command command;
    @Override
    public void start(final int taskSelect, final int sourceSelect) {
        LOGGER.trace("Executing AdditionalTask method start");
        LOGGER.debug("Executing task %d method input form source %d", sourceSelect, taskSelect);
        switch (taskSelect) {
            case SELECT_ONE:
                command = new SwitchTwoNumsBuff();
                command.exec(sourceSelect);
                break;
            case SELECT_TWO:
                command = new SwitchTwoNumsArithm();
                command.exec(sourceSelect);
                break;
            case SELECT_THREE:
                command = new SwitchTwoNumsxXOR();
                command.exec(sourceSelect);
                break;
            case SELECT_FOUR:
                LOGGER.trace("Exiting application");
                System.exit(0);
            default:
                break;
        }
    }
}
