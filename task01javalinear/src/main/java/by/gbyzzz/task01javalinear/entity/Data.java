package by.gbyzzz.task01javalinear.entity;

import java.util.ArrayList;
import java.util.List;

public class Data {
    private List<Object> arr = new ArrayList<>();

    public double getArr(int i) {
        return (double) arr.get(i);
    }
    public double getArr(int i, int j) {
        return (double) arr.get(i);
    }

    public void add(double num) {
        arr.add(num);
    }

    public void add(int[] num) {
        arr.add(num);
    }

    public void add(boolean arg) {
        arr.add(arg);
    }

    public void add(String arg) {
        arr.add(arg);
    }

    public void clear(){
        arr.clear();
    }
}
