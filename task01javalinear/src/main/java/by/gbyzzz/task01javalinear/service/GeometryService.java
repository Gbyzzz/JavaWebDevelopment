package by.gbyzzz.task01javalinear.service;

public class GeometryService {
ArithmeticService as = new ArithmeticService();

    public double triangleHeight(double a){
        double ans;
        ans =  a * as.mySqrt(3) / 2;
        return ans;
    }
    public double triangleDesR(double a){
        double ans;
        ans =  a * as.mySqrt(3)/3;
        return ans;
    }
    public double triangleInR(double a){
        double ans;
        ans =  a * as.mySqrt(3)/6;
        return ans;
    }
    public double triangleSq(double a){
        double ans;
        ans =  a * a * as.mySqrt(3) / 4;
        return ans;
    }
    public double passOrNot(double a, double b, double x, double y, double z) {
        if (x < a && y < b || y < a && x < b ||
                x < a && z < b || z < a && x < b ||
                z < a && y < b || y < a && z < b)
            return 1;
        else
            return 0;
    }
}
