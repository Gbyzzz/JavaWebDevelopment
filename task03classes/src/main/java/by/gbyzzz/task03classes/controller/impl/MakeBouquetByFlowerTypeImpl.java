package by.gbyzzz.task03classes.controller.impl;

import by.gbyzzz.task03classes.beans.AllGoods;
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
        ioData.output(current.getString("accessoryColorStr"));
        String accessoryColor = String.valueOf(ioData.input().next());
        bouquet.setName(flower + " bouquet");
        bouquet.setFlowers(serviceFactory.getFindFlowerByType().find(AllGoods.getAllGoods().getFlowers(),flower));
        bouquet.setAccessories(serviceFactory.getFindAccessory().find(AllGoods.getAllGoods().getAccessories(), accessory, accessoryColor));
        bouquet.setTotalPrice();
        ioData.output(bouquet);
    }
}
