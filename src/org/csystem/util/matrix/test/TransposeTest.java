package org.csystem.util.matrix.test;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.matrix.MatrixUtil;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.matrix.MatrixUtil.isMatrix;

public class TransposeTest {

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();

        for (int i = 0; i < count; ++i) {
            int [][] a = MatrixUtil.getRandomMatrix(r, r.nextInt(3,7), r.nextInt(3, 7), 0, 100);
            System.out.println("------------------------------------------------------------------------------");
            ArrayUtil.print(2, a);
            System.out.println("Matrisin devriği:");
            ArrayUtil.print(2, MatrixUtil.transpose(a));
            System.out.println("------------------------------------------------------------------------------");
        }

        System.out.println("Program sonu...");
    }

    public static void main(String [] args)
    {
        run();
    }

}
