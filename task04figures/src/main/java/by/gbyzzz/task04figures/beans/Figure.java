package by.gbyzzz.task04figures.beans;

import java.util.List;
import java.util.Objects;

public abstract class Figure {
    private String name;
    private List<Point> points;

    protected Figure(final String name, final List<Point> points) {
        this.name = name;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public List<Point> getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Figure{" + "points=" + points + '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Figure figure = (Figure) o;
        return Objects.equals(name, figure.name) && Objects.equals(points, figure.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, points);
    }
}
