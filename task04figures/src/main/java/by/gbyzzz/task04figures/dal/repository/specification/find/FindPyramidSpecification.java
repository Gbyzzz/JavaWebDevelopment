package by.gbyzzz.task04figures.dal.repository.specification.find;

import by.gbyzzz.task04figures.dal.repository.specification.PyramidSpecification;

import java.util.Map;

public interface FindPyramidSpecification extends PyramidSpecification {
    boolean isSpecified(Map.Entry entry);
}
