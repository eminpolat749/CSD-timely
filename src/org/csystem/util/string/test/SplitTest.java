package org.csystem.util.string.test;

import org.csystem.util.string.StringUtil;

import java.util.Random;
import java.util.Scanner;

import static org.csystem.util.array.ArrayUtil.print;
import static org.csystem.util.string.StringUtil.getRandomTextsTR;
import static org.csystem.util.string.StringUtil.join;

public class SplitTest {

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        Random r = new Random();


        for (;;) {
            System.out.print("Bir yazı giriniz:");
            String s = kb.nextLine();

            if ("quit".equals(s))
                break;

            System.out.print("Ayraçları giriniz:");
            String delimiters = kb.nextLine();

            System.out.println("-------------------------------------------");
            String [] words = StringUtil.split(s, delimiters, r.nextBoolean());

            for (int i = 0; i < words.length; ++i)
                System.out.printf("{%s}%n", words[i]);
            System.out.println("-------------------------------------------");
        }
    }

    public static void main(String [] args)
    {
        run();
    }

}
