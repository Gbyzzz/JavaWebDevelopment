package by.gbyzzz.task03classes.controller.impl;

import by.gbyzzz.task03classes.controller.command.Command;
import by.gbyzzz.task03classes.services.factory.ServiceFactory;
import by.gbyzzz.task03classes.view.IOData;
import by.gbyzzz.task03classes.view.MessageManager;
import by.gbyzzz.task03classes.view.factory.ViewFactory;

public class SortBouquetByCutDateImpl implements Command {
    @Override
    public void execute() {
        MessageManager current = MessageManager.setLocale();
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData = viewFactory.getIoData();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ioData.output(current.getString("freshnessInput"));
        String input = String.valueOf(ioData.input());
//        ioData.output(serviceFactory.getFindFlowerByFreshness().find(bouquet, input));
    }
}
