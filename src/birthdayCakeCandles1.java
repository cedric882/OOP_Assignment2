public class birthdayCakeCandles1 {
    public static void main(String[] args) {
        int count = 0, max = 0;
        int [] arr = {1, 3, 3, 3};

        for(int i = 0; i < arr.length; i++){
            if (max < arr[i]) {
                max = arr[i];
            }

        }
        for(int i = 0; i < arr.length; i++){
           if(arr[i] == max){
               count++;
           }

        }

        // tallest candles
        System.out.println(count);

    }
}
