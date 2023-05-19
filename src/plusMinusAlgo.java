import java.text.DecimalFormat;
import java.util.Scanner;
public class plusMinusAlgo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        plusMinus(arr);




    }
    public static void plusMinus(int[] arr){
        DecimalFormat df = new DecimalFormat("0.000000");
        int n = arr.length;
        double countPositive = 0, countNegative = 0, countZero = 0;
        for(int i=0; i<n; i++){

            if(arr[i] >=1){
                countPositive++;
            }
            else if(arr[i] == 0){
                countZero++;
            }
            else{
                countNegative++;
            }


        }


        System.out.println( df.format(countPositive/n));
        System.out.println(df.format(countNegative / n));
        System.out.println(df.format(countZero / n));
    }

}


