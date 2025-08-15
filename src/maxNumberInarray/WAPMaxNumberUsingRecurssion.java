package maxNumberInarray;

public class WAPMaxNumberUsingRecurssion {

	public static void main(String[] args) {
		// Initiate given integer Array
		int arr[] =  {10,30,70,20,1};
		int arrLength = arr.length;
		
		int maxNumber = largestNumber(arr,arrLength,0);
		
		System.out.println("Maximum number is: "+maxNumber);

	}

	private static int largestNumber(int[] arr, int arrLength, int i) {
		int largestElem;
		
		if(i==arrLength-1) {
			return arr[i];
		}
		
		largestElem = largestNumber(arr,arrLength,i+1);
		
		int maxNumberInArray = Math.max(largestElem, arr[i]);
		
		return maxNumberInArray;
	}

}
