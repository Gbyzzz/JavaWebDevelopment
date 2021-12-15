package by.gbyzzz.task02javaarrays.controller.impl.menu;

import by.gbyzzz.task02javaarrays.controller.command.Command;
import by.gbyzzz.task02javaarrays.view.MenuText;

public class MenuMatrixImpl  implements Command {
    @Override
    public void execute() {
        MenuText menuText = new MenuText();
        menuText.matrixMenu();

    }
}