package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.service.ArrayService;

public class ShakeSort implements ArrayService {

    @Override
    public int[] sort(int[]arr){
        int temp = 0;
        int leftSide = 0;
        int rightSide = arr.length - 1;

        do {

            for (int i = leftSide; i < rightSide; i++) {


                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            rightSide--;
            for (int i = rightSide; i > leftSide; i--) {
                if (arr[i] < arr[i - 1]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            leftSide++;
        } while (leftSide < rightSide);
        return arr;
    }

    @Override
    public double[] sort(double[]arr){
        double temp = 0;
        int leftSide = 0;
        int rightSide = arr.length - 1;

        do {

            for (int i = leftSide; i < rightSide; i++) {


                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            rightSide--;
            for (int i = rightSide; i > leftSide; i--) {
                if (arr[i] < arr[i - 1]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
            leftSide++;
        } while (leftSide < rightSide);
        return arr;
    }
}
