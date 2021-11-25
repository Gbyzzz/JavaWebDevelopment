package by.gbyzzz.task01javalinear.service;

public class GeometryService {


    public double triangleHeight(double a){
        double ans;
        ans =  a * Math.sqrt(3) / 2;
        return ans;
    }
    public double triangleSr(double a){
        double ans;
        ans =  a * Math.sqrt(3)/3;
        return ans;
    }
    public double triangleCr(double a){
        double ans;
        ans =  a * Math.sqrt(3)/6;
        return ans;
    }
    public double triangleSq(double a){
        double ans;
        ans =  a * a * Math.sqrt(3) / 4;
        return ans;
    }
}
