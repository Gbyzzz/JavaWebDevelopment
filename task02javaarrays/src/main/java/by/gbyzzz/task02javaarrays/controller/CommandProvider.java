package by.gbyzzz.task02javaarrays.controller;

import by.gbyzzz.task02javaarrays.controller.command.Command;
import by.gbyzzz.task02javaarrays.controller.impl.BubbleSortImpl;
import by.gbyzzz.task02javaarrays.controller.impl.InsertSortImpl;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {
        private final Map<CommandName, Command> repository = new HashMap<>();
        CommandProvider(){
            repository.put(CommandName.BUBBLE_SORT, new BubbleSortImpl());
            repository.put(CommandName.INSERT_SORT, new InsertSortImpl());
        }
    Command getCommand(int select){
        CommandName commandName =null;
        Command command = null;

            commandName = CommandName.getValue(select);
            command = repository.get(commandName);

        return command;
    }
}
