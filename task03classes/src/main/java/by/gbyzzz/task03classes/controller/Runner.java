package by.gbyzzz.task03classes.controller;

import by.gbyzzz.task03classes.beans.AllGoods;
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

        serviceFactory.getDateGeneratorService().generateData(100, 50, 10, "Test");
        System.out.println(AllGoods.getGenerator());
        serviceFactory.getWriteJSON().JsonIO("flower_shop.json");
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
            while (select[1] != 3) {
                menuText.bouquetMenu();
                select[1] = validatorService.rangeInt(ioData.input(), menuSelection.getValue(MenuSelection.SELECT_ONE), menuSelection.getValue(MenuSelection.SELECT_FOUR));
                if (select[1] == 4) {
                    System.exit(0);
                }else if (select[1] != 3){
                controller.execute(select, bouquet);}
            }
        }

    }

}