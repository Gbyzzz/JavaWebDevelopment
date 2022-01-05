package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.BouquetFindService;

import java.util.ArrayList;
import java.util.List;

public class FindFlowerByStemLength implements BouquetFindService {
    @Override
    public List<Flowers> find(List<Flowers> flowers, String ... str){
    List<Flowers> foundFlowers = new ArrayList<>();
    for(Flowers flower : flowers) {
        if (flower.getStemLength() >= Integer.parseInt(str[0]) && flower.getStemLength() <= Integer.parseInt(str[1])) {
            foundFlowers.add(flower);
        }
    }
        return foundFlowers;
    }
}
