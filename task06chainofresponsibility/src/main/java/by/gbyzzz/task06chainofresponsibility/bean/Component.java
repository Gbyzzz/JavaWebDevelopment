package by.gbyzzz.task06chainofresponsibility.bean;


import java.util.ArrayList;

public interface Component {

    void add(Component c);
    void remove(Component c);
    ArrayList<Component> getParts();
    PartLevel getPartLevel();
}
