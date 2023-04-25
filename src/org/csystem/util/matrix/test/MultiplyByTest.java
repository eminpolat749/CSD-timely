package org.csystem.util.matrix.test;

import org.csystem.util.array.ArrayUtil;
import org.csystem.util.matrix.MatrixUtil;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;

public class MultiplyByTest {

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();

        System.out.print("Bir sayı giriniz:");
        int count = kb.nextInt();


        for (int i = 0; i < count; ++i) {
            int [][] a = MatrixUtil.getRandomMatrix(r, r.nextInt(2, 6), r.nextInt(2, 6), 0, 100);
            int val = r.nextInt(2, 8);
            System.out.println("------------------------------------------------------------------------------");
            print(2, a);
            System.out.println();
            System.out.printf("Value:%d%n", val);
            System.out.printf("Sonuç:%n");
            MatrixUtil.multiplyBy(a, val);
            print(3, a);
            System.out.println("------------------------------------------------------------------------------");
        }

        System.out.println("Program sonu...");
    }

    public static void main(String [] args)
    {
        run();
    }

}
