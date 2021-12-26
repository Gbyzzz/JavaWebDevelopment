package by.gbyzzz.task03classes.beans.flowers;

import by.gbyzzz.task03classes.beans.Flower;
import java.math.BigDecimal;

public class Eustoma extends Flower {
    public Eustoma(BigDecimal price, int stemLength, String color) {
        super(price, stemLength, color);
    }

    @Override
    public String toString() {
        return "Eustoma, color:" + getColor() + ", stem length" + getStemLength() + ", price:" + getPrice();
    }
}
