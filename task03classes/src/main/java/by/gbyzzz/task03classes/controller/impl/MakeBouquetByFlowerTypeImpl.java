package by.gbyzzz.task03classes.controller.impl;

import by.gbyzzz.task03classes.beans.AllGoods;
import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.controller.command.Command;
import by.gbyzzz.task03classes.services.factory.ServiceFactory;
import by.gbyzzz.task03classes.view.IOData;
import by.gbyzzz.task03classes.view.MessageManager;
import by.gbyzzz.task03classes.view.factory.ViewFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.math.BigDecimal;

public class MakeBouquetByFlowerTypeImpl implements Command {
    private static final Logger LOGGER = LogManager.getLogger();
    @Override
    public void execute(Bouquet bouquet) {
        MessageManager current = MessageManager.setLocale();
        ViewFactory viewFactory = ViewFactory.getInstance();
        IOData ioData = viewFactory.getIoData();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();
        ioData.output(current.getString("flowerTypeInputStr"));
        LOGGER.trace("Getting input from user");
        String flower = String.valueOf(ioData.input().next());
        ioData.output(current.getString("accessoryTypeStr"));
        LOGGER.trace("Getting input from user");
        String accessory = String.valueOf(ioData.input().next());
        ioData.output(current.getString("accessoryColorStr"));
        LOGGER.trace("Getting input from user");
        String accessoryColor = String.valueOf(ioData.input().next());
        bouquet.setName(flower + " bouquet");
        LOGGER.trace("Looking for flowers according to type and adding them to bouquet");
        bouquet.setFlowers(serviceFactory.getFindFlowerByType().find(AllGoods.getAllGoods().getFlowers(),flower));
        LOGGER.trace("Validating flowers for incorrect data");
        serviceFactory.getValidateFlowersService().validate(bouquet.getFlowers());
        LOGGER.trace("Looking for accessory according to color and type and adding it to bouquet");
        bouquet.setAccessories(serviceFactory.getFindAccessory().find(AllGoods.getAllGoods().getAccessories(), accessory, accessoryColor));
        ioData.output(bouquet);
        BigDecimal totalPrice = BigDecimal.ZERO;
        totalPrice = totalPrice.add(serviceFactory.getFlowersTotalPrice().getPrice(bouquet.getFlowers()));
        totalPrice = totalPrice.add(serviceFactory.getAccessoriesTotalPrice().getPrice(bouquet.getAccessories()));
        ioData.output("Total price: " + totalPrice);
    }
}
