package by.gbyzzz.task04figures.dal.repository.specification.sort;

import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.dal.repository.specification.PyramidSpecification;

import java.util.Comparator;

public interface SortPyramidSpecification extends PyramidSpecification {
    Comparator<Pyramid> getComparator();
}
