import java.util.Scanner;

public class CalculatingPi {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double radiusLength = 0.0;

        System.out.print("Please input a radius length in meters: ");

        while (in.hasNext()){
            radiusLength = in.nextDouble();
            System.out.println("The area of your circle of " + radiusLength + " meters has an area of " + (Math.PI * Math.pow(radiusLength, 2)) + " meters squared");
            System.out.print("Please input another length (meters): ");
        }
    }
}
