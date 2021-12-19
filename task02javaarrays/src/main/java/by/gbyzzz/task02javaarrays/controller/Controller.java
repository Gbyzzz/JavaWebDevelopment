package by.gbyzzz.task02javaarrays.controller;

import by.gbyzzz.task02javaarrays.controller.command.Command;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Controller {
    private static final Logger LOGGER = LogManager.getLogger();
    private final CommandProvider provider = new CommandProvider();
    public void execute(int[] select){
        if (select[0] == 3 && select[1] == 0
                ||select[0] == 1 && select[1] == 9
                || select[0] == 2 && select[1] == 7) {
            LOGGER.trace("Exiting application");
            System.exit(0);
        }
        Command executionCommand;
        executionCommand = provider.getCommand(select);
        LOGGER.trace("Executing selected task");
        executionCommand.execute();

    }
}