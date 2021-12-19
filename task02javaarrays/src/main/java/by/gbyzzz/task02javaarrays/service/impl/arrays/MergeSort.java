package by.gbyzzz.task02javaarrays.service.impl.arrays;

import by.gbyzzz.task02javaarrays.beans.MyArray;
import by.gbyzzz.task02javaarrays.dal.FileIOFactory;
import by.gbyzzz.task02javaarrays.service.ArrayService;

public class MergeSort implements ArrayService {
    @Override
    public MyArray execute(String... str) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        MyArray myArray = fileIOFactory.getFileIO().readFileToArray(str[0]);
        Number[][] arr = myArray.getArr();
            Number[][] tmp;
            Number[][] currentSrc = arr;
            Number[][] currentDest = new Number[arr.length][arr[0].length];

            int size = 1;
            while (size < arr[0].length) {
                for (int i = 0; i < arr[0].length; i += 2 * size) {
                    merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
                }

                tmp = currentSrc;
                currentSrc = currentDest;
                currentDest = tmp;

                size = size * 2;
            }

        myArray.setArr(currentSrc);
        return myArray;
    }


    private static void merge(Number[][] src1, int src1Start,
                              Number[][] src2, int src2Start,
                              Number[][] dest, int destStart, int size) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1[0].length);
        int src2End = Math.min(src2Start + size, src2[0].length);

        if (src1Start + size > src1[0].length) {
            for (int i = src1Start; i < src1End; i++) {
                dest[i] = src1[i];
            }
            return;
        }

        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (src1[0][0] instanceof Integer) {
                if (index1 < src1End && (index2 >= src2End || src1[0][index1].intValue() < src2[0][index2].intValue())) {
                    dest[0][i] = src1[0][index1];
                    index1++;
                } else {
                    dest[0][i] = src2[0][index2];
                    index2++;
                }
            } else if (src1[0][0] instanceof Double) {
                if (index1 < src1End && (index2 >= src2End || src1[0][index1].doubleValue() < src2[0][index2].doubleValue())) {
                    dest[0][i] = src1[0][index1];
                    index1++;
                } else {
                    dest[0][i] = src2[0][index2];
                    index2++;
                }
            }
        }
    }
}
