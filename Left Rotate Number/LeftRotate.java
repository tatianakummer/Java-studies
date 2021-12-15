public class LeftRotate{
	public static void main (String[] args){
		int test1 = 36498;
		int test2 = 473;
		int test3 = 81;
		int test4 = 1;
		
		// test cases 
		System.out.println(" test 1:  leftRotate ( "+test1+ " )= "+ leftRotate(test1));
		System.out.println(" test 2:  leftRotate ( "+test2+ " )= "+ leftRotate(test2));
		System.out.println(" test 3:  leftRotate ( "+test3+ " )= "+ leftRotate(test3));
		System.out.println(" test 4:  leftRotate ( "+test4+ " )= "+ leftRotate(test4));
	}

	/** Takes a positive integer number, n, as argument, and returns number of digits of n*/
	public static  int numberOfDigits(int n){
		int count = 0;
		while (n != 0){
			n = n / 10;
			++count;
		}
		return count;
	}
    
	/** use numberOfDigitsI( int n), and right-rotate the given positive integer n, and returns the result. */

	public static int leftRotate(int n){

		// store number of digits
		int x = numberOfDigits(n);

		// store first digit of n
		int left_n = n / (int)(Math.pow(10, x - 1));

		// remove first digit of n
		n = n % (int)(Math.pow(10, x - 1));

		// store number of digits in left_n
		int left_digit = numberOfDigits(left_n);

		// append left_n to the right digit of n
		n = (n * (int)(Math.pow(10, left_digit))) + left_n;

		return n;
	}
}    
