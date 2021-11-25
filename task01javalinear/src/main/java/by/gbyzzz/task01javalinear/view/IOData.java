package by.gbyzzz.task01javalinear.view;


import java.util.Scanner;

public class IOData {
    public void output(String arg) {
        System.out.println(arg);
    }

    public void output(int arg) {
        System.out.println(arg);
    }
    public void output(double arg) {
        System.out.println(arg);
    }

    public void output(int[] arg) {
        for (int i = 0; i < arg.length; i++) {
            System.out.print(arg[i] + "     ");
        }}

        public void output (String[] label, double[] arg){
            for (int i = 0; i < arg.length; i++) {
                System.out.print(label[i]);
                System.out.printf("%.2f" + "\n", arg[i]);
            }
        }
    public void output (String label, double arg){

        System.out.print(label);
        System.out.println(arg);

    }
        public int input ( int a, int b){
            int res;
            Scanner in = new Scanner(System.in);
            while (true) {
                if (in.hasNextInt()) {
                    res = in.nextInt();
                    if (res <= b && res >= a) {
                        break;
                    }

                } else {
                    in.next();
                }
                output("Invalid Input. Please enter a valid number between " + a + " and " + b + ":");
            }
            return res;
        }


        public double input () {
            double res;
            Scanner in = new Scanner(System.in);
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
                output("Invalid Input. Please enter a valid number");
            }
            return res;
        }
    }



