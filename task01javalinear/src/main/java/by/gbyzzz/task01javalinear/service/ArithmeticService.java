package by.gbyzzz.task01javalinear.service;


import by.gbyzzz.task01javalinear.entity.Data;

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
    public int positiveNumCount(double a, double b, double c) {
        int i = 0;
        if (a > 0)
            i++;
        if (b > 0)
            i++;
        if (c > 0)
            i++;

        return i;
    }

    public double compareTwoNums(double a, double b) {
        if (a > b)
            return b;
        else
            return a;
    }



    public double taskWithTwoNums(double a, double b) {
        double res;
        if (a != b) {
            if (a > b)
                res = a;
            else
                res = b;
        } else {
            res = 0;
        }

        return res;
    }

    public double compareWithThree(double a) {
        double res;
       res = a<3 ? 1 : 0;
        return res;
    }


    //task03
    public double rowOfNums(double e, int n){
        double sum = 0;
        for (int i = 0; i < n; i++) {
            double a = (1 / (Math.pow(2, i))) + (1 / (Math.pow(3, i)));
            if (Math.abs(a) >= e) {
                sum += a;
                n++;
            }
            return sum;
        }
        return sum;
    }
    public int sumNinetyNine(){
        int sum = 0;
        int i=1;
        while (i<=99){
            sum+=i;
            i+=2;
        }
        return sum;
    }

    public double rowMultiply(double a, int n){
        double sum = a;
        for(int i = 1; i<=(n-1);i++){
            sum*=(a+i);
        }
        return sum;
    }
    public double multiply(double a, int b){
        return a*b;
    }

}