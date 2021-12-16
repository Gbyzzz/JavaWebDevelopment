package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.service.ArrayService;

public class BubbleSort implements ArrayService {

    @Override
    public void sort(Number[] arr) {
        boolean isSorted = false;
        System.out.println(arr[0]);;
        while(!isSorted) {
            if(arr[0]instanceof Integer){
                int buf;
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(Integer.parseInt(String.valueOf(arr[i]))>Integer.parseInt(String.valueOf(arr[i+1]))) {
                    isSorted = false;

                    buf = (int) arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buf;
                }
            }
            }else if(arr[0]instanceof Double){
                double buf;
                isSorted = true;
                for (int i = 0; i < arr.length-1; i++) {
                    if(Double.parseDouble(String.valueOf(arr[i]))>Double.parseDouble(String.valueOf(arr[i+1]))) {
                        isSorted = false;

                        buf = (double) arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = buf;
                    }
                }
            }
        }
    }

//    @Override
//    public void sort(int[] arr) {
//        boolean isSorted = false;
//        int buf;
//        while(!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < arr.length-1; i++) {
//                if(arr[i]>arr[i+1]){
//                    isSorted = false;
//
//                    buf = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = buf;
//                }
//            }
//        }
//    }
}
