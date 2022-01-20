package by.gbyzzz.task04figures.beans;

import java.util.Objects;

public class Point {
    private Double x;
    private Double y;
    private Double z;

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return x +
                ";" + y +
                ";" + z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x) && Objects.equals(y, point.y) && Objects.equals(z, point.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
