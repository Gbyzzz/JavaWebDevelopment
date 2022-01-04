package by.gbyzzz.task03classes.controller;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.services.ValidatorService;
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
        ValidatorService validatorService = serviceFactory.getValidatorService();
        Controller controller = new Controller();
        MenuText menuText = new MenuText();

        serviceFactory.getParseJSON().JsonIO("flower_shop.json");

        int[] select = {0, 0};
        int back;

        while (true) {
            LOGGER.trace("Starting main menu");
            menuText.bouquetMakeMenu();
            LOGGER.trace("getting input from user in main menu");
            select[0] = validatorService.rangeInt(ioData.input(), menuSelection.getValue(MenuSelection.SELECT_ONE), menuSelection.getValue(MenuSelection.SELECT_FOUR));
            if(select[0] == 4){
                System.exit(0);
            }
            Bouquet bouquet = new Bouquet();
            controller.execute(select, bouquet);
            select[0] = 0;
            menuText.bouquetMenu();
            select[1] = validatorService.rangeInt(ioData.input(), menuSelection.getValue(MenuSelection.SELECT_ONE), menuSelection.getValue(MenuSelection.SELECT_THREE));
            if(select[1] == 3){
                System.exit(0);
            }
            controller.execute(select, bouquet);
            menuText.backMenu();
            back = validatorService.rangeInt(ioData.input(), menuSelection.getValue(MenuSelection.SELECT_ONE), menuSelection.getValue(MenuSelection.SELECT_TWO));
            if (back == 2) {
                System.exit(0);
            }
            select[1] = 0;
        }

    }

}