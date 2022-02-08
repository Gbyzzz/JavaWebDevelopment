package by.gbyzzz.task04figures.beans;

import java.util.Objects;

public class Registrator {
    private Double perimeter;
    private Double volume;
    private Double area;
    private Double ratio;
    private boolean isOnAxis;

    public Registrator(final Double perimeter, final Double volume, final Double area, final Double ratio, final boolean isOnAxis) {
        this.perimeter = perimeter;
        this.volume = volume;
        this.area = area;
        this.ratio = ratio;
        this.isOnAxis = isOnAxis;
    }

    public Registrator() {

    }

    public Double getRatio() {
        return ratio;
    }

    public void setRatio(final double ratio) {
        this.ratio = ratio;
    }

    public Double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(final double perimeter) {
        this.perimeter = perimeter;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(final double volume) {
        this.volume = volume;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(final double area) {
        this.area = area;
    }

    public boolean isOnAxis() {
        return isOnAxis;
    }

    public void setOnAxis(final boolean onAxis) {
        isOnAxis = onAxis;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Registrator that = (Registrator) o;
        return Objects.equals(perimeter, that.perimeter) && Objects.equals(volume, that.volume) && Objects.equals(area, that.area) && Objects.equals(ratio, that.ratio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(perimeter, volume, area, ratio);
    }

    @Override
    public String toString() {
        return "Registrator{" + "perimeter=" + perimeter
                + ", volume=" + volume
                + ", area=" + area
                + ", ratio=" + ratio
                + '}';
    }
}
