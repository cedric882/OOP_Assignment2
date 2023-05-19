import java.util.Scanner;

public class AiCarDistance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the coordinates of point A
        System.out.print("Enter the x-coordinate of point A: ");
        double ax = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of point A: ");
        double ay = scanner.nextDouble();

        // Get the coordinates of point B
        System.out.print("Enter the x-coordinate of point B: ");
        double bx = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of point B: ");
        double by = scanner.nextDouble();

        // Calculate the distance between A and B
        double distance = Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));

        // Show the car's position on a 2D road
        System.out.println("Distance between A and B: " + distance);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) {
                if (i == 5 && j >= ax && j <= bx) {
                    System.out.print("C");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }
}


