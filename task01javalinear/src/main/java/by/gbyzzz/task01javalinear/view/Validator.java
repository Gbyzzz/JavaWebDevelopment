package by.gbyzzz.task01javalinear.view;

import java.util.Scanner;

public class Validator {


    public int rangeInt(Scanner in, int min, int max) {
        int res = 0;
        while (true) {
            if (in.hasNextInt()) {
                res = in.nextInt();
                if (res <= max && res >= min) {
                    break;
                }

            } else {
                in.next();
            }
            System.out.println("Invalid Input. Please enter a valid number between " + min + " and " + max + ":");
        }
        return res;
    }

    public int oddInt(Scanner in) {
        int res;
        while (true) {
            if (in.hasNextInt()) {
                res = in.nextInt();
                if (res % 2 == 1) {
                    break;
                }

            } else {
                in.next();
            }
            System.out.println("Invalid Input. Please enter a valid number");
        }
        return res;
    }

    public double fromNum(Scanner in, double min) {

        double res;
        while (true) {
            if (in.hasNextDouble()) {
                res = in.nextDouble();
                if (res > min)
                    break;
            } else if (in.hasNextInt()) {
                    res = in.nextInt();
                    if (res > min) {
                        break;
                    }
                } else {
                    in.next();
                }
            System.out.println("Invalid Input. Please enter a valid number bigger than " + min + ":");
            }

        return res;
    }

    public double doubleNum (Scanner in){
        double res;
        while (true) {
            if (in.hasNextDouble()) {
                res = in.nextDouble();
                break;
            } else {
                if (in.hasNextInt()) {
                    res = in.nextInt();
                    break;
                } else {
                    in.next();
                }
            }
            System.out.println("Invalid Input. Please enter a valid number");
        }
        return  res;
    }
}
