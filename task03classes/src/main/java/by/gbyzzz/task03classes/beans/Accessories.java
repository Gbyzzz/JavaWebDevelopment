package by.gbyzzz.task03classes.beans;

import java.math.BigDecimal;

public class Accessories extends Goods{
    private int length;

    public Accessories(String name, BigDecimal price, int length) {
        super(name, price);
        this.length = length;
    }

    public int getLength() {
        return length;
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
                ", length: " + length +
                '}';
    }
}
