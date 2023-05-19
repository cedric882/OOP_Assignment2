package NewLineFunction;

import java.util.Scanner;

public class Main {
    public static String newLineFunction(String str) {
        String[] steps = str.split("\n");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < steps.length; i++) {
            result.append("Step ").append(i + 1).append(": ").append(steps[i]).append("\n\n");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            String result = newLineFunction1(str);
            System.out.println(result);

    }

    public static String newLineFunction1(String str) {
        String[] steps = str.split("\n");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < steps.length; i++) {
            result.append(steps[i]).append("\n\n");
        }
        return result.toString().trim();
    }
}