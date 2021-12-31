package by.gbyzzz.task03classes.services;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBouquet {
    public void sortByPrice(Bouquet bouquet){
        List<Flowers> list = bouquet.getFlowers();
        Collections.sort(list, new FlowerPriceComparator());

    }
    public void sortByStemLength(Bouquet bouquet){
        List<Flowers> list = bouquet.getFlowers();

        Collections.sort(list, new FlowerStemLengthComparator());
    }
    public void sortByCutDate(Bouquet bouquet){
        List<Flowers> list = bouquet.getFlowers();
        Collections.sort(list, new FlowerCutDateComparator());

    }
}
class FlowerStemLengthComparator implements Comparator<Flowers> {

    @Override
    public int compare(Flowers o1, Flowers o2) {
        if(o1.getStemLength()> o2.getStemLength())
            return 1;
        else if(o1.getStemLength()< o2.getStemLength())
            return -1;
        else
            return 0;
    }
}

class FlowerPriceComparator implements Comparator<Flowers>{

    @Override
    public int compare(Flowers o1, Flowers o2) {
        return o1.getPrice().compareTo(o1.getPrice());
    }
}
class FlowerCutDateComparator implements Comparator<Flowers> {

    @Override
    public int compare(Flowers o1, Flowers o2) {
        return o1.getCutDate().compareTo(o1.getCutDate());
    }
}