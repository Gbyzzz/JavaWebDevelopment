package by.gbyzzz.task01javalinear.view;


import java.util.Scanner;

public class IOData {

    InputValidator inputValidator = new InputValidator();

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
                res = inputValidator.oddInt(in);
                break;
            case "range":
                res = inputValidator.rangeInt(in, a, b);
                break;
            default:
                break;
        }

        return res;
    }


    public double input() {
        Scanner in = new Scanner(System.in);
        double res = inputValidator.doubleNum(in);
        return res;
    }

    public double input(double min) {
        Scanner in = new Scanner(System.in);
        double res = inputValidator.fromNum(in, min);
        return res;
    }
    public int inputInt() {
        Scanner in = new Scanner(System.in);
        int res = inputValidator.intNum(in);
        return res;
    }
}




