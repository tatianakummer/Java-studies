import java.util.Scanner;

/*
This program is used to create an inverted half right-handed pyramid of numbers
The number of rows and numbers is based on an integer provided by the user
 */

public class Triangle {
    public static void main(String[] args) {
        int i, j, n, k;
        Scanner input = new Scanner(System.in);
        // User inputs integer value
        System.out.print("Input an integer number between 1 and 9: ");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {
            // Main loop for number of rows

            for (j = 1; j <= n - i; j++) {
                System.out.print("  ");
                // Loop to create blank spaces till the condition is true.
            }
            for (k = i; k >= 1; k--) {
                // Loop to create number triangle
                System.out.print(k + " ");
            }

            System.out.println();
        }
    }
}
