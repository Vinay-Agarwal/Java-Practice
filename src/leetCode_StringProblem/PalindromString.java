package leetCode_StringProblem;

public class PalindromString {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		isPalindrome(cleaned);

	}

	public static boolean isPalindrome(String s) {
		
		String revString = "";
		
		for(int i=s.length();i>=0;i--) {
			revString = revString+s.charAt(i);
		}
		
		if(revString.equalsIgnoreCase(s)) {
			return true;
		}else {
			return false;
		}
		

	}

}
