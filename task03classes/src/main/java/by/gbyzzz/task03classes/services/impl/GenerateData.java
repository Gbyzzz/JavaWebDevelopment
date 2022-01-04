package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Flowers;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class GenerateData {
    public void generateData(int maxFlowers){
        List<Flowers> flowers = new ArrayList<>();
        for(int i = 0; i < maxFlowers; ++i){
            String name = Flowers.names[new Random().nextInt(Flowers.names.length)];
            String color = Flowers.colors[new Random().nextInt(Flowers.colors.length)];
            int stemLength = Flowers.stemLengths[new Random().nextInt(Flowers.stemLengths.length)];
            BigDecimal price;
            Date cutDate;
            Flowers flower = new Flowers(name, color, price, stemLength, cutDate);
            flowers.add(flower);
        }
    }
}
