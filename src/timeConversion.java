
public class timeConversion {


    public static void main(String[] args) {

        System.out.println(timeConverstion("07:05:45PM"));

    }

    public static String timeConverstion(String time){



        String result1 = "";
        int defaultTime = 12;
        //for AM timezone

        if (time.substring(8, 10).equals("AM")) {
            int time1 = Integer.parseInt(time.substring(0, 2));

            int adjustment = 0;
            if (time1 == 12) {
                adjustment = defaultTime - time1;
                result1 = adjustment + "0" + time.substring(2, 8);


            } else {
                result1 = time.substring(0, 8);
            }


        }

        // for PM timezone
        if (time.substring(8, 10).equals("PM")) {
            int time1 = Integer.parseInt(time.substring(0, 2));


            if (time1 == 12) {
                result1 = time.substring(0, 8);

            } else {
                int result = defaultTime + time1;
                result1 = result + time.substring(2, 8);

            }


        }
       return result1;

    }


}
