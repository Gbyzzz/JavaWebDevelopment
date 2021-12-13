package by.gbyzzz.task02javaarrays.service.impl;

import by.gbyzzz.task02javaarrays.service.ArrayService;

public class ArrayServiceImpl {

    public int[] bubbleSort(int[] arr){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        return arr;
    }

    public int[] shakeSort(int[]arr){
        int temp;
        int leftSide = 0;
        int rightSide = arr.length - 1;

        do {

            for (int i = leftSide; i < rightSide; i++) { // Сортир. влево ищем МАКС. знач.


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

    public int[] selectSort(int[] arr){
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
        return arr;

    }

//    public int[] addressInsertSort(){
//
//    }

//    public int[] simpleInsertSort( int [] arr){
//        for (int i = 1; i < arr.length; i++){
//            int z=arr[x];
//            int y=x-1;
//            while(y>=0 && arr[y]>x){
//                arr[y+1] = arr[y];
//                y--;}
//            arr[y+1]=z;}
//
//    }

//    public int[] binarySort(){
//
//    }
//
//    public int[] shellsSort(){
//
//    }
//
//    public int[] externalSort(){
//
//    }
}
