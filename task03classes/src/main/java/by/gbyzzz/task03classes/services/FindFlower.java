package by.gbyzzz.task03classes.services;

import by.gbyzzz.task03classes.beans.Flowers;
import java.util.List;

public class FindFlower {
    public List<Flowers> findFlowerByStemLength(List<Flowers> flowers, int min, int max){
    List<Flowers> foundFlowers = null;
    for(Flowers flower : flowers) {
        if (flower.getStemLength() >= min || flower.getStemLength() <= max) {
            foundFlowers.add(flower);
        }
    }
        return foundFlowers;
    }
}
