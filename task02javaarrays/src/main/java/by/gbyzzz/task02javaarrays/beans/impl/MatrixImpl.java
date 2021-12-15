package by.gbyzzz.task02javaarrays.beans.impl;

import by.gbyzzz.task02javaarrays.beans.Array;

public class MatrixImpl<T extends Number> implements Array {
    T[][] matrix;

}
//public class Matrix {
//    private int[][] a;
//    private int n;
//    private int m;
//
//    public Matrix(int nn, int mm) {
//        n = nn;
//        m = mm;
//// creation and filling with random values
//        a = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                a[i][j] = (int) (Math.random() * 10);
//            }
//
//    }
//}