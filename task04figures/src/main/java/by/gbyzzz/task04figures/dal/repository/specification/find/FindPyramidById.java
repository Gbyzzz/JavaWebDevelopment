package by.gbyzzz.task04figures.dal.repository.specification.find;

import java.util.Map;

public class FindPyramidById implements FindPyramidSpecification{
    @Override
    public boolean isSpecified(Map.Entry entry) {
        return false;
    }
}