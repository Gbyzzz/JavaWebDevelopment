package by.gbyzzz.task05multithreading.service.impl.arrays;

import by.gbyzzz.task05multithreading.beans.MyArray;
import by.gbyzzz.task05multithreading.dal.FileIOFactory;
import by.gbyzzz.task05multithreading.service.ArrayService;

public class MergeSort implements ArrayService {
    @Override
    public MyArray execute(final String... str) {
        FileIOFactory fileIOFactory = FileIOFactory.getInstance();
        MyArray myArray = fileIOFactory.getFileIO().readFileToArray(str[0]);
        Number[][] arr = myArray.getArr();
            Number[][] tmp;
            Number[][] arrSrc = arr;
            Number[][] arrNew = new Number[arr.length][arr[0].length];

            int size = 1;
            while (size < arr[0].length) {
                for (int i = 0; i < arr[0].length; i += 2 * size) {
                    merge(arrSrc, i, arrSrc, i + size, arrNew, i, size);
                }

                tmp = arrSrc;
                arrSrc = arrNew;
                arrNew = tmp;

                size = size * 2;
            }

        myArray.setArr(arrSrc);
        return myArray;
    }


    private static void merge(final Number[][] src1, final int src1Start,
                              final Number[][] src2, final int src2Start,
                              final Number[][] res, final int resStart, final int size) {
        int i1 = src1Start;
        int i2 = src2Start;

        int src1End = Math.min(src1Start + size, src1[0].length);
        int src2End = Math.min(src2Start + size, src2[0].length);

        if (src1Start + size > src1[0].length) {
            for (int i = src1Start; i < src1End; i++) {
                res[0][i] = src1[0][i];
            }
            return;
        }

        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = resStart; i < resStart + iterationCount; i++) {
            if (src1[0][0] instanceof Integer) {
                if (i1 < src1End && (i2 >= src2End || src1[0][i1].intValue() < src2[0][i2].intValue())) {
                    res[0][i] = src1[0][i1];
                    i1++;
                } else {
                    res[0][i] = src2[0][i2];
                    i2++;
                }
            } else if (src1[0][0] instanceof Double) {
                if (i1 < src1End && (i2 >= src2End || src1[0][i1].doubleValue() < src2[0][i2].doubleValue())) {
                    res[0][i] = src1[0][i1];
                    i1++;
                } else {
                    res[0][i] = src2[0][i2];
                    i2++;
                }
            }
        }
    }
}
