package by.gbyzzz.task01javalinear.entity;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Double> arr = new ArrayList<>();

    public double getArr(int i) {
        return arr.get(i);
    }

    public void add(double num) {
        arr.add(num);
    }
    public void clear(){
        arr.clear();
    }
}
