import java.util.*;
import java.io.*;

public class SortWords {
    public static void main (String[] args) throws FileNotFoundException {

        System.out.print("Enter a file name for input: ");
        String reader = new Scanner(System.in).next();
        int counts = countWords(reader);
        String[] words = readWords(reader, counts);
        String[] rep = replace(words);
        String[] str = removeWords(rep);
        String[] str2 = delet2(str);
        String[] str3 = sort(str2);

        System.out.println("Total number of words(without indicated symbols): " + str3.length);
        int[] c = countLetters(str3);
        display(c);
        int total = countWords(str3);
        String[] str4 = unique(str3, total);

        System.out.print("Enter file name for output: ");
        String out = new Scanner(System.in).next();
        outFile(str4, out);
    }

    /** Count words in file
     @param reader: text file inputted by user
     @return the number of words
     */

    public static int countWords (String reader) throws FileNotFoundException {
        File myFile = new File(reader);
        if(!myFile.exists())
        {
            System.out.println("File"+ reader + " not found");
            System.exit(2);
        }
        Scanner input = new Scanner(myFile);
        int counts = 0;
        while(input.hasNext())
        {
            String words = input.next();
            counts += 1;
        }
        input.close();
        return counts;
    }

    /** Read the file and store words in a string array
     @param reader: source file
     @param counts: number of words
     @return string array of words separated by whitespace in the text file
     */

    public static String[] readWords (String reader, int counts) throws FileNotFoundException {
        String[] words = new String[counts];
        Scanner in = new Scanner (new File(reader));
        while(in.hasNext())
        {
            for(int i = 0; i< counts; i++)
                words[i] = in.next();
        }
        return words;
    }

    /** Change all letters on the array to lowercase, and replace all the non-letter symbols with space, except the symbol '-'
     @param words: string array that contains single words
     @return A string array that contains lowercase words without non-letter symbols except symbol '-'
     */

    public static String[] replace (String[] words) {
        String[] rep = new String[words.length];
        for(int i = 0; i< words.length; i++) {
            String str1 = words[i];
            words[i] = str1.toLowerCase();
            rep[i] = words[i];
        }
        for(int j = 0; j< words.length; j++) {
            String str2 = rep[j];
            char[] c = str2.toCharArray();
            StringBuilder str3= new StringBuilder();
            for(int i = 0; i < c.length; i++) {
                if(c[i]>= 'a' && c[i] <= 'z')
                    str3.append(c[i]);

                else if(c[i] == '-' && i>0 && i<c.length-1)
                    str3.append(c[i]);

                else {
                    c[i]=' ';
                    str3.append(c[i]);
                }
            }
            rep[j] = str3.toString();
        }
        return rep;
    }

    /** Remove words with non-letter symbols in them, except hyphen '-'
     @param rep: A string array that contains single words/strings without non-letter symbols except symbol '-'
     @return A string array that only contains words and space as elements
     */

    public static String[] removeWords (String[] rep) {
        for(int i = 0; i<rep.length; i++) {
            String str = rep[i];
            rep[i] = str.trim();
        }
        String[] str2 = new String[rep.length];
        for(int i = 0; i< rep.length; i++) {
            String words = rep[i];
            String words2;
            if(space(words)) {
                words2 = words.replace(words,"");
            }
            else {
                words2=words;
            }
            str2[i] = words2;
        }
        return str2;
    }

    /** Check for spaces
     @param words: parameter of the method
     @return true or false
     */

    public static boolean space (String words)  {
        return words.indexOf(' ') >= 0;
    }

    /** Delete all the space strings
     @param d: A string array that only contains words and space as elements
     @return A string array that only contains words
     */

    public static String[] delet2 (String[] d) {
        int c = 0;
        for(int z=0; z<d.length; z++) {
            String str2 = d[z];
            if (str2.compareTo("") == 0)
            c+=1;
        }
        String[] d2 = new String[d.length-c];
        for(int h=0, j=0; j<d2.length;) {
            String wor = d[h];
            if (wor.compareTo("") != 0) {
                d2[j] = d[h];
                j++;
            }
            h++;
        }
        return d2;
    }

    /** Sort the array in alphabetic order
     @param d2 A string array that only contains words
     @return A string array that in alphabetic order
     */

    public static String[] sort(String[] d2) {
        for (int i = 0; i < d2.length; i++) {
            for (int j = i + 1; j < d2.length; j++){
                if (d2[i].compareTo(d2[j]) > 0) {
                    String temp = d2[i];
                    d2[i] = d2[j];
                    d2[j] = temp;
                }
            }
        }
        return d2;
    }

    /** Count the frequency of letters in the sorted array
     @param s reference of the array, the range of the array
     @return the number of a number's occurrences in the array
     */

    public static int[] countLetters (String[] s) {
        int d = 'z' - 'a' +1;
        int[] counts = new int[d];
        for(int i=0; i<s.length; i++) {
            for(int j=0; j<s[i].length(); j++) {
                char l = s[i].charAt(j);
                if(l != '-')
                counts[l-('a')]++;
            }
        }
        return counts;
    }

    /** Passing the array to display the frequency of each letters in the array
     @param c reference of the array, the range of the array
     */

    public static void display(int[] c) {
        for(int i = 0; i < c.length; i++) {
            char element = (char)( 'a' + i);
            System.out.println(element + " "+ "occurs = " + c[i]);
        }
    }

    /** calculate frequency of words
     @param str3: A string array in alphabetic order
     @return the numbers duplicated words
     */

    public static int countWords (String[] str3) {
        int total = 0;
        for(int i = 0; i < str3.length; i++) {
            for(int j = i+1; j < str3.length; j++) {
                if(str3[i].equals(str3[j]))
                {
                    str3[j] = "0";
                }
            }
            if(!str3[i].equals("0")) {
                total += 1;
            }
        }
        return total;
    }

    /** Create a string array to store all the unique words
     @param str3: parameter of the method
     @param total: number of unique words in the array
     @return A string array with only unique words
     */

    public static String[] unique(String[] str3, int total) {
        String[] unique = new String[total];
        int index = 0;
        for (int i = 0; index < total; i++) {
            if (str3[i].compareTo("0") == 0) {
                continue;
            }
            else
            {
                unique[index] = str3[i];
                index++;
            }
        }
        return unique;
    }

    /** Save the unique array in a new text file
     @param str4: string array with only unique words
     */

    public static void outFile (String[] str4, String out) throws FileNotFoundException {

        PrintWriter output = new PrintWriter(out);
        int i=0;
        while(i < str4.length) {
            output.println(str4[i]);
            i++;
        }
        output.close();
    }
}
