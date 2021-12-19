package by.gbyzzz.task02javaarrays.controller;

import by.gbyzzz.task02javaarrays.controller.command.Command;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Controller {
    private static final Logger LOGGER = LogManager.getLogger();
    private final CommandProvider provider = new CommandProvider();
    private MenuSelection menuSelection;
    public void execute(final int[] select) {
        if (select[0] == menuSelection.getValue(MenuSelection.SELECT_THREE) && select[1] == 0
                || select[0] == menuSelection.getValue(MenuSelection.SELECT_ONE) && select[1] == menuSelection.getValue(MenuSelection.SELECT_NINE)
                || select[0] == menuSelection.getValue(MenuSelection.SELECT_TWO) && select[1] == menuSelection.getValue(MenuSelection.SELECT_SEVEN)) {
            LOGGER.trace("Exiting application");
            System.exit(0);
        }
        Command executionCommand;
        executionCommand = provider.getCommand(select);
        LOGGER.trace("Executing selected task");
        executionCommand.execute();

    }
}