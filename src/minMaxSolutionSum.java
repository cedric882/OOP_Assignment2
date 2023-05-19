import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class minMaxSolutionSum {

    static void minMax(List<Integer> arr) {
        int n = arr.size();

        int storeValuesIndex = 0, skip = 0;
        long sum = 0 ;
        long storeValues[] = new long[n];


        for (int j = 0; j < arr.size(); j++) {
            for (int i = 0; i < arr.size(); i++) {
                if (skip != i) {
                    sum += arr.get(i);
                    if (i == arr.size() - 1) {
                        storeValues[storeValuesIndex] = sum;
                        storeValuesIndex++;
                    }
                }
                else {
                    if (i == arr.size() - 1) {
                        storeValues[storeValuesIndex] = sum;
                        storeValuesIndex++;
                    }}

            }
            sum = 0;
            skip++;

        }

        long min = storeValues[0], max = storeValues[0];
        for (int i = 0; i < storeValues.length ; i++){
            if(storeValues[i] < max)
                max = storeValues[i];

            if(storeValues[i] > min)
                min = storeValues[i];
        }

        System.out.println(max +" " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = 5;
//        int arr[] = new int [n];
//        for(int i = 0; i< arr.length; i++){
//            arr[i] = sc.nextInt();
//        }
        List<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        minMax(arr1);
    }
}
