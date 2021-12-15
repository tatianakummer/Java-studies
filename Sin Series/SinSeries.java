public class SinSeries {
	public static void main (String[] args) {
		double  x = 1.89;
		double sinx = 0;
		int n = 23;

		// calculates sin(x) using the Maclaurin series expansion with x in radian

		for(int i = 0; i <= n ; i++){
			sinx += Math.pow(-1, i) * Math.pow(x, 2 * i + 1) / factorial(2 * i + 1);
		}


		System.out.println(" sinx  = "+ sinx);
		System.out.println("actual value of sinx = " + Math.sin(x));


	}

	/** calcutes and returns  n! 
	@param n : a positive integer number
	@return n!
	*/
	public static double factorial(int n) {
		// factorial loop

		int i;
		double fact = 1;
		if (n == 0) {
			return 1;
		}else {
			for(i=1;i<=n;i++){
				fact=fact*i;
			} return fact;
		}
	}
}
