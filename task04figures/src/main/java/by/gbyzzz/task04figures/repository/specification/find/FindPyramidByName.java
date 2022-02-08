package by.gbyzzz.task04figures.repository.specification.find;

import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.Registrator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class FindPyramidByName implements FindPyramidSpecification {
    private static final Logger LOGGER = LogManager.getLogger();
    private String name;

    public FindPyramidByName(final String name) {
        this.name = name;
    }

    public void setName(final String name) {
   this.name = name;
   }

    @Override
    public boolean isSpecified(final HashMap<Pyramid, Registrator> map) {
        LOGGER.trace("Looking for pyramid with name " + name);
        boolean res = false;
        for (Pyramid pyramid : map.keySet()) {
            if (pyramid.getName().equals(name)) {
                res = true;
            }
        }
        return res;
    }
}

