package by.gbyzzz.task04figures.services;

import by.gbyzzz.task04figures.beans.Figure;
import by.gbyzzz.task04figures.beans.Point;
import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.registrator.Registrator;

import java.util.List;

public class PyramidCalculationsImpl implements PyramidCalculations{
    @Override
    public void calc(Figure figure, Registrator registrator) {
        if(figure instanceof Pyramid){
            Double height = ((Pyramid) figure).getHeight();
            List<Point> points = ((Pyramid) figure).getPoints();
            String axis = ((Pyramid) figure).getHeightParallelAxis();
            Double baseSideSize = baseSideSize(points);
            registrator.setArea(area(baseSideSize, height));
            registrator.setPerimeter(perimeter(baseSideSize, points, height));
            registrator.setVolume(volume(baseSideSize, height));
            registrator.setRatio(ratio(points,baseSideSize,height, axis, volume(baseSideSize, height)));
        }
    }

    private Double mySqrt(final Double n) {
        double result = 1.0;
        double temp = result - (result * result - n) / (2 * result);

        while (Math.abs(result - temp) > 0.0000001) {
            result = temp;
            temp = result - (result * result - n) / (2 * result);
        }
        return result;
    }

    private Double baseSideSize(List<Point>points){
        Double res = mySqrt(Math.pow(Math.pow(points.get(0).getX() - points.get(1).getX(),2) +
                Math.pow(points.get(0).getX() - points.get(1).getX(),2) +
                Math.pow(points.get(0).getX() - points.get(1).getX(),2), 2) / 2);
        return res;
    }

    private Double perimeter (Double baseSideSize, List<Point>points, Double height){
        Double sideEdgeSize = mySqrt(Math.pow((Math.pow(points.get(0).getX() - points.get(1).getX(),2) +
                Math.pow(points.get(0).getX() - points.get(1).getX(),2) +
                Math.pow(points.get(0).getX() - points.get(1).getX(),2))/2, 2) + height * height);
        return (baseSideSize + sideEdgeSize)*4;
    }

    private Double area(Double baseSideSize, Double height) {
        Double apothem = mySqrt(baseSideSize * baseSideSize + height * height);
        return baseSideSize*baseSideSize + apothem*baseSideSize*4;
    }

    private Double volume(Double baseSideSize, Double height){
        return (baseSideSize * baseSideSize * height) / 3;
    }

    private Double ratio (List<Point> points, Double baseSideSize, Double height, String axis, Double volume){
        Double res = Double.valueOf(1);
        if(axis.equals("x")){
           if(points.get(0).getX() < 0 && (points.get(0).getX() + height) > 0){
               Double volumeOfSmallPyramid = smallPyramidVolume(points.get(0).getX(), height, baseSideSize);
               res = (volume - volumeOfSmallPyramid) / volumeOfSmallPyramid;

           }
        } else if(axis.equals("y")) {
               if(points.get(0).getY() < 0 && (points.get(0).getY() + height) > 0){
               Double volumeOfSmallPyramid = smallPyramidVolume(points.get(0).getY(), height, baseSideSize);
               res = (volume - volumeOfSmallPyramid) / volumeOfSmallPyramid;

           }
        } else if(axis.equals("z")) {
            if (points.get(0).getY() < 0 && (points.get(0).getY() + height) > 0) {
                Double volumeOfSmallPyramid = smallPyramidVolume(points.get(0).getZ(), height, baseSideSize);
                res = (volume - volumeOfSmallPyramid) / volumeOfSmallPyramid;

            }
        }
        return res;
    }

    private Double smallPyramidVolume(Double basePoint, Double height, Double baseSideSize){
        Double smallHeight = basePoint + height;
        Double smallBaseSideSize = baseSideSize * smallHeight / height;
        return smallBaseSideSize * smallBaseSideSize * smallHeight / 3;
    }
}
