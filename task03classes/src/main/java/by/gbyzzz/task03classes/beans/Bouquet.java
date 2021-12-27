package by.gbyzzz.task03classes.beans;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private List<Goods> bouquet = new ArrayList<>();

    public List<Goods> getBouquet() {
        return bouquet;
    }

    public void setBouquet(List<Goods> bouquet) {
        this.bouquet = bouquet;
    }
}
