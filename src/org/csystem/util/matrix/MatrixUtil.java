package org.csystem.util.matrix;

import java.util.Random;

import static org.csystem.util.array.ArrayUtil.*;

public class MatrixUtil {

    public static int [][] add(int [][] a, int [][] b)
    {
        int [][] result = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a[i].length; ++j)
                result[i][j] = a[i][j] + b[i][j];

        return result;
    }

    public static void addBy(int [][] a, int val)
    {
        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a[i].length; ++j)
                a[i][j] = a[i][j] + val; //+=
    }
    public static int [][] getRandomMatrix(Random r, int m, int n, int min, int bound)
    {
        int [][] result = new int[m][];

        for (int i = 0; i < m; ++i)
            result[i] = getRandomArray(r, n, min, bound);

        return result;
    }

    public static int [][] getRandomSquareMatrix(Random r, int n, int min, int bound)
    {
        return getRandomMatrix(r, n, n, min, bound);
    }

    public static boolean isMatrix(int [][] a)
    {
        for (int i = 1; i < a.length; ++i)
            if (a[0].length != a[i].length)
                return false;

        return true;
    }
    public static boolean isSquareMatrix(int [][] a)
    {
        return isMatrix(a) && a[0].length == a.length;
    }

    public static void multiplyBy(int [][] a, int val)
    {
        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a[i].length; ++j)
                a[i][j] = a[i][j] * val;
    }

    public static int sumDiagonal(int [][] a)
    {
        int sum = 0;

        for (int i = 0; i < a.length; ++i)
            sum += a[i][i];

        return sum;
    }

    public static void swap(int [][] a, int i1, int j1, int i2, int j2)
    {
        int temp = a[i1][j1];
        a[i1][j1] = a[i2][j2];
        a[i2][j2] = temp;
    }

    public static int [][] subtract(int [][] a, int [][] b)
    {
        int [][] result = new int[a.length][a[0].length];

        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a[i].length; ++j)
                result[i][j] = a[i][j] - b[i][j];

        return result;
    }

    public static void subtractBy(int [][] a, int val)
    {
        addBy(a, -val);
    }

    public static int [][] transpose(int [][] a)
    {
        int [][] result = new int[a[0].length][a.length];

        for (int i = 0; i < a.length; ++i)
            for (int j = 0; j < a[i].length; ++j) {
                result[j][i] = a[i][j];
            }

        return result;
    }

}
