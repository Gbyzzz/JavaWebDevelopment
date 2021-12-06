package by.gbyzzz.task01javalinear.service;

/**
 * This class has methods to calculate all geometric tasks.
 * @author Anton Pinchuk
 *
 */

public final class GeometryService {
    private ArithmeticService as = new ArithmeticService();

    public double triangleHeight(final double a) {
        double ans;
        ans =  a * as.mySqrt(3) / 2;
        return ans;
    }
    public double triangleDesR(final double a) {
        double ans;
        ans =  a * as.mySqrt(3) / 3;
        return ans;
    }
    public double triangleInR(final double a) {
        double ans;
        ans =  a * as.mySqrt(3) / 6;
        return ans;
    }
    public double triangleSq(final double a) {
        double ans;
        ans =  a * a * as.mySqrt(3) / 4;
        return ans;
    }
    public double passOrNot(final double a, final double b, final double x, final double y, final double z) {
        if (x < a && y < b
                || y < a && x < b
                || x < a && z < b
                || z < a && x < b
                || z < a && y < b
                || y < a && z < b) {
            return 1;
        } else {
            return 0;
        }
    }
}
