package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Flowers extends Goods{
    private final int stemLength;
    private final Date cutDate;

    public Flowers(String name, String color, BigDecimal price, int stemLength, Date cutDate) {
        super(name, color, price);
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
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
    public String getColor() {
        return super.getColor();
    }

    public BigDecimal getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return "\n" + "Flowers{" + "name: " + getName() +
                ", price: " + getPrice() +
                ", stemLength=" + stemLength +
                ", cutDate=" + df.format(cutDate) +
                '}';
    }
}
