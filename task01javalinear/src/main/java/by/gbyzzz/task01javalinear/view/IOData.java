package by.gbyzzz.task01javalinear.view;


import java.util.Scanner;

public class IOData {

    Validator validator = new Validator();

    public void output(String arg) {
        System.out.println(arg);
    }

    public void output(int arg) {
        System.out.println(arg);
    }

    public void output(double arg) {
        System.out.println(arg);
    }

//    public void output(int[] arg) {
//        for (int i = 0; i < arg.length; i++) {
//            System.out.print(arg[i] + "     ");
//        }
//    }
//
//    public void output(String[] label, double[] arg) {
//        for (int i = 0; i < arg.length; i++) {
//            System.out.print(label[i]);
//            System.out.printf("%.2f" + "\n", arg[i]);
//        }
//    }
//
    public void output(String label, double arg) {

        System.out.print(label);
        System.out.printf("%.2f" + "\n", arg);

    }

    public int input(String arg, int a, int b) {
        int res = 0;
        Scanner in = new Scanner(System.in);
        switch (arg) {
            case "odd":
                res = validator.oddInt(in);
                break;
            case "range":
                res = validator.rangeInt(in, a, b);
                break;
            default:
                break;
        }

        return res;
    }


    public double input() {
        Scanner in = new Scanner(System.in);
        double res = validator.doubleNum(in);
        return res;
    }

    public double input(double min) {
        Scanner in = new Scanner(System.in);
        double res = validator.fromNum(in, min);
        return res;
    }
}




