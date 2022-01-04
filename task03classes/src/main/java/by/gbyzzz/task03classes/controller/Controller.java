package by.gbyzzz.task03classes.controller;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.controller.command.Command;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Controller {
    private static final Logger LOGGER = LogManager.getLogger();
    private final CommandProvider provider = new CommandProvider();
    private MenuSelection menuSelection;
    public void execute(final int[] select, Bouquet bouquet) {
        Command executionCommand;
        executionCommand = provider.getCommand(select);
        LOGGER.trace("Executing selected task");
        executionCommand.execute(bouquet);

    }
}