package by.gbyzzz.task03classes.services;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;
import java.util.Comparator;
import java.util.List;

public class SortBouquet {
    public void sortByPrice(Bouquet bouquet){
        List<Flowers> list = bouquet.getFlowers();
        list.sort(Comparator.comparing(o -> o.getPrice()));
    }
    public void sortByStemLength(Bouquet bouquet){
        List<Flowers> list = bouquet.getFlowers();
        list.sort(Comparator.comparing(o -> o.getStemLength()));
    }
    public void sortByCutDate(Bouquet bouquet){
        List<Flowers> list = bouquet.getFlowers();
        list.sort(Comparator.comparing(o -> o.getCutDate()));

    }
}