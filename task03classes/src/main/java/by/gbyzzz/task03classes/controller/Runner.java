package by.gbyzzz.task03classes.controller;

import by.gbyzzz.task03classes.services.factory.ServiceFactory;
import by.gbyzzz.task03classes.view.IOData;
import by.gbyzzz.task03classes.view.MenuText;
import by.gbyzzz.task03classes.view.factory.ViewFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Runner {
    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        LOGGER.trace("Launching application");
        MenuSelection menuSelection = null;
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData =  viewFactory.getIoData();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
//        ValidatorService validatorService = serviceFactory.getValidatorService();
        Controller controller = new Controller();
        MenuText menuText = new MenuText();
        int[] select = {0, 0};
        int back;
        serviceFactory.getParseJSON().parseJSON("flower_shop.json");

        while (true) {
            LOGGER.trace("Starting main menu");
        menuText.mainMenu();
            LOGGER.trace("getting input from user in main menu");
        select[0] = validatorService.rangeInt(ioData.input(), menuSelection.getValue(MenuSelection.SELECT_ONE), menuSelection.getValue(MenuSelection.SELECT_THREE));
        controller.execute(select);
            if (select[0] == 1) {
                select[1] = validatorService.rangeInt(ioData.input(), menuSelection.getValue(MenuSelection.SELECT_ONE), menuSelection.getValue(MenuSelection.SELECT_NINE));
            } else {
                select[1] = validatorService.rangeInt(ioData.input(), menuSelection.getValue(MenuSelection.SELECT_ONE), menuSelection.getValue(MenuSelection.SELECT_SEVEN));
            }
        controller.execute(select);
        menuText.backMenu();
        back = validatorService.rangeInt(ioData.input(), menuSelection.getValue(MenuSelection.SELECT_ONE), menuSelection.getValue(MenuSelection.SELECT_TWO));
        if (back == 2) {
            System.exit(0);
        }
        select[0] = 0;
        select[1] = 0;

        }

    }

}
