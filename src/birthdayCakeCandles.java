import java.io.IOException;
import java.util.Scanner;

public class birthdayCakeCandles {
    public static void Solution(int [] arr) {




        int tempsamp = 0;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1] && i < 1) {
                tempsamp = arr[i];
            } else if (tempsamp < arr[i + 1]) {
                tempsamp = arr[i];

            }


        }
        for (int i = 0; i < arr.length - 1; i++) {
            //check the higher number


             if(arr[i] == tempsamp){
                count++;
            }

        }


        System.out.println(count);
    }
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr1 = new int[n+1];
        for (int i = 0; i < arr1.length-1; i++) {

                arr1[i] = sc.nextInt();
        }

        Solution(arr1);


    }
}
