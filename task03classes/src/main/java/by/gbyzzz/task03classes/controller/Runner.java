package by.gbyzzz.task03classes.controller;

import by.gbyzzz.task03classes.beans.AllGoods;
import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.dal.FileIOFactory;
import by.gbyzzz.task03classes.dal.FileIOInterface;
import by.gbyzzz.task03classes.services.factory.ServiceFactory;

public class Runner {
    public static void main(String[] args) {

        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        FileIOInterface fileIO = fileIOFactory.getFileIO();
        ServiceFactory serviceFactory = ServiceFactory.getInstance();

        AllGoods.setInstance(fileIO.parseJSON("flowers.json", AllGoods.class));
        System.out.println(AllGoods.getInstance());

        Bouquet bouquet = new Bouquet();
        serviceFactory.getMakeBouquetByFlowerType().makeBouquet(bouquet, "Rose", "ribbon", "red");
        System.out.println(bouquet);
        serviceFactory.getSortBouquetByStemLength().sort(bouquet);
        System.out.println(bouquet);
        serviceFactory.getSortBouquetByPrice().sort(bouquet);
        System.out.println(bouquet);
        serviceFactory.getSortBouquetByCutDate().sort(bouquet);
        System.out.println(bouquet);


//        List<Flowers> flowers = new ArrayList<>();
//        Type type = new TypeToken<List<Flowers>>() {}.getType();
//        flowers = (List<Flowers>) fileIO.parseJSON("flowers.json", flowers, type);
//        List<Accessories> accessories = new ArrayList<>();
//        accessories = (List<Accessories>) fileIO.parseJSON("accessories.json", accessories, type);
//        SortBouquetByCutDateImpl sortBouquetByCutDateImpl = new SortBouquetByCutDateImpl();
//        Bouquet bouquet = makeBouquetImpl.makeBouquet(flowers, accessories, "Rose");
//        BouquetPriceImpl bouquetPriceImpl = new BouquetPriceImpl();
//        bouquetPriceImpl.getTotalPrice(bouquet);
//        System.out.println(bouquet);
//        sortBouquetByCutDateImpl.sortByStemLength(bouquet);
//        System.out.println();
//        System.out.println(bouquet);
//        sortBouquetByCutDateImpl.sortByPrice(bouquet);
//        System.out.println();
//        System.out.println(bouquet);
//        sortBouquetByCutDateImpl.sortByCutDate(bouquet);
//        System.out.println();
//        System.out.println(bouquet);
    }
}
