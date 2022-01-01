package by.gbyzzz.task03classes.controller;

import by.gbyzzz.task03classes.beans.Accessories;
import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.dal.FileIOFactory;
import by.gbyzzz.task03classes.dal.FileIOInterface;
import by.gbyzzz.task03classes.services.BouquetPrice;
import by.gbyzzz.task03classes.services.MakeBouquet;
import by.gbyzzz.task03classes.services.SortBouquet;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        FileIOInterface fileIO = fileIOFactory.getFileIO();
        List<Flowers> flowers = new ArrayList<>();
        Type type = new TypeToken<List<Flowers>>() {}.getType();
        flowers = (List<Flowers>) fileIO.parseJSON("flowers.json", flowers, type);
        List<Accessories> accessories = new ArrayList<>();
//        accessories = (List<Accessories>) fileIO.parseJSON("accessories.json", accessories, type);
        MakeBouquet makeBouquet = new MakeBouquet();
        SortBouquet sortBouquet = new SortBouquet();
        Bouquet bouquet = makeBouquet.makeBouquet(flowers, accessories, "Rose");
        BouquetPrice bouquetPrice = new BouquetPrice();
        bouquetPrice.getTotalPrice(bouquet);
        System.out.println(bouquet);
        sortBouquet.sortByStemLength(bouquet);
        System.out.println();
        System.out.println(bouquet);
        sortBouquet.sortByPrice(bouquet);
        System.out.println();
        System.out.println(bouquet);
        sortBouquet.sortByCutDate(bouquet);
        System.out.println();
        System.out.println(bouquet);
    }
}
