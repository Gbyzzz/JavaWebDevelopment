package by.gbyzzz.task04figures.repository.specification.sort;

import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.Registrator;

import java.util.Comparator;
import java.util.HashMap;

public class SortPyramidByArea implements SortPyramidSpecification {
    @Override
    public Comparator<HashMap<Pyramid, Registrator>> getComparator() {
        Comparator<HashMap<Pyramid, Registrator>> comparator = new Comparator<HashMap<Pyramid, Registrator>>() {
            @Override
            public int compare(final HashMap<Pyramid, Registrator> o1, final HashMap<Pyramid, Registrator> o2) {
                Double area1 = null;
                Double area2 = null;
                for (Pyramid pyramid1 : o1.keySet()) {
                    for (Pyramid pyramid2 : o2.keySet()) {
                       area1 = o1.get(pyramid1).getArea();
                       area2 = o2.get(pyramid2).getArea();
                    }
                }
                return area1.compareTo(area2);
            }
        };
       return comparator;
    }
}
