import java.io.*;
import java.util.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        Scanner sc = new Scanner(System.in);


        int []arr = new int[n];


        int samp = arr.length -1;
        String samp1= "";
        for (int s = 0; s < arr.length; s++){

            for (int u = 0; u < samp; u++){
                samp1 += " ";

            }

            for(int u = 0; u< arr.length - samp; u++){
                samp1 +="#";

            }
            if(s != arr.length - 1)
                samp1 += "\n";


            samp -=1;

        }
        System.out.println(samp1);

    }

}

public class Staircase2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
