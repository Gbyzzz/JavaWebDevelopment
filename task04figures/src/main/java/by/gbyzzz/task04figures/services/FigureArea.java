package by.gbyzzz.task04figures.services;

import by.gbyzzz.task04figures.beans.Pyramid;

public class FigureArea {
    public double calcFigureArea(Pyramid pyramid){
        double res = (Math.pow(pyramid.getPoints().get(0).getX()-pyramid.getPoints().get(1).getX(), 2)
                + Math.pow(pyramid.getPoints().get(0).getY()-pyramid.getPoints().get(1).getY(), 2)
                + Math.pow(pyramid.getPoints().get(0).getZ()-pyramid.getPoints().get(1).getZ(), 2));
        return res;
    }
}
