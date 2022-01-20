package by.gbyzzz.task04figures.services;

import by.gbyzzz.task04figures.beans.Point;
import by.gbyzzz.task04figures.beans.Pyramid;
import by.gbyzzz.task04figures.beans.registrator.Registrator;

public class ApothemSize implements PyramidCalculations{
    public void calc(Pyramid pyramid, Registrator registrator){
        double x;
        double y;
        double z;

       x = (pyramid.getPoints().get(0).getX() + pyramid.getPoints().get(1).getX())/2;
       y = (pyramid.getPoints().get(0).getY() + pyramid.getPoints().get(1).getY())/2;
       z = (pyramid.getPoints().get(0).getZ() + pyramid.getPoints().get(1).getZ())/2;
       Point sideCenter = new Point(x,y,z);

       x = sideCenter.getX()-Math.abs(pyramid.getPoints().get(0).getX()-sideCenter.getX());
       y = sideCenter.getY()-Math.abs(pyramid.getPoints().get(0).getY()-sideCenter.getY());
       z = sideCenter.getZ()-Math.abs(pyramid.getPoints().get(0).getZ()-sideCenter.getZ());
       Point center = new Point(x,y,z);

       if(pyramid.getHeightParallelAxis().equals("x")){
           x = center.getX() + pyramid.getHeight();
       } else if(pyramid.getHeightParallelAxis().equals("y")){
           y = center.getY() + pyramid.getHeight();
       } else {
           z = center.getZ()+pyramid.getHeight();
       }

       Point heightPoint = new Point(x,y,z);

        double res = Math.sqrt(Math.pow(heightPoint.getX() - sideCenter.getX(), 2)
                + Math.pow(heightPoint.getY() - sideCenter.getY(), 2)
                + Math.pow(heightPoint.getY() - sideCenter.getY(), 2));

        registrator.setApothem(res);
    }
}
