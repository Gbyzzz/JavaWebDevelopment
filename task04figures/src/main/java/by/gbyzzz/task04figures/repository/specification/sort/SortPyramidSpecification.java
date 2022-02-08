package by.gbyzzz.task04figures.repository.specification.sort;

import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.Registrator;
import by.gbyzzz.task04figures.repository.specification.PyramidSpecification;

import java.util.Comparator;
import java.util.HashMap;

public interface SortPyramidSpecification extends PyramidSpecification {
    Comparator<HashMap<Pyramid, Registrator>> getComparator();
}
