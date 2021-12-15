public class ArrayOfCharacters{

    public static void main(String [] args) {
       
	    char arr1[] = {'a', 'b', 'c', 'd', 'e'};
	    char arr2[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
	    char arr3[] = {'a', 'b'};
	    char arr4[] = {'a'};
	
	   
       // Test Cases:
	    // Test case 1:
       System.out.println("\ntest Right-Rotate:");
	    System.out.println("-------------------");
       System.out.println("Test Case 1:");
	    System.out.print("array:  ");
	    printArray(arr1);
	    rightRotate(arr1,2);
	    System.out.print("right rotated n=2:  ");
	    printArray(arr1);
	         	
	    // Test case 2:
	    System.out.println("\nTest Case 2:");
	    System.out.print("array: ");
	    printArray(arr2);
       rightRotate(arr2,4);
	    System.out.print("right rotated n=4:  ");
	    printArray(arr2);
	   
	
	    // Test case 3:
	    System.out.println("\nTest Case 3:");
	    System.out.print("array: ");
	    printArray(arr3);
	    rightRotate(arr3,1);
	    System.out.print("right rotated n=1:  ");
	    printArray(arr3);
	   
	    // Test case 4:
	    System.out.println("\nTest Case 4:");
	    System.out.print("array: ");
	    printArray(arr4);
	    rightRotate(arr4,1);
	    System.out.print("right rotated n=1:  ");
	    printArray(arr4);
       
       //-----------------------
       char a1[] = {'a', 'b', 'c', 'd', 'e'};
	    char a2[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
	    char a3[] = {'a', 'b'};
	    char a4[] = {'a'};
	    // Test Cases:
	    // Test case 1:
       System.out.println("\ntest Left-Rotate:");
	    System.out.println("-------------------");
       System.out.println("Test Case 1:");
	    System.out.print("array:  ");
	    printArray(a1);
	    leftRotate(a1,2);
	    System.out.print("left rotated n=2:  ");
	    printArray(a1);
	         	
	    // Test case 2:
	    System.out.println("\nTest Case 2:");
	    System.out.print("array: ");
	    printArray(a2);
       leftRotate(a2,4);
	    System.out.print("left rotated n=4:  ");
	    printArray(a2);
	   
	
	    // Test case 3:
	    System.out.println("\nTest Case 3:");
	    System.out.print("array: ");
	    printArray(a3);
	    leftRotate(a3,1);
	    System.out.print("left rotated n=1:  ");
	    printArray(a3);
	   
	    // Test case 4:
	    System.out.println("\nTest Case 4:");
	    System.out.print("array: ");
	    printArray(a4);
	    leftRotate(a4,1);
	    System.out.print("left rotated n=1:  ");
	    printArray(a4);
	}

    //--------
    public static void rightRotate(char arr[], int n) {
		int i;
		if (arr.length > 1) {
			for (i = 0; i < n; i++) {
				char p = arr[arr.length - 1];

				for(int j = arr.length-2; j >= 0 ; j--){
					arr[j+1] = arr[j];
				}
				arr[0] = p;
			}
		}
    }
  
    //--------
    public static void leftRotate(char arr[],int n) {
		for(char i = 0; i < n; i++){
			char j, first;
			first = arr[0];
			for(j = 0; j < arr.length-1; j++){
				arr[j] = arr[j+1];
			}
			arr[j] = first;
		}
	}

	public static void printArray ( char arr[]){
		int i;
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "  ");
		System.out.println();
	}
}
