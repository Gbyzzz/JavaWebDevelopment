package by.gbyzzz.task04figures.beans;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Pyramid extends Figure {
private String name;
private Double height;
private String heightParallelAxis;

    public Pyramid(String name, Double height, String heightParallelAxis, List<Point> points) {
        this.name = name;
        this.height = height;
        this.heightParallelAxis = heightParallelAxis.toLowerCase(Locale.ROOT);
        super.setPoints(points);
    }

    public Double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public List<Point> getPoints() {
        return super.getPoints();
    }

    public String getHeightParallelAxis() {
        return heightParallelAxis;
    }

    @Override
    public String toString() {
        return "{" +
                "name: " + name + '\'' +
                ", height: " + height +
                ", height is parallel '" + heightParallelAxis + "' axis" +
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
