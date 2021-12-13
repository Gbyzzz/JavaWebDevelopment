package by.gbyzzz.task02javaarrays.controller;

import by.gbyzzz.task02javaarrays.controller.command.Command;

public final class Controller {
    private final CommandProvider provider = new CommandProvider();
    public void execute(int select){
        Command executionCommand;
        executionCommand = provider.getCommand(select);
        String response;
        executionCommand.execute();

    }
}