package by.gbyzzz.task03classes.controller.impl;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.controller.command.Command;
import by.gbyzzz.task03classes.services.factory.ServiceFactory;
import by.gbyzzz.task03classes.view.IOData;
import by.gbyzzz.task03classes.view.MessageManager;
import by.gbyzzz.task03classes.view.factory.ViewFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SortBouquetByCutDateImpl implements Command {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void execute(Bouquet bouquet) {
        MessageManager current = MessageManager.setLocale();
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData = viewFactory.getIoData();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        LOGGER.trace("Sorting list of flowers from bouquet by cut date");
        serviceFactory.getSortBouquetByCutDate().sort(bouquet.getFlowers());
        ioData.output(bouquet);
    }
}
