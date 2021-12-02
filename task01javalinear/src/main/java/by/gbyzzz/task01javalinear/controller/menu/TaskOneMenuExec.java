package by.gbyzzz.task01javalinear.controller.menu;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.controller.taskoneimpl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class TaskOneMenuExec implements TaskMenu {

    private static final Logger LOGGER = LogManager.getLogger();

    Command command;
    @Override
    public void start(int taskSelect, int sourceSelect) {
        LOGGER.trace("Executing TaskOneMenu method start");
        switch (taskSelect) {
            case 1:
                command = new Triangle();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 2:
                command = new Average();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 3:
                command = new Boat();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 4:
                command = new AverageCubed();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 5:
                command = new Expression();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 6:
                LOGGER.trace("Exiting application");
                System.exit(1);
        }
    }
}


