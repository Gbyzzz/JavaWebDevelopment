package by.gbyzzz.task02javaarrays.controller;

import by.gbyzzz.task02javaarrays.service.ValidatorService;
import by.gbyzzz.task02javaarrays.service.factory.ValidatorFactory;
import by.gbyzzz.task02javaarrays.view.IOData;
import by.gbyzzz.task02javaarrays.view.MenuText;
import by.gbyzzz.task02javaarrays.view.factory.ViewFactory;

public class Runner {
    private static final int SELECT_ONE = 1;
    private static final int SELECT_TWO = 2;
    private static final int SELECT_THREE = 3;
    private static final int SELECT_EIGHT = 8;

    public static void main(String[] args) {
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData =  viewFactory.getIoData();
        ValidatorFactory validatorFactory = ValidatorFactory.getInstance();
        ValidatorService validatorService = validatorFactory.getValidatorService();
        MenuText menuText = new MenuText();
        int[] select = new int[3];

        while (true) {
        menuText.mainMenu();
        select[0] = validatorService.rangeInt(ioData.input(), SELECT_ONE, SELECT_THREE);
        switch (select[0]){
            case SELECT_ONE:
                menuText.arrayMenu();
                select[1] = validatorService.rangeInt(ioData.input(), SELECT_ONE, SELECT_EIGHT);
                break;
            case SELECT_TWO:
                menuText.matrixMenu();
                select[1] = validatorService.rangeInt(ioData.input(), SELECT_ONE, SELECT_EIGHT);
            case SELECT_THREE:
                System.exit(0);
        }
        }

    }

}
