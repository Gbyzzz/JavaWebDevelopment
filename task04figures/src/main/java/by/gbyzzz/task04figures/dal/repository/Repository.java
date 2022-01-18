package by.gbyzzz.task04figures.dal.repository;

import by.gbyzzz.task04figures.beans.Figure;
import by.gbyzzz.task04figures.dal.repository.specification.PyramidSpecification;

import java.util.HashMap;
import java.util.List;

public interface Repository<T extends Figure> {

    void createOrUpdate(T t);

    void remove(T t);

    HashMap read();

    List<T> query(PyramidSpecification specification);
}
