package by.gbyzzz.task04figures.beans;

import java.util.List;
import java.util.Objects;

public class Pyramid extends Figure {
private Double height;
private String heightParallelAxis;

    public Pyramid(final String name, final Double height, final String heightParallelAxis, final List<Point> points) {
        super(name, points);
        this.height = height;
        this.heightParallelAxis = heightParallelAxis;
    }

    public Pyramid(final String name, final List<Point> points) {
        super(name, points);
    }

    public void setHeight(final Double height) {
        this.height = height;
    }

    public void setHeightParallelAxis(final String heightParallelAxis) {
        this.heightParallelAxis = heightParallelAxis;
    }

    public Double getHeight() {
        return height;
    }

    public String getHeightParallelAxis() {
        return heightParallelAxis;
    }

    @Override
    public String toString() {
        return "{" + "name: " + getName() + '\'' + ", height: "
                + height + ", height is parallel '"
                + heightParallelAxis + "' axis" + ", points: "
                 + getPoints() + '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Pyramid pyramid = (Pyramid) o;
        return Objects.equals(height, pyramid.height) && Objects.equals(heightParallelAxis, pyramid.heightParallelAxis);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, heightParallelAxis);
    }
}
