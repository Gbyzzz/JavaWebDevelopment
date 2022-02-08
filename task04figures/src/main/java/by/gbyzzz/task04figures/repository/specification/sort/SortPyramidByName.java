package by.gbyzzz.task04figures.repository.specification.sort;

import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.Registrator;

import java.util.Comparator;
import java.util.HashMap;

public class SortPyramidByName implements SortPyramidSpecification {
    @Override
    public Comparator<HashMap<Pyramid, Registrator>> getComparator() {
        Comparator<HashMap<Pyramid, Registrator>> comparator = new Comparator<HashMap<Pyramid, Registrator>>() {
            @Override
            public int compare(final HashMap<Pyramid, Registrator> o1, final HashMap<Pyramid, Registrator> o2) {
                String name1 = null;
                String name2 = null;
                for (Pyramid pyramid1 : o1.keySet()) {
                    for (Pyramid pyramid2 : o2.keySet()) {
                        name1 = pyramid1.getName();
                        name2 = pyramid2.getName();
                    }
                }
                return name1.compareTo(name2);
            }
        };
        return comparator;
    }
}
