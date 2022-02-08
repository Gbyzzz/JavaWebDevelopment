package by.gbyzzz.task04figures.repository.specification.find;

import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.Registrator;
import by.gbyzzz.task04figures.repository.specification.PyramidSpecification;

import java.util.HashMap;

public interface FindPyramidSpecification extends PyramidSpecification {
    boolean isSpecified(HashMap<Pyramid, Registrator> map);
}
