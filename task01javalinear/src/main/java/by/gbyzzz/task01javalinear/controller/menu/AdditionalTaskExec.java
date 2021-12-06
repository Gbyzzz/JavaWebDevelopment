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

    private static final Logger LOGGER = LogManager.getLogger();

    private Command command;
    @Override
    public void start(final int taskSelect, final int sourceSelect) {
        LOGGER.trace("Executing AdditionalTask method start");
        LOGGER.debug("Executing task %d method input form source %d", sourceSelect, taskSelect);
        switch (taskSelect) {
            case 1:
                command = new SwitchTwoNumsBuff();
                command.exec(sourceSelect);
                break;
            case 2:
                command = new SwitchTwoNumsArithm();
                command.exec(sourceSelect);
                break;
            case 3:
                command = new SwitchTwoNumsxXOR();
                command.exec(sourceSelect);
                break;
            case 4:
                LOGGER.trace("Exiting application");
                System.exit(0);
            default:
                break;
        }
    }
}
