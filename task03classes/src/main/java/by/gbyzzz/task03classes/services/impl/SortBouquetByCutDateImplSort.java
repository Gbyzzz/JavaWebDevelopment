package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.BouquetSortService;

import java.util.Comparator;
import java.util.List;

public class SortBouquetByCutDateImplSort implements BouquetSortService {

    @Override
    public void sort(Bouquet bouquet) {
        List<Flowers> list = bouquet.getFlowers();
        list.sort(Comparator.comparing(o -> o.getCutDate()));
    }
}