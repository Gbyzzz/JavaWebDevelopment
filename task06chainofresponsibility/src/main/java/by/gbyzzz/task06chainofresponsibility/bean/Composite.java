package by.gbyzzz.task06chainofresponsibility.bean;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{
    private static final Logger LOGGER = LogManager.getLogger();

    private ArrayList<Component> parts;
    private PartLevel partLevel;

    public Composite(PartLevel partLevel) {
        LOGGER.info("Creating new Composite, level " + partLevel);
        this.parts = new ArrayList<>();
        this.partLevel = partLevel;
    }

    @Override
    public void add(Component component) {
        parts.add(component);
        LOGGER.info("Adding new component to composite");
    }

    @Override
    public void remove(Component component) {
        parts.remove(component);
        LOGGER.info("Removing component from composite");
    }

    @Override
    public ArrayList<Component> getParts() {
        ArrayList <Component> tempParts = parts;
        return tempParts;
    }

    @Override
    public PartLevel getPartLevel() {
        return partLevel;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Component component : parts) {
            if (component.getPartLevel() == PartLevel.PARAGRAPH) {
                stringBuilder.append("\t");
            }
            if (component.getPartLevel() == PartLevel.LEXEME) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(component.toString());

            if (component.getPartLevel() == PartLevel.PARAGRAPH) {
                stringBuilder.append(System.lineSeparator());
            }
        }
        return stringBuilder.toString();
    }
}
