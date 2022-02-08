package by.gbyzzz.task04figures.repository.specification.find;

import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.Registrator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class FindPyramidByAreaRange implements FindPyramidSpecification {
    private static final Logger LOGGER = LogManager.getLogger();
    private double min = 0;
    private double max = 0;

    public FindPyramidByAreaRange(final double min, final double max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isSpecified(final HashMap<Pyramid, Registrator> map) {
        LOGGER.trace("Looking for pyramid(s) with area between " + min + " and " + max);
        boolean res = false;
        for (Pyramid pyramid : map.keySet()) {
            if (map.get(pyramid).getArea() >= min && map.get(pyramid).getArea() <= max) {
                res = true;
            }
        }
        return res;
    }
}
