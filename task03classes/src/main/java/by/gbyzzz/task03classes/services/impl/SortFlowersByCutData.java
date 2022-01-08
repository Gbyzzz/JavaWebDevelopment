package by.gbyzzz.task03classes.services.impl;

import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.services.SortService;

import java.util.Comparator;
import java.util.List;

public class SortFlowersByCutData implements SortService {

    @Override
    public void sort(List<Flowers> flowers) {
        flowers.sort(Comparator.comparing(o -> o.getCutDate()));
    }
}