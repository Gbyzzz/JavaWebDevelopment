package by.gbyzzz.task02javaarrays.service.impl;

import by.gbyzzz.task02javaarrays.service.ArrayService;

public class BubbleSort implements ArrayService<Number> {
    @Override
    public Number[] sort(Number[] arr) {
        boolean isSorted = false;
        Number buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i].doubleValue()>arr[i+1].doubleValue()){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        return arr;
    }
}
