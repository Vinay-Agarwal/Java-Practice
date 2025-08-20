package patternSolution;

public class StarPatternReverseCone {

	public static void main(String[] args) {
		int rowNumber = 5;
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col < row; col++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= 5 - row + 1; col++) {
				System.out.print("*");
			}
			for (int col = 1; col < rowNumber - row + 1; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}