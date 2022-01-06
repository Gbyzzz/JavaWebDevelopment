package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Accessories;
import by.gbyzzz.task03classes.services.GetPriceService;

import java.math.BigDecimal;
import java.util.List;

public class GetAccessoriesTotalPrice implements GetPriceService<Accessories> {
    public BigDecimal getPrice(List<Accessories> accessories) {
        BigDecimal totalPrice = BigDecimal.ZERO;
        for(Accessories accessory : accessories){
            totalPrice = totalPrice.add(accessory.getPrice());
        }
        return totalPrice;
    }
}

