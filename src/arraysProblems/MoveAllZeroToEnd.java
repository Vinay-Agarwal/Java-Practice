package arraysProblems;

public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		int[] nums = { 1, 0, 7, 0, 4, 0, 5, 0 };
		int[] k = moveZero(nums);
		for(int i = 0; i< k.length; i++) {
			System.out.println(k[i]);
		}

	}

	private static int[] moveZero(int[] nums) {
		int i, j, temp;
		boolean swapped;
		int arrSize = nums.length;

		for (i = 0; i < arrSize; i++) {
			swapped = false;
			for (j = 0; j < arrSize - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
					swapped = true;
				}
			}
		}

		return nums;
	}
}
