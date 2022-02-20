package by.gbyzzz.task06chainofresponsibility.service.interpreter;

import java.util.ArrayDeque;


public class Context {
    private ArrayDeque<Integer> values=new ArrayDeque<>();

    public Integer popValue() {
        return this.values.pop();
    }

    public void pushValue(Integer value) {
        this.values.push(value);
    }

}
