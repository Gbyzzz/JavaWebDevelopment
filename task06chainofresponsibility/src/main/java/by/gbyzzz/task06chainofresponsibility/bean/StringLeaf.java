package by.gbyzzz.task06chainofresponsibility.bean;

import java.util.ArrayList;
import java.util.List;

public class StringLeaf implements Component {

    private String sym;
    private PartLevel partLevel;

    public StringLeaf(String sym, PartLevel partLevel) {
        this.sym = sym;
        this.partLevel = partLevel;
    }

    @Override
    public void operation() {

    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public ArrayList<Component> getParts() {
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

