package by.gbyzzz.task06chainofresponsibility.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Leaf implements Component {
    private static final Logger LOGGER = LogManager.getLogger();

    private char sym;
    private PartLevel partLevel;

    public Leaf(char sym, PartLevel partLevel) {
        this.sym = sym;
        this.partLevel = partLevel;
    }

    @Override
    public void operation() {

    }

    @Override
    public void add(Component c) {
        LOGGER.error("You can't add a child to a leaf component");
    }

    @Override
    public void remove(Component c) {
        LOGGER.error("You can't remove a child from a leaf component, as it doesn't has children components");

    }

    @Override
    public ArrayList<Component> getParts() {
        LOGGER.error("You can't get children components from a leaf component, as it doesn't has them");
        return null;
    }

    @Override
    public PartLevel getPartLevel() {
        return partLevel;
    }

    @Override
    public String toString()
    {
        return String.valueOf(sym);
    }
}
