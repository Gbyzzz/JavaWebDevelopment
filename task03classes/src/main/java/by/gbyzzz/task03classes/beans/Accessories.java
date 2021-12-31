package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;

public class Accessories extends Goods{
    private int length;

    public Accessories(String name, String color, BigDecimal price, int length) {
        super(name, color, price);
        this.length = length;
    }

    public int getLength() {
        return length;
    }
}
