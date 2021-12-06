package by.gbyzzz.task01javalinear.service;


import by.gbyzzz.task01javalinear.entity.Data;

/**
 * This class has methods to calculate all arithmetic tasks.
 * @author Anton Pinchuk
 *
 */

public final class ArithmeticService {

    public static double mySqrt(final double n) {
        double result = 1.0;
        double temp = result - (result * result - n) / (2 * result);

        while (Math.abs(result - temp) > 0.0000001) {
            result = temp;
            temp = result - (result * result - n) / (2 * result);
        }
        return result;
    }

    //task01
    public double average(final double a, final double b) {
        return (a + b) / 2;
    }

    public double boat(final double v1, final double v2, final double t1, final double t2) {
        return v1 * t1 + Math.abs((v1 - v2) * t2);
    }

    public double averageCubed(final double a, final double b) {
        return (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
    }
    public double averageGeom(final double a, final double b) {
        return mySqrt(Math.abs(a) * Math.abs(b));
    }

    public double expr(final double x, final double y) {
        return 2 * x + (y - 2) * 5;
    }

    // task02
    public int positiveNumCount(final double a, final double b, final double c) {
        int i = 0;
        if (a > 0) {
            i++;
        }
        if (b > 0) {
            i++;
        }
        if (c > 0) {
            i++;
        }

        return i;
    }

    public double compareTwoNums(final double a, final double b) {
        double res = 0;
        if (a > b) {
            res = b;
        } else if (a < b) {
            res = a;
        } else {
            res = 0;
        }
        return res;
    }


    public double taskWithTwoNums(final double a, final double b) {
        double res;
        if (a != b) {
            if (a > b) {
                res = a;
            } else {
                res = b;
            }
        } else {
            res = 0;
        }

        return res;
    }

    public double compareWithThree(final double a) {
        double res;
        if (a == 3) {
            return 0;
        } else {
            res = a < 3 ? 1 : -1;
            return res;
        }
    }

    //task03
    public double rowOfNums(final double e, int n) {
        double sum = 0;
        double a;
        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                a = (1 / (Math.pow(2, i))) + (1 / (Math.pow(3, i)));
                if (Math.abs(a) >= e) {
                    sum += a;
                }
                n++;
            }
        } else {
            for (int i = 0; i > n;) {
                a = (1 / (Math.pow(2, n))) + (1 / (Math.pow(3, n)));
                if (Math.abs(a) >= e) {
                    sum += a;
                }
                n++;
            }
        }
        return sum;
    }

    public int sumMaxMin(int min, final int max) {
        int sum = 0;
        while (min <= max) {
            sum += min;
            min += 2;
        }
        return sum;
    }

    public double rowMultiply(final double a, final int n) {
        double sum = a;
        for (int i = 1; i <= (n - 1); i++) {
            sum *= (a + i);
        }
        return sum;
    }

    public int multiply(final int a, final int b) {
        return a * b;
    }

    public Data switchTwoNumsBuff(int a, int b) {
    int c = 0;
    Data res = new Data();
    c = b;
    b = a;
    a = c;
    res.add(a);
    res.add(b);
    return res;
    }

    public Data switchTwoNumsArithm(int a, int b) {
        Data res = new Data();
        a  = b + a;
        b = a - b;
        a = a - b;
        res.add(a);
        res.add(b);
        return res;
    }

    public Data switchTwoNumsXOR(int a, int b) {
        Data res = new Data();
        a ^= b;
        b ^= a;
        a ^= b;
        res.add(a);
        res.add(b);
        return res;
    }

}