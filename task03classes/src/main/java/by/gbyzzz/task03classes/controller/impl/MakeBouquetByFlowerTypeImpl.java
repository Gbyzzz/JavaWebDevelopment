package by.gbyzzz.task03classes.controller.impl;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.controller.command.Command;
import by.gbyzzz.task03classes.services.factory.ServiceFactory;
import by.gbyzzz.task03classes.view.IOData;
import by.gbyzzz.task03classes.view.MessageManager;
import by.gbyzzz.task03classes.view.factory.ViewFactory;

public class MakeBouquetByFlowerTypeImpl implements Command {
    @Override
    public void execute(Bouquet bouquet) {
        MessageManager current = MessageManager.setLocale();
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData = viewFactory.getIoData();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ioData.output(current.getString("flowerTypeInputStr"));
        String flower = String.valueOf(ioData.input().next());
        ioData.output(current.getString("accessoryTypeStr"));
        String accessory = String.valueOf(ioData.input().next());
        serviceFactory.getMakeBouquetByFlowerType().makeBouquet(bouquet, flower, accessory);
        ioData.output(bouquet);
    }
}
