package by.gbyzzz.task03classes.beans.flowers;

import by.gbyzzz.task03classes.beans.Flower;
import java.math.BigDecimal;
import java.util.Date;

public class Rose extends Flower {
    private final String NAME = "Rose";

    public Rose(String name, String color, int stemLength, BigDecimal price, Date cutDate) {
        super(name, color, stemLength, price, cutDate);
    }

    @Override
    public String toString() {
        return String.format(String.format(NAME + ", color:" + getColor() + ", stem length" + getStemLength() + ", price:" + getPrice() + ", cut date:" + getCutDate()));
    }
}
