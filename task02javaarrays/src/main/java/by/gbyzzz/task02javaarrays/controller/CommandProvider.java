package by.gbyzzz.task02javaarrays.controller;

import by.gbyzzz.task02javaarrays.controller.command.Command;
import by.gbyzzz.task02javaarrays.controller.impl.BubbleSortImpl;
import by.gbyzzz.task02javaarrays.controller.impl.InsertSortImpl;
import by.gbyzzz.task02javaarrays.controller.impl.MenuArrImpl;
import by.gbyzzz.task02javaarrays.controller.impl.MenuMatrixImpl;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {
        private final Map<CommandName, Command> repository = new HashMap<>();
        CommandProvider(){
            repository.put(CommandName.MENU_ARR, new MenuArrImpl());
            repository.put(CommandName.MENU_MATRIX, new MenuMatrixImpl());
            repository.put(CommandName.BUBBLE_SORT, new BubbleSortImpl());
            repository.put(CommandName.SHAKE_SORT, new InsertSortImpl());
            repository.put(CommandName.SELECT_SORT, new InsertSortImpl());
            repository.put(CommandName.INSERT_SORT, new InsertSortImpl());
            repository.put(CommandName.MERGE_SORT, new InsertSortImpl());
            repository.put(CommandName.SHELL_SORT, new InsertSortImpl());
        }
    Command getCommand(int[] select){
        CommandName commandName =null;
        Command command = null;

            commandName = CommandName.getValue(select);
            command = repository.get(commandName);

        return command;
    }
}
