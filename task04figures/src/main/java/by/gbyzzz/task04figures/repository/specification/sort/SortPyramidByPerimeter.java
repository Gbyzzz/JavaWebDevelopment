package by.gbyzzz.task04figures.repository.specification.sort;

import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.Registrator;

import java.util.Comparator;
import java.util.HashMap;

public class SortPyramidByPerimeter implements SortPyramidSpecification {
    @Override
    public Comparator<HashMap<Pyramid, Registrator>> getComparator() {
        Comparator<HashMap<Pyramid, Registrator>> comparator = new Comparator<HashMap<Pyramid, Registrator>>() {
            @Override
            public int compare(final HashMap<Pyramid, Registrator> o1, final HashMap<Pyramid, Registrator> o2) {
                Double perimeter1 = null;
                Double perimeter2 = null;
                for (Pyramid pyramid1 : o1.keySet()) {
                    for (Pyramid pyramid2 : o2.keySet()) {
                        perimeter1 = o1.get(pyramid1).getPerimeter();
                        perimeter2 = o2.get(pyramid2).getPerimeter();
                    }
                }
                return perimeter1.compareTo(perimeter2);
            }
        };
        return comparator;
    }
}
