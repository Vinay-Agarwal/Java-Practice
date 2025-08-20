package patternSolution;

public class StarPatternCone {

	public static void main(String[] args) {
		int rowNumber = 5;
		for (int row = 0; row < rowNumber; row++) {
			for (int col = row + 1; col < rowNumber; col++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= row; k++) {
				System.out.print("*");
			}
			for (int k = 1; k <= row; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
