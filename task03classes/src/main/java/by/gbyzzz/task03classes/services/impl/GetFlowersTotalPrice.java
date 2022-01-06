package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.GetPriceService;

import java.math.BigDecimal;
import java.util.List;

public class GetFlowersTotalPrice implements GetPriceService<Flowers> {
    public BigDecimal getPrice(List<Flowers> flowers) {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for(Flowers flower : flowers){
            totalPrice = totalPrice.add(flower.getPrice());
        }
        return totalPrice;
    }
}
