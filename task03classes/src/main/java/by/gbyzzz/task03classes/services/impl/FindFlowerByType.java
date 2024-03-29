package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.FindService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FindFlowerByType implements FindService<Flowers> {
    @Override
    public List<Flowers> find(List<Flowers> flowers, String ... str){
        List<Flowers> foundFlowers = new ArrayList<>();
        for(Flowers flower : flowers) {
            if (flower.getName().toLowerCase(Locale.ROOT).equals(str[0].toLowerCase(Locale.ROOT))) {
                foundFlowers.add(flower);
            }
        }
        return foundFlowers;
    }
}