package maxNumberInarray;

public class WAPMaxNumberUsingIteraion {

	public static void main(String[] args) {
	
		// Initiate given integer Array
		int arr[] =  {10,30,70,20,1};
		
		//Initialize maxNumber with value as first element of given array
		int maxNumber = arr[0];
		
		int i;
		
		for(i=0; i< arr.length;i++) {
			if(arr[i]>maxNumber) {
				maxNumber = arr[i];
			}
		}
		
		System.out.println("Maximum number in array is: "+ maxNumber);

	}

}
