package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;

public abstract class Goods {
    private final BigDecimal price;

    protected Goods(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getPrice() {
        return price;
    }
}
