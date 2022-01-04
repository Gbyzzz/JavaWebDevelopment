package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Accessories;
import by.gbyzzz.task03classes.beans.AllGoods;
import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.DataGeneratorService;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateData implements DataGeneratorService {
    public void generateData(int maxFlowers, int maxAccessories, int daysFromCut, String name){
        List<Flowers> flowers = new ArrayList<>();
        List<Accessories> accessories = new ArrayList<>();

        for(int i = 0; i < maxFlowers; ++i){
            String names = Flowers.names[new Random().nextInt(Flowers.names.length-1)];
            String color = Flowers.colors[new Random().nextInt(Flowers.colors.length-1)];
            int stemLength = Flowers.stemLengths[new Random().nextInt(Flowers.stemLengths.length-1)];
            BigDecimal price = new BigDecimal(BigInteger.valueOf(new Random().nextInt(500)), 2);
            Calendar d1 = Calendar.getInstance();
            d1.add(Calendar.DATE, daysFromCut * -1);
            Date d2= new Date();
            Date cutDate = new Date(ThreadLocalRandom.current().nextLong(d1.getTime().getTime(), d2.getTime()));
            Flowers flower = new Flowers(names, color, price, stemLength, cutDate);
            flowers.add(flower);
        }
        for(int i = 0; i < maxAccessories; ++i){
            String names = Accessories.names[new Random().nextInt(Flowers.names.length-1)];
            String color = Accessories.colors[new Random().nextInt(Flowers.colors.length-1)];

            if(names.equals("Ribbon")) {
                do {
                    color = Accessories.colors[new Random().nextInt(Flowers.colors.length)];
                } while (color.equals("Craft"));
            }
            BigDecimal price = new BigDecimal(BigInteger.valueOf(new Random().nextInt(200)), 2);
            Accessories accessory = new Accessories(names, price, color);
            accessories.add(accessory);
        }

        AllGoods.getGenerator().setFlowers(flowers);
        AllGoods.getGenerator().setName(name);
        AllGoods.getGenerator().setAccessories(accessories);
    }
}
