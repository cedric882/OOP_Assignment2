import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result1 {

    /*sample input
     *      3
        11 2 4
        4 5 6
        10 8 -12
     */

    public static int diagonalDifference(int[][] arr) {
        int sum = 0, sum1 = 0, samp = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }

                if (j == samp) {
                    sum1 += arr[i][j];

                }


            }
            samp--;

        }
        int answer = sum - sum1;
        int b = 0;

        // absolute value means negative turns to positive
        if (answer < 0)
            b = -answer;



        return b;
    }

}

public class DiagonalDifferences2d {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr1 = new int[n][n];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        int result = Result1.diagonalDifference(arr1);
        System.out.println(result);


    }
}
