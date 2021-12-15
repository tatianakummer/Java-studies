import java.util.Scanner;

public class SumOfStrings {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("input first number: ");
        String number1= input.nextLine();

        System.out.print("input second number: ");
        String number2= input.nextLine();

        System.out.println(number1 + " +");
        System.out.println(number2);
        for (int i = 0; i < 10; i++) {
            System.out.print("-");
        } System.out.print("\n" + sum(number1, number2));
    }

    /** Takes two strings and add their values
     * @param number1
     * @param number2
     * @return str
     */

    public static String sum (String number1, String number2) {

        if (number1.length() > number2.length()){
            String t = number1;
            number1 = number2;
            number2 = t;
        }

        String str = "";
        int n1 = number1.length(), n2 = number2.length();

        number1=new StringBuilder(number1).reverse().toString();
        number2=new StringBuilder(number2).reverse().toString();

        int carry = 0;
        for (int i = 0; i < n1; i++)
        {
            int sum = ((int)(number1.charAt(i) - '0') +
                    (int)(number2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');

            carry = sum / 10;
        }

        for (int i = n1; i < n2; i++)
        {
            int sum = ((int)(number2.charAt(i) - '0') + carry);
            str += (char)(sum % 10 + '0');
            carry = sum / 10;
        }

        if (carry > 0)
            str += (char)(carry + '0');

        str = new StringBuilder(str).reverse().toString();

        return str;
    }
}
