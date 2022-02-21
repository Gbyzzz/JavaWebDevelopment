package by.gbyzzz.task06chainofresponsibility.bean;


import java.util.ArrayList;
import java.util.List;

public interface Component {

    void add(Component c);
    void remove(Component c);
    ArrayList<Component> getParts();
    PartLevel getPartLevel();
}
