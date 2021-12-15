import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.print("Input number: ");
        long n= input.nextLong();

        String str = String.format("%,d", n);

        System.out.print(str + " is " + convert(n));
    }

    public static String[] ones = {"", "one ", "two ", "three ", "four ",
            "five ", "six ", "seven ", "eight ",
            "nine ", "ten ", "eleven ", "twelve ",
            "thirteen ", "fourteen ", "fifteen ",
            "sixteen ", "seventeen ", "eighteen ",
            "nineteen "};

    public static String[] tens = { "", "", "twenty ", "thirty ", "forty ",
            "fifty ", "sixty ", "seventy ", "eighty ",
            "ninety " };



    public static String convert (long n){
        if (n == 0)
            return "zero";

        String words = "";

        if ((n / 1_000_000_000_000L) > 0){
            words += convert(n / 1_000_000_000_000L) + "trillion, and ";
            n %= 1_000_000_000_000L;
        }

        if ((n / 1000000000) > 0) {
            words += convert(n / 1000000000) + "billion, and ";
            n %= 1000000000;
        }

        if ((n / 1000000) > 0) {
            words += convert(n / 1000000) + "million, and ";
            n %= 1000000;
        }

        if ((n / 1000) > 0) {
            words += convert(n / 1000) + "thousand, and ";
            n %= 1000;
        }

        if ((n / 100) > 0) {
            words += convert(n / 100) + "hundred ";
            n %= 100;
        }

        if (n > 0) {
            if (n < 20)
                words += ones[(int)n];
            else {
                words += tens[(int)n / 10];
                if ((n % 10) > 0)
                    words += ones[(int)n % 10];
            }
        }

        return words;
    }
}
