package palindrome;

public class StringPalindromeNormalMethod {

	public static void main(String[] args) {
		// Input string
        String orgStr = "abBA";
        
        // Initializing an empty string to store the revStrerse
        // of the original str
        String revStr = "";

        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;

        for (int i = orgStr.length() - 1; i >= 0; i--) {
            revStr = revStr + orgStr.charAt(i);
        }

        // Checking if both the strings are equal
        if (orgStr.equalsIgnoreCase(revStr)) {
            ans = true;
        }
        System.out.println("Given String is Palindrome or not? "+ans);

	}

}
