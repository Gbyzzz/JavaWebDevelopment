package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;

public abstract class Flower extends Goods{
    private final int stemLength;
    private final String color;


    public Flower(BigDecimal price, int stemLength, String color) {
        super(price);
        this.stemLength = stemLength;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getStemLength() {
        return stemLength;
    }

    public BigDecimal getPrice() {
        return super.getPrice();
    }
}
