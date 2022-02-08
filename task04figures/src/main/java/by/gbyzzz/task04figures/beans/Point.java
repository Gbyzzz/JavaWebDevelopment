package by.gbyzzz.task04figures.beans;

import java.util.Objects;

public class Point {
    private Double x;
    private Double y;
    private Double z;

    public Point(final double x, final double y, final double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getX() {
        return x;
    }

    public void setX(final double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(final double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(final double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return x + ";" + y + ";" + z;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Point point = (Point) o;
        return Objects.equals(x, point.x) && Objects.equals(y, point.y) && Objects.equals(z, point.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
