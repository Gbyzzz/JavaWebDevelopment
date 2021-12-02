package by.gbyzzz.task01javalinear.controller.menu;

import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.controller.taskthreeimpl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TaskThreeMenuExec implements TaskMenu {

   private static final Logger LOGGER = LogManager.getLogger();

   Command command;

    @Override
    public void start(int taskSelect, int sourceSelect) {
        LOGGER.trace("Executing TaskThreeMenu method start");
        switch (taskSelect) {
            case 1:
                command = new RowOfNums();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 2:
                command = new SumMinMax();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 3:
                command = new Guess();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 4:
                command = new RowMultiply();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 5:command = new MultiplyTable();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 6:
                LOGGER.trace("Exiting application");
                System.exit(1);
        }
    }
}
