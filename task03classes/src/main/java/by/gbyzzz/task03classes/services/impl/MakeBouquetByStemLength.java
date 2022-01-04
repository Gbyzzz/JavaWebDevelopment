package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Accessories;
import by.gbyzzz.task03classes.beans.AllGoods;
import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.MakeBouquetService;

import java.util.Locale;

public class MakeBouquetByStemLength implements MakeBouquetService {
    @Override
    public void makeBouquet (Bouquet bouquet, String... str){
        AllGoods allGoods = AllGoods.getAllGoods();
        for(Flowers flower : allGoods.getFlowers()){
            if(flower.getStemLength() == Integer.parseInt(str[0])){
                bouquet.add(flower);
            }
        }
        for(Accessories accessory : AllGoods.getAllGoods().getAccessories()) {
            if (accessory.getName().toLowerCase(Locale.ROOT).equals(str[1].toLowerCase(Locale.ROOT)) &&
                    accessory.getColor().toLowerCase(Locale.ROOT).equals(str[2].toLowerCase(Locale.ROOT))) {
                if(bouquet.getAccessories().size() < 1)
                {
                    bouquet.add(accessory);
                }
            }

        }
    }
}