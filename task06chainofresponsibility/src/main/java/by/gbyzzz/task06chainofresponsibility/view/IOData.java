package by.gbyzzz.task06chainofresponsibility.view;

import java.util.Scanner;

public interface IOData {

    void output(String arg);

    void outputArr(Number[][] arr);

    void output(int arg);

    void output(double arg);

    Scanner input();

}

