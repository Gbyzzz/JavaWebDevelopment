package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.service.ArrayService;

public class ShakeSort implements ArrayService {
    @Override
    public void sort(Number[] arr) {

    }

//    @Override
//    public void sort(int[]arr){
//        int temp = 0;
//        int left = 0;
//        int right = arr.length - 1;
//
//        do {
//
//            for (int i = left; i < right; i++) {
//
//
//                if (arr[i] > arr[i + 1]) {
//                    temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//            right--;
//            for (int i = right; i > left; i--) {
//                if (arr[i] < arr[i - 1]) {
//                    temp = arr[i];
//                    arr[i] = arr[i - 1];
//                    arr[i - 1] = temp;
//                }
//            }
//            left++;
//        } while (left < right);
//    }
//
//    @Override
//    public void sort(double[]arr){
//        double temp = 0;
//        int left = 0;
//        int right = arr.length - 1;
//
//        do {
//
//            for (int i = left; i < right; i++) {
//
//
//                if (arr[i] > arr[i + 1]) {
//                    temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//            right--;
//            for (int i = right; i > left; i--) {
//                if (arr[i] < arr[i - 1]) {
//                    temp = arr[i];
//                    arr[i] = arr[i - 1];
//                    arr[i - 1] = temp;
//                }
//            }
//            left++;
//        } while (left < right);
//    }
}
