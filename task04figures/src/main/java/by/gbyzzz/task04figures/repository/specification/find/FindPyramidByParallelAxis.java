package by.gbyzzz.task04figures.repository.specification.find;

import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.Registrator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class FindPyramidByParallelAxis implements FindPyramidSpecification {
    private static final Logger LOGGER = LogManager.getLogger();
    private String axis;

    public FindPyramidByParallelAxis(final String axis) {
        this.axis = axis;
    }

    @Override
    public boolean isSpecified(final HashMap<Pyramid, Registrator> map) {
        LOGGER.trace("Looking for pyramid(s) with height which is parallel " + axis + " axis");
        boolean res = false;
        for (Pyramid pyramid : map.keySet()) {
            if (pyramid.getHeightParallelAxis().equals(axis)) {
                res = true;
            }
        }
        return res;
    }
}
