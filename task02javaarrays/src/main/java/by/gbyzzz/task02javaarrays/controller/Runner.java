package by.gbyzzz.task02javaarrays.controller;

import by.gbyzzz.task02javaarrays.service.ValidatorService;
import by.gbyzzz.task02javaarrays.service.factory.ServiceFactory;
import by.gbyzzz.task02javaarrays.view.IOData;
import by.gbyzzz.task02javaarrays.view.MenuText;
import by.gbyzzz.task02javaarrays.view.factory.ViewFactory;

public class Runner {

    public static void main(String[] args) {
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData =  viewFactory.getIoData();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ValidatorService validatorService = serviceFactory.getValidatorService();
        Controller controller = new Controller();
        MenuText menuText = new MenuText();
        int[] select = {0 ,0};
        int back;

        while (true) {

        menuText.mainMenu();
        select[0] = validatorService.rangeInt(ioData.input(), MenuSelection.SELECT_ONE.value, MenuSelection.SELECT_THREE.value);
        controller.execute(select);
            if (select[0] ==1) {
                select[1] = validatorService.rangeInt(ioData.input(), MenuSelection.SELECT_ONE.value, MenuSelection.SELECT_NINE.value);
            } else {
                select[1] = validatorService.rangeInt(ioData.input(), MenuSelection.SELECT_ONE.value, MenuSelection.SELECT_SEVEN.value);
            }
        controller.execute(select);
        menuText.backMenu();
        back = validatorService.rangeInt(ioData.input(), MenuSelection.SELECT_ONE.value, MenuSelection.SELECT_TWO.value);
        if(back == 2){
            System.exit(0);
        }
        select[0] = 0;
        select[1] = 0;

        }

    }

}
