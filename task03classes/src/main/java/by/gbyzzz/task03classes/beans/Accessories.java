package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * This class is a class which describes accessories entities.
 * @author Anton Pinchuk
 *
 */

public class Accessories extends Goods {

    /**
     * These array have a parameters of possible values of name for generating data.
     */

    private static String[] names = new String[]{"Ribbon", "PackingPaper", "GiftBox"};

    /**
     * These array have a parameters of possible values of color for generating data.
     */

    private static String[] colors = new String[]{"Silver", "Golden", "Craft", "Red", "White", "with Printing"};

    public static String[] getNames() {
        return names;
    }

    public static String[] getColors() {
        return colors;
    }

    private String color;

    public Accessories(final String name, final BigDecimal price, final String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public BigDecimal getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "\n" + "Accessories{" + "name: " + getName()
                + ", price: " + getPrice()
                + ", color: " + color + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Accessories that = (Accessories) o;
        return Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
