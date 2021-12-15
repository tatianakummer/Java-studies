import java.util.Scanner;

/** print all prime palindrome numbers less than or equal to a number provided by the user
 */

public class PalindromePrimeN {

    public static void main(String[] args) {
        int n; //integer prompted by user

        Scanner in = new Scanner(System.in);

        //promp user for an integer

        System.out.print("Enter an integer number: ");
        n = in.nextInt();

        //print all palindrome prime numbers less than or equal to n

        if (n<2){
            System.out.println("There are no palindrome prime numbers less than or equal to " + n);
        } else {
            print_palindrome_prime_less_than_n(n);
            System.out.print("are all palindrome prime numbers less than or equal to " + n);
        }
    }

    /** check if a positive integer number is a prime number
     * @param n parameter of the method
     * @return true if n is a prime number
     */

    public static boolean is_prime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /** check if a positive integer number is a palindrome number
     * @param n parameter of the method
     * @return true if n is a palindrome number
     */

    public static boolean is_palindrome(int n) {
        int r,sum=0,temp;
        temp=n; //store the number in a temporary variable
        while(n>0){
            r=n%10;  //getting remainder
            sum=(sum*10)+r;
            n=n/10;
        }
        return temp==sum; //return true if sum and temp are equal
    }

    /** print all prime palindrome numbers less than or equal to the number provided by the user
     * @param n parameter of the method
     */

    public static void print_palindrome_prime_less_than_n(int n) { // Print all palindromic prime numbers
        for (int p = 2; p <= n; p++) {
            if (is_prime(p) && is_palindrome(p)) {  // check if the number is prime palindromic
                System.out.print(p + " ");
            }
        }
    }
}
