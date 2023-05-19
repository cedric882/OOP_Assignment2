public class indexOfFunction {

    public static void main(String[] args) {

        String str1 = "ABCD";
        String str2 = "CDAB";
//ABCDABCD
        if((str1 + str1).indexOf(str2) != -1){
            System.out.println("e");
        }


    }
}
