package by.gbyzzz.task04figures.beans;

import java.util.List;
import java.util.Objects;

public class Pyramid extends Figure {
private String name;
private double height;

    public Pyramid(String name, double height, List<Point> points) {
        super.setPoints(points);
        this.name = name;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public List<Point> getPoints() {
        return super.getPoints();
    }

    @Override
    public String toString() {
        return "{" +
                "name: " + name + '\'' +
                ", height: " + height +
                ", points: " + getPoints() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pyramid pyramid = (Pyramid) o;
        return Double.compare(pyramid.height, height) == 0 && Objects.equals(name, pyramid.name) && Objects.equals(pyramid.getPoints(), getPoints());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }
}
