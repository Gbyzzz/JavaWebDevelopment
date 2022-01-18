package by.gbyzzz.task04figures.beans;

import java.util.List;

public abstract class Figure {
    private List<Point> points;

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "points=" + points +
                '}';
    }
}
