import java.util.Scanner;

/*
This program is used to calculate how much time until an account is depleted
based on initial values provided by the user
 */


public class ExpenseCalculator{
	public static void main(String[] args){

		/*
		The bank account starts with an initial balance
		User inputs initial balance
		 */

		Scanner input = new Scanner (System.in);
		System.out.print("Enter initial balance: ");
		double balance = input.nextDouble();

		/*
		Interest is computed monthly at 6% per year (0.5% per month).
		Every month $500.00 is withdrawn to meet education expenses.
		Calculate the number of years and months until the account is depleted.
		 */

		int months = 1;
		while (balance >= 500){
			balance = balance * (1+0.06/12);
			balance = balance - 500;
			months++;
		}
		int years = months / 12;
		int monthDiff = months%12;

		// Assembling the output message depending on the number of years and/or months

		if (months % 12 == 0){
			if (years > 1) {
				System.out.print("The balance will be depleted after " + years + " years.");
			} else {
				System.out.print("The balance will be depleted after " + years + " year.");
			}
		} else if (months > 12){
			if (years > 1 ) {
				if (monthDiff > 1) {
					System.out.print("The balance will be depleted after " + years + " years and " + monthDiff + " months.");
				} else {
					System.out.print("The balance will be depleted after " + years + " years and " + monthDiff + " month.");
				}
			}else{
				if (monthDiff > 1){
					System.out.print("The balance will be depleted after " + years + " year and " + monthDiff + " months.");
				} else {
					System.out.print("The balance will be depleted after " + years + " year and " + monthDiff + " month.");
				}
			}

		} else if (months > 1) {
			System.out.print("The balance will be depleted after " + months + " months.");
		} else {
			System.out.print("The balance will be depleted after " + months + " month.");
		}
	}
}
