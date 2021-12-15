import java.util.Scanner;

/** Read a line of text, and an integer number between 1 and 10 as a cipher key from keyboard,
 * and cipher the text.
 */

public class Coder {
    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);
        char [] msg = getMsg(input); // Read the message from keyboard
        int key = getKey(input);
        System.out.println("Key : " + key);
        String ans="";
        for (i=0; i<msg.length; i++) {
            ans += cipher(msg[i], key);
        }
        System.out.println(ans);
    }

    /** Read a line of message from keyboard and return it as a string
     @return: String
     */
    public static char[] getMsg(Scanner input) {
        String myMessage;
        System.out.print("Input Message: ");
        myMessage = input.nextLine();// Read a line of message
        return myMessage.toCharArray();
    }

    /** Read an integer from keyboard and return it
     @return: key
     */
    public static int getKey(Scanner input) {
        System.out.print("Input Key: ");
        return input.nextInt();
    }

    /** Takes message and key, cipher it and return its binary representation
     * @param msg parameter of the method
     * @param key parameter of the method
     * @return binary representation of ciphered message
     */

    public static String cipher(char msg, int key) {
        if (msg >= 'a' && msg <= 'z') {
            msg = (char) (msg + key);
            if (msg > 'z') {
                msg = (char) (msg - 'z' + 'a' - 1);
            }
        } else if (msg >= 'A' && msg <= 'Z') {
            msg = (char) (msg + key);
            if (msg > 'Z') {
                msg = (char) (msg - 'Z' + 'A' - 1);
            }
        } else if (msg >= '0' && msg <= '9') {
            msg = (char) (msg + key);
            if (msg > '9') {
                msg = (char) (msg - '9' + '0' - 1);
            }
        }
        int n = msg;
        String ans = Integer.toBinaryString(n);
        ans = String.format("%8s", ans).replace(' ', '0');
        return ans;
    }
}
