public class Arrays{
	public static void main (String[] args){
		int[] arr1 = {5,-3,8,3,5,3};
		int[] arr2 = {5,20,10,30,5,15,-10};
		int[] arr3 = {8};
		
        // test cases
        printArray(arr1);
        System.out.println("average = "+ average(arr1));// expected: 3.5
        System.out.println("min = "+ min(arr1)); // expected: -3
        System.out.println();
        
        printArray(arr2);
        System.out.println("average = "+ average(arr2));// expected: 10.71428
        System.out.println("min = "+ min(arr2));// expected: -10
        System.out.println();

        printArray(arr3);
        System.out.println("average = "+ average(arr3)); // expected: 8.0
        System.out.println("min = "+ min(arr3));// expected: 8
        System.out.println();
    }

	/** Takes an array of integers and prints each element of the array in a line
        @param arr: array of integers 
        */
	public static void printArray(int[] arr){
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
    }
    
	/** finds and returns averag of an array of integers 
        @param arr: array if integers
        @return average of the array
        */
	public static double average(int[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum / arr.length;
	}
    
    /** finds and returns minimum value of the array 
        @param arr: array if integers
        @return minimum value  of the array
        */
	public static int min(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
	}
}    
