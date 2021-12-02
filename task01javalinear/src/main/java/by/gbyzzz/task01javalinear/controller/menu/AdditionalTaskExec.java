package by.gbyzzz.task01javalinear.controller.menu;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.controller.additionaltaskimpl.SwitchTwoNumsArithm;
import by.gbyzzz.task01javalinear.controller.additionaltaskimpl.SwitchTwoNumsBuff;
import by.gbyzzz.task01javalinear.controller.additionaltaskimpl.SwitchTwoNumsxXOR;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdditionalTaskExec implements TaskExec {

    private static final Logger LOGGER = LogManager.getLogger();

    Command command;
    @Override
    public void start(int taskSelect, int sourceSelect) {
        LOGGER.trace("Executing AdditionalTask method start");
        switch (taskSelect) {
            case 1:
                command = new SwitchTwoNumsBuff();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 2:
                command = new SwitchTwoNumsArithm();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 3:
                command = new SwitchTwoNumsxXOR();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 6:
                LOGGER.trace("Exiting application");
                System.exit(1);
        }
    }
}
