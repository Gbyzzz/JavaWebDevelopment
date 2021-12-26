package by.gbyzzz.task03classes.beans.accessories;

import by.gbyzzz.task03classes.beans.Accessories;
import java.math.BigDecimal;

public class Ribbon extends Accessories {
    private int length;

    protected Ribbon(String name, BigDecimal price, String color, int length) {
        super(name, price, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

}
