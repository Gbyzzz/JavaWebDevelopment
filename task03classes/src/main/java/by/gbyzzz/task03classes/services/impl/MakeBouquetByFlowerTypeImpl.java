package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Accessories;
import by.gbyzzz.task03classes.beans.AllGoods;
import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.MakeBouquetService;

public class MakeBouquetByFlowerTypeImpl implements MakeBouquetService {
    @Override
    public void makeBouquet (Bouquet bouquet,  String... str){
        for(Flowers flower : AllGoods.getInstance().getFlowers()){
            if(flower.getName().equals(str[0])){
                bouquet.add(flower);
            }
        }
        for(Accessories accessory : AllGoods.getInstance().getAccessories()){
            if(accessory.getName().equals(str[1])){
                if(accessory.getColor().equals(str[2])) {
                    bouquet.add(accessory);
                }
            }
        }
    }
}
