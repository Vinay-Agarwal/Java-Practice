package arraysProblems;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		int[] nums = {6,5,5};
		
		int k = majorityElement(nums);
		System.out.println(k);

	}

	private static int majorityElement(int[] nums) {
		int arrSize = nums.length;
        int currentIndexCount =0;
        int currentHighestNumber=0;
        int halfArraySize = arrSize/2;
        currentHighestNumber = nums[0];
        
        Arrays.sort(nums);

        outerloop:
        for(int i=0; i< arrSize; i++){
        	
            for(int j=i+1;j<arrSize;j++){
                if(nums[j]==nums[i]){
                    currentIndexCount = currentIndexCount + 1;
                }
                if(halfArraySize == 1) {
                	if(currentIndexCount == 1) {
                		currentHighestNumber = nums[i];
                    	currentIndexCount =0;
                    	break outerloop;
                	}else if(currentIndexCount > halfArraySize) {
                    	currentHighestNumber = nums[i];
                    	currentIndexCount =0;
                    	break outerloop;
                    }
                }
            }
        }
		return currentHighestNumber;
	}

}
