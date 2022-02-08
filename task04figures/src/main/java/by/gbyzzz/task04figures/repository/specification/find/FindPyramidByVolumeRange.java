package by.gbyzzz.task04figures.repository.specification.find;

import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.Registrator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class FindPyramidByVolumeRange implements FindPyramidSpecification {
    private static final Logger LOGGER = LogManager.getLogger();
    private Double min = Double.valueOf(0);
    private Double max = Double.valueOf(0);
    public void setRange(final Double min, final Double max) {
        this.min = min;
        this.max = max;
    }

    public FindPyramidByVolumeRange(final Double min, final Double max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean isSpecified(final HashMap<Pyramid, Registrator> map) {
        LOGGER.trace("Looking for pyramid(s) with volume between " + min + " and " + max);
        boolean res = false;
        for (Pyramid pyramid : map.keySet()) {
            if (map.get(pyramid).getVolume() >= min && map.get(pyramid).getVolume() <= max) {
                res = true;
            }
        }
        return res;
    }
}
