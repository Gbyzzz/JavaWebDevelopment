package by.gbyzzz.task03classes.controller.impl;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.controller.command.Command;
import by.gbyzzz.task03classes.services.factory.ServiceFactory;
import by.gbyzzz.task03classes.view.IOData;
import by.gbyzzz.task03classes.view.MessageManager;
import by.gbyzzz.task03classes.view.factory.ViewFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FindFlowerByStemLengthImpl implements Command {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void execute(Bouquet bouquet) {
        MessageManager current = MessageManager.setLocale();
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData = viewFactory.getIoData();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ioData.output(current.getString("minStemStr"));
        LOGGER.trace("Getting input from user");
        String min = String.valueOf(ioData.input().next());
        ioData.output(current.getString("maxStemStr"));
        LOGGER.trace("Getting input from user");
        String max = String.valueOf(ioData.input().next());
        LOGGER.trace("Looking for flowers according to stem length range and output them in console");
        ioData.output(serviceFactory.getFindFlowerByStemLength().find(bouquet.getFlowers(), min, max));
    }
}