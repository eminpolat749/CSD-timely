package org.csystem.util.matrix.test;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.matrix.MatrixUtil;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;

public class SubtractTest {

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        int m = r.nextInt(2, 5);
        int n = r.nextInt(2, 5);

        for (int i = 0; i < count; ++i) {
            int [][] a = MatrixUtil.getRandomMatrix(r, m, n, 0, 100);
            int [][] b = MatrixUtil.getRandomMatrix(r, m, n, 0, 100);
            System.out.println("------------------------------------------------------------------------------");
            print(2, a);
            System.out.println();
            print(2, b);
            System.out.println();
            print(3, MatrixUtil.subtract(a, b));
            System.out.println("------------------------------------------------------------------------------");
        }

        System.out.println("Program sonu...");
    }

    public static void main(String [] args)
    {
        run();
    }

}
