package by.gbyzzz.task03classes.services;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;

import java.util.List;

public class MakeBouquet {
    public Bouquet makeBouquet(List<Flowers> flowers, List accessories, String flowersInBouquet){
        Bouquet bouquet = new Bouquet();
        for(Flowers flower : flowers){
            if(flower.getName() == flowersInBouquet){
                bouquet.add(flower);
            }
        }
        return bouquet;
    }
}
