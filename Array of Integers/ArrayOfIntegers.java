public class ArrayOfIntegers {
    public static void main(String[] args) {
        int[] myArray = initialize(5, 10, 20);
        printArray(myArray);
        reverse(myArray);
        printArray(myArray);
        sort(myArray);
        printArray(myArray);
        insert(myArray,5,3);

        //Test case a
        int[] arr2=initialize(10, 5, 10);
        count(arr2);

        //Test case b
        int[] arr3=initialize(100, -200, 100);
        count(arr3);


        printArray(unique(myArray));

    }

    /** Creates a random array of integers with length equal to size and numbers in range [lowerBound to upperBound]
     * @param size parameter of the method
     * @param lowerBound parameter of the method
     * @param upperBound parameter of the method
     * @return arr
     */

    public static int[] initialize(int size, int lowerBound, int upperBound) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (lowerBound + Math.random() * (upperBound - lowerBound + 1));
        }
        return arr;
    }

    /** Takes an array of integers and prints the contents of the array in a line separated by space
     * @param arr parameter of the method
     */

    public static void printArray(int[] arr) {
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }

    /** Reverse contents of the array of integers
     * @param arr parameter of the method
     */

    public static void reverse(int[] arr) {
        int i, j = arr.length - 1;
        for (i = 0; i < arr.length / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /** Sort content of the given array in ascending order
     * @param arr parameter of the method
     */
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    if (arr[i] > arr[j]) {
                        int tmp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = tmp;
                    }
                }
            }
    }

    /** Counts how many times each number occurred in the array and print the result
     * @param arr parameter of the method
     */

    public static void count(int[] arr) {
        int count = 1;
        for (int i = 0, length = arr.length; i < length; i++) {
            if (i < length - 1) {
                if (arr[i] == arr[i + 1]) {
                    count++;
                }
            } else {
                System.out.println(arr[i] + " occurs = " + count);
            }
            if (i < length - 1 && arr[i] != arr[i + 1]) {
                System.out.println(arr[i] + " occurs = " + count);
                count = 1;
            }
        }
    }

    /** Insert number at index location of the array
     * @param arr parameter of the method
     * @param n parameter of the method
     * @param index parameter of the method
     * @return true in case of success, and false in case of failure
     */

    public static boolean insert(int[] arr, int n, int index){
        if (index >= arr.length) {
            return false;
        } else {
            int[] newArr = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                if (i < index - 1)
                    newArr[i] = arr[i];
                else if (i == index - 1)
                    newArr[i] = n;
                else
                    newArr[i] = arr[i - 1];
            }
            printArray(newArr);
            return true;
        }
    }

    /** Remove repeated integers in the array
     * @param arr parameter of the method
     * @return newArr
     */

    public static int[] unique(int[] arr){
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] == arr[j]) {
                int shiftLeft = j;
                for (int k = j+1; k < length; k++, shiftLeft++) {
                    arr[shiftLeft] = arr[k];
                }
                    arr[j] = arr[length-1];
                    length--;
                    j--;
                }
            }
        }
        int[] newArr = new int[length];
    for(int i = 0; i < length; i++){
        newArr[i] = arr[i];
    }
        System.arraycopy(arr, 0, newArr, 0, length);
        return newArr;
    }
}
