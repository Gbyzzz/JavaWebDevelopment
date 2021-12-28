package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;
import java.util.Date;

public class Flower extends Goods{
    private final String name;
    private final String color;
    private final int stemLength;
    private final Date cutDate;

    public Flower(String name, String color, int stemLength, BigDecimal price, Date cutDate) {
        super(price);
        this.name = name;
        this.color = color;
        this.stemLength = stemLength;
        this.cutDate = cutDate;
    }

    public Date getCutDate() {
        return cutDate;
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
