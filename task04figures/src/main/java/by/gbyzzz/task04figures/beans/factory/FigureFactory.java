package by.gbyzzz.task04figures.beans.factory;

import by.gbyzzz.task04figures.beans.Figure;
import by.gbyzzz.task04figures.beans.Point;

import java.util.List;

public interface FigureFactory<T extends Figure> {
    T create(String name, List<Point> points);
}
