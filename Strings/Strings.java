public class Strings{
	public static void main(String[] args){
		
		// test cases
		System.out.println("Test cases (Part A)");
		String str= "and this another test for our quiz";
		System.out.println(countSymbol(str,'t'));
		System.out.println(countSymbol(str,' '));
		
		System.out.println("Test cases (Part B)");
		String strb1= "cpsc1150 quiz 9";
		String strb2= "112+38 = 150";
		System.out.println(sumOfDigits(strb1));
		System.out.println(sumOfDigits(strb2));
		
				
		System.out.println("Test cases (Part C)");
		String[] arr1 = {"this is a test", "another test", "and more"};
		System.out.println(countSymbol(arr1,'t'));
		System.out.println(countSymbol(arr1,' '));
    System.out.println(countSymbol(arr1,'v'));
		
    String[] arr2 = {"", "another test", " "};
		System.out.println(countSymbol(arr2,'o'));
		System.out.println(countSymbol(arr2,'r'));
	}

	/** count number of times character x appears in string
    @param str : string 
	@param x : the character should be counted
    @return number of times x appears in str
        */
	public static int countSymbol(String str, char x) {
		int count = 0;

		for(int i=0; i < str.length(); i++) {    
			if(str.charAt(i) == x) {
				count++;
			}
		}
		
		return count;
	}
	
	
	/** Sum digits appears in the string
    @param str : string 
	@return sum of digits appears in str
    */
	public static int sumOfDigits(String str) {

		int count = 0;
		char ch ;
		int n;

		for(int i=0; i < str.length(); i++) {
			ch = str.charAt(i);  // find character

			if(Character.isDigit(ch)) {  // check if character is digit
				n = Character. getNumericValue(ch);  // find numeric value of character
				count += n;
			}
		}

		return count;
	}

    /** Count number of times character x appears in array of Strings
    @param arr : array of String
	@param x : the character should be counted
    @return number of times x appears in the arr
    */    
    public static int countSymbol(String[] arr, char x) {
     
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if (arr[i].charAt(j) == x) {
					count++;
				}
			}
		}

		return count;
	}
}   
