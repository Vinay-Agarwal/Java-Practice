package sortingArray;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {5,6,1,3};
		int i,j,temp;
		boolean swapped;
		
		printArray(arr,arr.length,"Before Sorting");
		
		for(i =0; i<arr.length-1;i++) {
			swapped = false;
			for(j = 0; j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}
		}
		
		printArray(arr,arr.length,"After Sorting");
		
		
	}

	private static void printArray(int[] arr, int length, String message) {
		System.out.println(message+" ");
		for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
	}

}
