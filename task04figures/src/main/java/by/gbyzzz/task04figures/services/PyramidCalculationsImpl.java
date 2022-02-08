package by.gbyzzz.task04figures.services;

import by.gbyzzz.task04figures.beans.Figure;
import by.gbyzzz.task04figures.beans.Point;
import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.Registrator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;

public class PyramidCalculationsImpl implements PyramidCalculations {
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void calc(final Figure figure, final Registrator registrator) {
        if (figure instanceof Pyramid) {
            double height = ((Pyramid) figure).getHeight();
            List<Point> points = ((Pyramid) figure).getPoints();
            String axis = ((Pyramid) figure).getHeightParallelAxis();
            double diagonalSize = diagonalSizeCalc(points);
            double baseSideSize = baseSideSize(diagonalSize);
            registrator.setArea(Math.round(area(baseSideSize, height)));
            registrator.setPerimeter(perimeter(baseSideSize, diagonalSize, height));
            registrator.setVolume(volume(baseSideSize, height));
            registrator.setRatio(ratio(points, baseSideSize, height, axis, volume(baseSideSize, height)));
            registrator.setOnAxis(isOnAxis(points));
        } else {
        LOGGER.error("You've provided wrong instance to make calculations");
        }
    }

    private double mySqrt(final Double n) {
        double result = 1.0;
        double temp = result - (result * result - n) / (2 * result);

        while (Math.abs(result - temp) > 0.0000001) {
            result = temp;
            temp = result - (result * result - n) / (2 * result);
        }
        return result;
    }

    private double diagonalSizeCalc(final List<Point> points) {
    return mySqrt(Math.pow((points.get(0).getX() - points.get(1).getX()), 2)
            + Math.pow((points.get(0).getY() - points.get(1).getY()), 2)
            + Math.pow((points.get(0).getZ() - points.get(1).getZ()), 2));
    }

    private double baseSideSize(final double diagonalSize) {

        return mySqrt(diagonalSize * diagonalSize / 2);
    }

    private double perimeter(final double baseSideSize, final double diagonalSize, final double height) {
        double sideEdgeSize = Math.hypot(diagonalSize, height);
        return (baseSideSize + sideEdgeSize) * 4;
    }

    private double area(final double baseSideSize, final double height) {
        double apothem = Math.hypot(baseSideSize, height);
        return baseSideSize * baseSideSize + apothem * baseSideSize * 4;
    }

    private double volume(final double baseSideSize, final double height) {
        return (baseSideSize * baseSideSize * height) / 3;
    }

    private double ratio(final List<Point> points, final double baseSideSize, final double height, final String axis, final double volume) {
        double res = 1;
        if (axis.equals("x")) {
           if (points.get(0).getX() < 0 && (points.get(0).getX() + height) > 0) {
               double volumeOfSmallPyramid = smallPyramidVolume(points.get(0).getX(), height, baseSideSize);
               res = (volume - volumeOfSmallPyramid) / volumeOfSmallPyramid;
           }
        } else if (axis.equals("y")) {
               if (points.get(0).getY() < 0 && (points.get(0).getY() + height) > 0) {
                   double volumeOfSmallPyramid = smallPyramidVolume(points.get(0).getY(), height, baseSideSize);
               res = (volume - volumeOfSmallPyramid) / volumeOfSmallPyramid;
           }
        } else if (axis.equals("z")) {
            if (points.get(0).getZ() < 0 && (points.get(0).getZ() + height) > 0) {
                double volumeOfSmallPyramid = smallPyramidVolume(points.get(0).getZ(), height, baseSideSize);
                res = (volume - volumeOfSmallPyramid) / volumeOfSmallPyramid;
            }
        }
        return res;
    }

    private double smallPyramidVolume(final double basePoint, final double height, final double baseSideSize) {
        double smallHeight = basePoint + height;
        double smallBaseSideSize = baseSideSize * smallHeight / height;
        return smallBaseSideSize * smallBaseSideSize * smallHeight / 3;
    }

    private boolean isOnAxis(final List<Point> points) {
        boolean isOnAxis = false;
        if (points.get(0).getX() == 0 && points.get(1).getX() == 0 || points.get(0).getY() == 0
                && points.get(1).getY() == 0 || points.get(0).getZ() == 0 && points.get(1).getZ() == 0) {
            isOnAxis = true;
        }
        return isOnAxis;
    }

}
