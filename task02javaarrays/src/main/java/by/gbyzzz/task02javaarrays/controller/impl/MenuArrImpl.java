package by.gbyzzz.task02javaarrays.controller.impl;

import by.gbyzzz.task02javaarrays.controller.command.Command;
import by.gbyzzz.task02javaarrays.view.MenuText;

public class MenuArrImpl implements Command {
    @Override
    public void execute() {
        MenuText menuText = new MenuText();
        menuText.arrayMenu();

    }
}
