import java.util.Scanner;

/*
This program is used to solve a quadratic equation
based on values for a, b, and c provided by the user
 */

public class QuadraticFormula {
    public static void main(String[] args) {

        //User inputs values for a, b, and c

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for a: ");
        double a = input.nextDouble();
        System.out.print("Enter a value for b: ");
        double b = input.nextDouble();
        System.out.print("Enter a value for c: ");
        double c = input.nextDouble();

        if (a == 0 && b == 0) {
            /*
            Check if a and b are equal to zero
            If both a and b are equal to zero, display message of invalid input
             */

            System.out.println("Not a valid input. Try again.");
        }
        else if (a == 0) {
            /*
            Check if a is equal to zero
            If a=0, the equation is a linear equation. Calculate the root from E.3
            */
            System.out.println("Linear equation.");
            double x = -(c / b); //E.3
            System.out.println("x= " + x);

        } else {
            /*
            If both a and b are not zero
            Calculate delta
            */
            double d = Math.pow(b, 2) - (4 * a * c);

            /*
            Check if delta is positive
            If delta is positive, then the equation has two real roots.
            Calculate the roots from E.1 and E.2 and display the results.
             */
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("x1= " + x1);
                System.out.println("x2= " + x2);

                /*
                Check if delta is equal to zero
                If delta is zero, then the equation has double roots.
                 */
            } else if (d == 0) {
                System.out.println("Double roots.");
                double x3 = -b / (2 * a);
                System.out.println("x1, x2= " + x3);

                /*
                Check if delta is negative
                If delta is negative, then the equation has no roots.
                 */
            } else if (d < 0) {
                System.out.println("No real roots.");
            }
        }
    }
}
