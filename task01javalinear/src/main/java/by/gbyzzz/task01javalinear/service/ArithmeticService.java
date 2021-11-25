package by.gbyzzz.task01javalinear.service;


public class ArithmeticService {

    //task01
    public double average(double a, double b) {
        return (a + b) / 2;
    }

    public double boat(double v1, double v2, double t1, double t2) {
        return v1 * t1 + Math.abs((v1 - v2) * t2);
    }

    public double average3(double a, double b) {
        return (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
    }

    public double expr(double x, double y) {
        return 2 * x + (y - 2) * 5;
    }
// task02
    public int positiveNum(double a, double b, double c) {
        int i = 0;
        if (a > 0)
            i++;
        if (b > 0)
            i++;
        if (c > 0)
            i++;

        return i;
    }

    public double compare(double a, double b) {
        if (a > b)
            return a;
        else
            return b;
    }

    public boolean proidetNeProidet(double a, double b, double x, double y, double z) {
        if (x < a && y < b || y < a && x < b ||
                x < a && z < b || z < a && x < b ||
                z < a && y < b || y < a && z < b)
            return true;
        else
            return false;
    }

    public double[] zadacha17(double a, double b) {
        double[] res = new double[2];
        if (a != b) {
            if (a > b)
                b = a;
            else
                b = a;
        } else {
            b = 0;
            a = 0;
        }
        res[0] = a;
        res[1] = b;
        return res;
    }

//    public boolean compareWThree(double a) {
//        boolean res;
//        a>3 ? res=true : res=false;
//        return res;
//    }


    //task03
//public String[] mult3(){
//        String[] mult = new String[10];
//        for(int i = 0; i<10; i++){
//            mult[i] = "3 x " + (i+1) + " = " + 3*(i+1);
//        }
//        return mult;
//    }
}