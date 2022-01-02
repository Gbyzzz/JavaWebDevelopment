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
    public String getName(){
        return super.getName();
    }
    public String getColor(){
        return super.getColor();
    }
    public BigDecimal getPrice(){
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "\n" + "Accessories{" + "name: " + getName() +
                ", color: " + getColor() +
                ", price: " + getPrice() +
                ", length: " + length +
                '}';
    }
}
