package by.gbyzzz.task05multithreading.controller;

import by.gbyzzz.task05multithreading.service.ValidatorService;
import by.gbyzzz.task05multithreading.service.factory.ServiceFactory;
import by.gbyzzz.task05multithreading.view.IOData;
import by.gbyzzz.task05multithreading.view.MenuText;
import by.gbyzzz.task05multithreading.view.factory.ViewFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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
        int[] select = {0, 0};
        int back;

        while (true) {
            LOGGER.trace("Starting main menu");
        menuText.mainMenu();
            LOGGER.trace("getting input from user in main menu");

        select[0] = validatorService.rangeInt(ioData.input(), menuSelection.getValue(MenuSelection.SELECT_ONE), menuSelection.getValue(MenuSelection.SELECT_FIVE));
            if (select[0] == 4) {
                ExecutorService executorService = Executors.newFixedThreadPool(4);
                for(int i = 0; i < 1000; i++) {
                    executorService.execute(new UserInput());
                }
                executorService.shutdown();
                try {
                    executorService.awaitTermination(10, TimeUnit.SECONDS);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                } else {
                controller.execute(select);
                if (select[0] == 1) {
                    select[1] = validatorService.rangeInt(ioData.input(), menuSelection.getValue(MenuSelection.SELECT_ONE), menuSelection.getValue(MenuSelection.SELECT_NINE));
                } else if (select[0] == 2) {
                    select[1] = validatorService.rangeInt(ioData.input(), menuSelection.getValue(MenuSelection.SELECT_ONE), menuSelection.getValue(MenuSelection.SELECT_SEVEN));
                } else {
                    select[1] = validatorService.rangeInt(ioData.input(), menuSelection.getValue(MenuSelection.SELECT_ONE), menuSelection.getValue(MenuSelection.SELECT_SEVEN));
                }

                controller.execute(select);
                menuText.backMenu();
                back = validatorService.rangeInt(ioData.input(), menuSelection.getValue(MenuSelection.SELECT_ONE), menuSelection.getValue(MenuSelection.SELECT_TWO));
                if (back == 2) {
                    System.exit(0);
                }
            }
        select[0] = 0;
        select[1] = 0;

        }

    }

}
