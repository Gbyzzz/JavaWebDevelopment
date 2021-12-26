package by.gbyzzz.task03classes.beans.flowers;

import by.gbyzzz.task03classes.beans.Flower;

import java.math.BigDecimal;

public class Hydrangea extends Flower {
    public Hydrangea(BigDecimal price, int stemLength, String color) {
        super(price, stemLength, color);
    }

    @Override
    public String toString() {
        return "Hydrangea, color:" + getColor() + ", stem length" + getStemLength() + ", price:" + getPrice();
    }
}
