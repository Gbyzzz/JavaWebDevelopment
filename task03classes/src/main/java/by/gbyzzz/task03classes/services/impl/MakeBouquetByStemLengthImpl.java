package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Accessories;
import by.gbyzzz.task03classes.beans.AllGoods;
import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.MakeBouquetService;

public class MakeBouquetByStemLengthImpl  implements MakeBouquetService {
    @Override
    public void makeBouquet (Bouquet bouquet, String... str){
        AllGoods allGoods = AllGoods.getInstance();
        for(Flowers flower : allGoods.getFlowers()){
            if(flower.getStemLength() == Integer.parseInt(str[0])){
                bouquet.add(flower);
            }
        }
        for(Accessories accessory : allGoods.getAccessories()){
            if(accessory.getName().equals(str[1])){
                if(accessory.getColor().equals(str[2])) {
                    bouquet.add(accessory);
                }
            }
        }
    }
}