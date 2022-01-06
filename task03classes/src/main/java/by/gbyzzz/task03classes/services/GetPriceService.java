package by.gbyzzz.task03classes.services;

import by.gbyzzz.task03classes.beans.Accessories;
import by.gbyzzz.task03classes.beans.Goods;

import java.math.BigDecimal;
import java.util.List;

public interface GetPriceService<T extends Goods> {
    public BigDecimal getPrice(List<T> accessories);
    }
