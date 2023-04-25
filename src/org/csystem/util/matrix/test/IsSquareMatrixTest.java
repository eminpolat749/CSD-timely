package org.csystem.util.matrix.test;

import org.csystem.util.string.StringUtil;
import static org.csystem.util.matrix.MatrixUtil.*;

import java.util.Scanner;

public class IsSquareMatrixTest {

    public static void run()
    {
        int [][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int [][] b = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(isSquareMatrix(a) ? "Kare Matris" : "Kare Matris değil");
        System.out.println(isSquareMatrix(b) ? "Kare Matris" : "Kare Matris değil");
    }

    public static void main(String [] args)
    {
        run();
    }

}
