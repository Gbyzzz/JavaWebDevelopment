package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;

public abstract class Goods {
    private final String name;
    private final BigDecimal price;

    protected Goods(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    protected String getName() {
        return name;
    }

    protected BigDecimal getPrice() {
        return price;
    }

}
