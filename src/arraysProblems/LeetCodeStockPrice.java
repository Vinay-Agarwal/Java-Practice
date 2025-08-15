package arraysProblems;

public class LeetCodeStockPrice {
	public static int arrSize = 0;

	public static void main(String[] args) {
		int[] nums = { 7, 1, 5, 3, 6, 4 };
		arrSize = nums.length;
		int k = findProfit(nums);
		
		System.out.println("profit is: "+k);

	}

	public static int findProfit(int[] nums) {
		int profitDiff = 0;
		int maxProfit = 0;
		for (int i = 0; i < arrSize; i++) {
			for (int j = i + 1; j < arrSize; j++) {
				int firstNum = nums[j];
				int secondNum = nums[i];
				if (firstNum < secondNum) {
					
				} else {
					profitDiff = firstNum - secondNum;
					if (profitDiff > maxProfit) {
						maxProfit = profitDiff;
					}
				}

			}
		}

		return maxProfit;
	}

}
