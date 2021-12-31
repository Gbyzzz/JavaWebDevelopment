package by.gbyzzz.task03classes.beans;

import java.util.ArrayList;
import java.util.List;

public class Bouquet{
    private List<Flowers> flowers = new ArrayList<>();

    public void add(Flowers flowers){
        this.flowers.add(flowers);
    }

    public List<Flowers> getFlowers() {
        return flowers;
    }

    public void setFlowers(List<Flowers> flowers) {
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        String flowersString = new String();
        for(Flowers flower : flowers)
            flowersString += flower.toString();
        return "Bouquet{" +
                "bouquet=" + flowersString +
                '}';
    }
}
