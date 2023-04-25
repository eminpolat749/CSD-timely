package org.csystem.util.matrix.test;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.matrix.MatrixUtil;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.matrix.MatrixUtil.sumDiagonal;

public class SumDiagonalTest {

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        for (int i = 0; i < count; ++i) {
            int [][] a = MatrixUtil.getRandomSquareMatrix(r, r.nextInt(2, 7), 0, 100);
            System.out.println("------------------------------------------------------------------------------");
            ArrayUtil.print(2, a);
            System.out.printf("Esas köşegen:%d%n", sumDiagonal(a));
            System.out.println("------------------------------------------------------------------------------");
        }

        System.out.println("Program sonu...");
    }

    public static void main(String [] args)
    {
        run();
    }

}
