package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.service.ArrayService;

public class SelectSort implements ArrayService {

    @Override
    public void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int pos = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    pos = j;
                    min = arr[j];
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }
    }

    @Override
    public void sort(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            int pos = i;
            double min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min) {
                    pos = j;
                    min = arr[j];
                }
            }
            arr[pos] = arr[i];
            arr[i] = min;
        }
    }
}
