package by.gbyzzz.task01javalinear.controller.menu;


import by.gbyzzz.task01javalinear.controller.Command;
import by.gbyzzz.task01javalinear.controller.tasktwoimpl.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TaskTwoMenuExec implements TaskMenu {

    private static final Logger LOGGER = LogManager.getLogger();

    Command command;

    @Override
    public void start(int taskSelect, int sourceSelect) {
        LOGGER.trace("Executing TaskThreeMenu method start");
        switch (taskSelect) {
            case 1:
                command = new PositiveNumCount();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 2:
                command = new CompareTwoNums();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 3:
                command = new PassOrNot();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 4:
                command = new TaskWithTwoNums();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 5:
                command = new CompareWithThree();
                LOGGER.debug("Executing task " + taskSelect + " method input form source "+ sourceSelect);
                command.exec(sourceSelect);
                break;
            case 6:
                LOGGER.trace("Exiting application");
                System.exit(1);
        }
    }
}
