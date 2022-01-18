package by.gbyzzz.task04figures.services;

import by.gbyzzz.task04figures.beans.Pyramid;

public class SideSizeOfBase {
    public double getSideSizeOfBase(Pyramid pyramid){
        double res = Math.sqrt(Math.pow(pyramid.getPoints().get(0).getX() - pyramid.getPoints().get(1).getX(), 2)
        + Math.pow(pyramid.getPoints().get(0).getY() - pyramid.getPoints().get(1).getY(), 2)
        + Math.pow(pyramid.getPoints().get(0).getZ() - pyramid.getPoints().get(1).getZ(), 2));
        return res;
    }
}
