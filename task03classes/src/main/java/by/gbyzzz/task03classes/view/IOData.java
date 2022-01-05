package by.gbyzzz.task03classes.view;

import by.gbyzzz.task03classes.beans.Bouquet;
import by.gbyzzz.task03classes.beans.Flowers;
import by.gbyzzz.task03classes.beans.Goods;

import java.util.List;
import java.util.Scanner;

public interface IOData {

    void output(String arg);

    void outputArr(Number[][] arr);

    void output(int arg);

    void output(double arg);

    Scanner input();

    void output(List<? extends Goods> goods);
    void output(Bouquet bouquet);

}

