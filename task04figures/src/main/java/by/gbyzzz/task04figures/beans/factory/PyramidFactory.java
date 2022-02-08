package by.gbyzzz.task04figures.beans.factory;

import by.gbyzzz.task04figures.beans.Point;
import by.gbyzzz.task04figures.beans.Pyramid;

import java.util.List;

public class PyramidFactory implements FigureFactory <Pyramid> {
    @Override
    public Pyramid create(String name, List<Point> points) {
        return new Pyramid(name, points);
    }
}
