package by.gbyzzz.task02javaarrays.controller;

import by.gbyzzz.task02javaarrays.controller.command.Command;
import by.gbyzzz.task02javaarrays.controller.impl.array.*;
import by.gbyzzz.task02javaarrays.controller.impl.matrix.*;
import by.gbyzzz.task02javaarrays.controller.impl.menu.MenuArrImpl;
import by.gbyzzz.task02javaarrays.controller.impl.menu.MenuMatrixImpl;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {
        private final Map<CommandName, Command> repository = new HashMap<>();
        CommandProvider(){
            repository.put(CommandName.MENU_ARR, new MenuArrImpl());
            repository.put(CommandName.MENU_MATRIX, new MenuMatrixImpl());
            repository.put(CommandName.BUBBLE_SORT, new BubbleSortImpl());
            repository.put(CommandName.SHAKE_SORT, new ShakeSortImpl());
            repository.put(CommandName.SELECT_SORT, new SelectSortImpl());
            repository.put(CommandName.INSERT_SORT, new InsertSortImpl());
            repository.put(CommandName.MERGE_SORT, new MergeSortImpl());
            repository.put(CommandName.SHELL_SORT, new ShellSortImpl());
            repository.put(CommandName.MATRIX_ADDITION, new AdditionImpl());
            repository.put(CommandName.MATRIX_SUBTRACTION, new SubtractionImpl());
            repository.put(CommandName.MATRIX_MULTIPLICATION, new MultiplicationImpl());
            repository.put(CommandName.MATRIX_EXPONENTIATION, new ExponentationImpl());
            repository.put(CommandName.MATRIX_MULTIPLICATION_NUM, new MultiplicationOnNumImpl());
            repository.put(CommandName.MATRIX_TRANSPOSE, new TransposeImpl());
        }
    Command getCommand(int[] select){

        CommandName commandName =null;
        Command command = null;

            commandName = CommandName.getValue(select);
            command = repository.get(commandName);

        return command;
    }
}
