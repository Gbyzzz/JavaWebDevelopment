package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;

public abstract class Goods {
    private final String name;
    private final String color;
    private final BigDecimal price;

    protected Goods(String name, String color, BigDecimal price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    protected String getName() {
        return name;
    }

    protected String getColor() {
        return color;
    }

    protected BigDecimal getPrice() {
        return price;
    }

}
