import java.util.Scanner;

/**  calculate the perimeter and area of a triangle with the formulas:
 perimeter = a + b + c
 s = perimeter / 2
 area = Math.sqrt(s * (s - a) * (s - b) * (s - c))
 */

public class HeronFormula {

    public static void main(String[] args) {
        int repeat; //parameter to create repetition loop
        do {
            int xA, yA, xB, yB, xC, yC; //parameters for equations
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the coordinates of triangle ABC");
            System.out.print("x-coordinate of A: ");
            xA = in.nextInt();
            System.out.print("y-coordinate of A: ");
            yA = in.nextInt();
            System.out.print("x-coordinate of B: ");
            xB = in.nextInt();
            System.out.print("y-coordinate of B: ");
            yB = in.nextInt();
            System.out.print("x-coordinate of C: ");
            xC = in.nextInt();
            System.out.print("y-coordinate of C: ");
            yC = in.nextInt();

            System.out.println();
            System.out.println("Triangle: A(" + xA + ", " + yA + "), B(" + xB + ", " + yB + "), and C(" + xC + ", " + yC + ")");
            System.out.println();

            if (isLine(xA, yA, xB, yB, xC, yC)){
                System.out.println("coordinates make a line and not a triangle");
            }
            if (verify_input(xA, yA, xB, yB, xC, yC) && !isLine(xA, yA, xB, yB, xC, yC)) { //if the inputs are acceptable, calculate distance, perimeter and area
                distanceA(xA, xB, yA, yB);
                distanceB(xB, xC, yB, yC);
                distanceC(xA, xC, yA, yC);
                perimeter(distanceA(xA, xB, yA, yB), distanceB(xB, xC, yB, yC), distanceC(xA, xC, yA, yC));
                area(distanceA(xA, xB, yA, yB), distanceB(xB, xC, yB, yC), distanceC(xA, xC, yA, yC));
            }

            System.out.println();
            System.out.print("Would you like to repeat the program (1 for yes, 2 for no)? "); //prompt user to repeat the program
            repeat = in.nextInt();

        } while(repeat==1);
        System.out.print("End of program.");

    }

    /** verify if the parameters the user inputs are in range [0 – 40]
     @param xA parameter of the equation
     @param yA parameter of the equation
     @param xB parameter of the equation
     @param yB parameter of the equation
     @param xC parameter of the equation
     @param yC parameter of the equation
     if the parameters are within range, return true
     otherwise, return false
     */

    public static boolean verify_input (int xA, int yA, int xB, int yB, int xC, int yC){
        if (xA < 0 || yA < 0 || xA > 40 || yA > 40){
            System.out.println("coordinate (" + xA + ", " + yA + ") is not in acceptable range");
        }if (xB < 0 || yB < 0 || xB > 40 || yB > 40){
            System.out.println("coordinate (" + xB + ", " + yB + ") is not in acceptable range");
        }if (xC < 0 || yC < 0 || xC > 40 || yC > 40) {
            System.out.println("coordinate (" + xC + ", " + yC + ") is not in acceptable range");
        }if (xA < 0 || yA < 0 || xA > 40 || yA > 40 || xB < 0 || yB < 0 || xB > 40 || yB > 40 || xC < 0 || yC < 0 || xC > 40 || yC > 40){
            return false;
        } else{
            return true;
        }
    }

    /** verify if the parameters the user inputs make a line
     @param xA parameter of the equation
     @param yA parameter of the equation
     @param xB parameter of the equation
     @param yB parameter of the equation
     @param xC parameter of the equation
     @param yC parameter of the equation
     if the parameters make a line, return true
     otherwise, return false
     */

    public static boolean isLine (int xA, int yA, int xB, int yB, int xC, int yC) {
        if ((xB - xA) * (yC - yA) - (yB - yA) * (xC - xA) == 0){
            return true;
        }else{
            return false;
        }
    }

    /** calculate the distance from two points with the form side = Math.sqrt(Math.pow(xA - xB, 2) + Math.pow(yA - yB, 2)) and return value
     @param xA parameter of the equation
     @param yA parameter of the equation
     @param xB parameter of the equation
     @param yB parameter of the equation
     @return distanceA
     */

    public static double distanceA (int xA, int xB, int yA, int yB) {
        return Math.sqrt(Math.pow(xA - xB, 2) + Math.pow(yA - yB, 2));
    }

    /** calculate the distance from two points with the form side = Math.sqrt(Math.pow(xB - xC, 2) + Math.pow(yB - yC, 2)) and return value
     @param xB parameter of the equation
     @param yB parameter of the equation
     @param xC parameter of the equation
     @param yC parameter of the equation
     @return distanceB
     */

    public static double distanceB (int xB, int xC, int yB, int yC) {
        return Math.sqrt(Math.pow(xB - xC, 2) + Math.pow(yB - yC, 2));
    }

    /** calculate the distance from two points with the form side = Math.sqrt(Math.pow(xC - xA, 2) + Math.pow(yC - yA, 2)) and return value
     @param xA parameter of the equation
     @param yA parameter of the equation
     @param xC parameter of the equation
     @param yC parameter of the equation
     @return distanceC
     */

    public static double distanceC (int xA, int xC, int yA, int yC) {
        return Math.sqrt(Math.pow(xC - xA, 2) + Math.pow(yC - yA, 2));
    }

    /** calculate the perimeter of the form sideA + sideB + sideC and return value
     @param distanceA parameter of the equation
     @param distanceB parameter of the equation
     @param distanceC parameter of the equation
     @return perimeter
     */

    public static double perimeter (double distanceA, double distanceB, double distanceC){
        double perimeter = distanceA + distanceB + distanceC;
        System.out.println("Perimeter = " + (float)perimeter);
        return perimeter;
    }

    /** calculate the area of the forms s = (sideA + sideB + sideC) / 2 and area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC)) and return value
     @param distanceA parameter of the equation
     @param distanceB parameter of the equation
     @param distanceC parameter of the equation
     @return area
     */

    public static double area (double distanceA, double distanceB, double distanceC){

        double s = (distanceA + distanceB + distanceC) / 2;
        double area = Math.sqrt(s * (s - distanceA) * (s - distanceB) * (s - distanceC));
        System.out.println("Area = " + (float)area);
        return area;
    }
}
