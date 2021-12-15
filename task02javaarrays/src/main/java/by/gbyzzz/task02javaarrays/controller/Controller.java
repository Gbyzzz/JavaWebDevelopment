package by.gbyzzz.task02javaarrays.controller;

import by.gbyzzz.task02javaarrays.controller.command.Command;

public final class Controller {
    private final CommandProvider provider = new CommandProvider();
    public void execute(int[] select){
        if (select[0] == 3 && select[1] == 0
                ||select[0] == 1 && select[1] == 9
                || select[0] == 2 && select[1] == 7) {
            System.exit(0);
        }
        Command executionCommand;
        executionCommand = provider.getCommand(select);
        executionCommand.execute();

    }
}