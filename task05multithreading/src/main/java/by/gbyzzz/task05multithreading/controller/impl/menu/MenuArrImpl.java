package by.gbyzzz.task05multithreading.controller.impl.menu;

import by.gbyzzz.task05multithreading.controller.command.Command;
import by.gbyzzz.task05multithreading.view.MenuText;

public class MenuArrImpl implements Command {
    @Override
    public void execute() {
        MenuText menuText = new MenuText();
        menuText.arrayMenu();

    }
}
