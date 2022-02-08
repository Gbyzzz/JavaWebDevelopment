package by.gbyzzz.task04figures.services;

import by.gbyzzz.task04figures.beans.Point;
import by.gbyzzz.task04figures.beans.Pyramid;

import java.util.List;

public class PyramidValidator implements ValidateFigure<Pyramid> {
    @Override
    public boolean validate(final Pyramid pyramid) {
        boolean isValidPyramid = false;
        boolean isValidPoints = false;
        boolean isValidHeight = false;
        boolean isValidAxis = false;
        List<Point> points = pyramid.getPoints();
        if (points.size() == 2 && !points.get(0).equals(points.get(1)) && points.get(0).getX() != null
        && points.get(0).getY() != null && points.get(0).getZ() != null && points.get(1).getX() != null
                && points.get(1).getY() != null && points.get(1).getZ() != null) {
            isValidPoints = true;

            if (pyramid.getHeight() != null && pyramid.getHeight() > 0) {
                isValidHeight = true;
            }

            if (pyramid.getHeightParallelAxis().equals("x") || pyramid.getHeightParallelAxis().equals("y") || pyramid.getHeightParallelAxis().equals("z")) {
                if (pyramid.getHeightParallelAxis().equals("x") && points.get(0).getX().equals(points.get(1).getX())) {
                    isValidAxis = true;
                } else if (pyramid.getHeightParallelAxis().equals("y") && points.get(0).getY().equals(points.get(1).getY())) {
                    isValidAxis = true;
                } else if (pyramid.getHeightParallelAxis().equals("z") && points.get(0).getZ().equals(points.get(1).getZ())) {
                    isValidAxis = true;
                }
            }

        }
        if (isValidAxis == true && isValidPoints == true && isValidHeight == true) {
            isValidPyramid = true;
        }
        return isValidPyramid;
    }
}
