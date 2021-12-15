import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates the wind-chill index");
        System.out.print("Enter the temperature in Celsius: ");
        double ta = input.nextDouble();
        System.out.print("Enter the wind speed kilometers per hour: ");
        double v = input.nextDouble();
        double twc = 13.112 + (0.6215 * ta) - (11.37 * Math.pow(v,0.16)) + (0.3965 * ta * (Math.pow(v,0.16)));
        System.out.println("The wind chill index is " + twc);
    }
}
