package by.gbyzzz.task03classes.beans.flowers;

import by.gbyzzz.task03classes.beans.Flower;
import java.math.BigDecimal;
import java.util.Date;

public class Alstroemeria extends Flower {
    private final String NAME = "Alstroemeria";

    public Alstroemeria(String name, String color, int stemLength, BigDecimal price, Date cutDate) {
        super(name, color, stemLength, price, cutDate);
    }

    @Override
    public String toString() {
        return NAME + ", color:" + getColor() + ", stem length" + getStemLength() + ", price:" + getPrice();
    }
}
