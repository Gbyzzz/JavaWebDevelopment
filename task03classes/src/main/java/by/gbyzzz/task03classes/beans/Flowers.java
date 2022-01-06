package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/**
 * This class is a class which describes flowers entities.
 * @author Anton Pinchuk
 *
 */

public class Flowers extends Goods{
    public static String [] names = new String[]{"Rose", "Tulip", "Alstroemeria", "Lily"};
    public static String [] colors = new String[]{"Red", "White", "Yellow", "Orange"};
    public static int [] stemLengths = new int[]{40, 50, 60, 70};
    private String color;
    private final int stemLength;
    private final Date cutDate;

    public Flowers(String name, String color, BigDecimal price, int stemLength, Date cutDate) {
        super(name, price);
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        this.color = color;
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
        return color;
    }

    public BigDecimal getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return "\n" + "Flowers{" + "name: " + getName() +
                ", color:" + getColor() +
                ", price: " + getPrice() +
                ", stemLength: " + stemLength +
                ", cutDate: " + df.format(cutDate) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flowers flowers = (Flowers) o;
        return Objects.deepEquals(getName(), flowers.getName()) && Objects.deepEquals(getPrice(), flowers.getPrice()) && stemLength == flowers.stemLength && Objects.deepEquals(color, flowers.color) && Objects.deepEquals(cutDate, flowers.cutDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), color, stemLength, cutDate);
    }
}
