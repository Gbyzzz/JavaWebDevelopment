package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;

public class Accessories extends Goods{
    public static String[] names = new String[]{"Ribbon", "PackingPaper", "GiftBox"};
    public static String[] colors = new String[]{"Silver", "Golden", "Craft", "Red", "White", "with Printing"};
    private String color;

    public Accessories(String name, BigDecimal price, String color) {
        super(name, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public String getName(){
        return super.getName();
    }

    public BigDecimal getPrice(){
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "\n" + "Accessories{" + "name: " + getName() +
                ", price: " + getPrice() +
                ", color: " + color +
                '}';
    }
}
