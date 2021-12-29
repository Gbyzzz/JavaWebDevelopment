package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;
import java.util.Date;

public class Flowers extends Goods{
    private final int stemLength;
    private final Date cutDate;

    public Flowers(String name, String color, BigDecimal price, int stemLength, Date cutDate) {
        super(name, color, price);
        this.stemLength = stemLength;
        this.cutDate = cutDate;
    }

    public Date getCutDate() {
        return cutDate;
    }

    public int getStemLength() {
        return stemLength;
    }
    public String getName() {
        return super.getName();
    }


}
