package maxNumberInarray;

import java.util.Arrays;

public class WAPMaxNumberUsingInBuiltMethod {

	public static void main(String[] args) {
		// Initiate given integer Array
		int arr[] =  {10,30,70,20,1};
		int arrLength = arr.length;
		
		int maxNumber = largestNumber(arr,arrLength);
		
		System.out.println("Maximum number is: "+maxNumber);

	}

	private static int largestNumber(int[] arr, int arrLength) {
		int largestElem;
		
		Arrays.sort(arr);
		int maxNumberInArray = arr[arrLength-1];
		
		return maxNumberInArray;
	}
}
