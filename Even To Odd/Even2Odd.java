/** takes an integer number as an argument and changes all even digits of the number to odd digits by adding one to each odd digit.
 */

public class Lab5B{
    public static void main(String[] args)
    {
        // Sample test case:
        int n = 26540;
        System.out.println("n= "+n+", ans= "+even2odd(n));
        n = 9528;
        System.out.println("n= "+n+", ans= "+even2odd(n));
    }

    /**
     changes all even digits of argument to odd digits by adding 1 to each digit
     @param n: a positive integer number
     @return the result as an integer number
     */
    public static int even2odd(int n)
    {
        int ans = 0;
        int i = 1;

        //loop to analyzer each digit and add 1 to any even digit
        while ( n > 0 ) {
            if (n % 2 == 0) {
                n += 1;
            }
            ans = ans + ((n % 10 ) * i);
            i = i * 10;
            n = n / 10;
        }
        return ans;
    }
}
