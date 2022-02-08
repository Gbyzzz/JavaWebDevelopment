package by.gbyzzz.task05multithreading.controller.impl.menu;

import by.gbyzzz.task05multithreading.controller.command.Command;
import by.gbyzzz.task05multithreading.view.MenuText;

public class MenuMatrixImpl  implements Command {
    @Override
    public void execute() {
        MenuText menuText = new MenuText();
        menuText.matrixMenu();

    }
}