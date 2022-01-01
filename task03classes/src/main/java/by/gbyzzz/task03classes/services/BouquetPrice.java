package by.gbyzzz.task03classes.services;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;

import java.math.BigDecimal;

public class BouquetPrice {
    public void getTotalPrice(Bouquet bouquet){
        BigDecimal totalPrice = BigDecimal.ZERO;
        for(Flowers flower : bouquet.getFlowers()){
            totalPrice = totalPrice.add(flower.getPrice());
        }
        bouquet.setTotalPrice(totalPrice);
    }
}
