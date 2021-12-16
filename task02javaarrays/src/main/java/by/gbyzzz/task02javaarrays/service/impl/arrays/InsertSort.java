package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.service.ArrayService;

public class InsertSort implements ArrayService {
    @Override
    public void sort(Number[] arr) {
        if (arr[0] instanceof Integer) {
            for (int i = 1; i < arr.length; i++) {
                int current = Integer.parseInt(String.valueOf(arr[i]));
                int j = i;
                while (j > 0 && Integer.parseInt(String.valueOf(arr[j - 1])) > current) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = current;
            }
        } else if (arr[0] instanceof Double) {
            for (int i = 1; i < arr.length; i++) {
                double current = Double.parseDouble(String.valueOf(arr[i]));
                int j = i;
                while (j > 0 && Double.parseDouble(String.valueOf(arr[j - 1])) > current) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = current;
            }
        }
    }

//    public void sort (int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int current = arr[i];
//            int j = i;
//            while (j > 0 && arr[j - 1] > current) {
//                arr[j] = arr[j - 1];
//                j--;
//            }
//            arr[j] = current;
//        }
//    }
//
//    public void sort (double[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            double current = arr[i];
//            int j = i;
//            while (j > 0 && arr[j - 1] > current) {
//                arr[j] = arr[j - 1];
//                j--;
//            }
//            arr[j] = current;
//        }
//    }
}
