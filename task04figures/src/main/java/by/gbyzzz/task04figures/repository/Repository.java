package by.gbyzzz.task04figures.repository;

import by.gbyzzz.task04figures.beans.Figure;
import by.gbyzzz.task04figures.repository.specification.PyramidSpecification;

import java.util.HashMap;
import java.util.List;

public interface Repository<T extends Figure> {

    void createOrUpdate(T t);

    void remove(T t);

    HashMap read();

    List<T> query(PyramidSpecification specification);
}
