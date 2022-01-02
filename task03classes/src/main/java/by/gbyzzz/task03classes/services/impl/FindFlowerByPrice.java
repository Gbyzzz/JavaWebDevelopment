package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.BouquetFindService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FindFlowerByPrice implements BouquetFindService {
    @Override
    public List<Flowers> find(Bouquet bouquet, String ... str){
        List<Flowers> foundFlowers = new ArrayList<>();
        for(Flowers flower : bouquet.getFlowers()) {
            if (flower.getPrice().compareTo(new BigDecimal(str[0])) >= 0 && flower.getPrice().compareTo(new BigDecimal(str[1])) <= 0) {
                foundFlowers.add(flower);
            }
        }
        return foundFlowers;
    }
}
