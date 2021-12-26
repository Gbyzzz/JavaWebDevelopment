package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;

public abstract class Accessories extends Goods{
    private final String Color;

    protected Accessories(String name, BigDecimal price, String color) {
        super(name, price);
        Color = color;
    }

    public String getColor() {
        return Color;
    }
}
