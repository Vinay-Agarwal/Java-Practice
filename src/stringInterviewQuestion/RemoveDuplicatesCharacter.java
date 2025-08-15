package stringInterviewQuestion;

public class RemoveDuplicatesCharacter {

	public static void main(String[] args) {
		String str = "leetcode";
		char[] ch = str.toCharArray();
		int count=0;
		String newStr = "";
		
		for(int i=0;i<str.length()-1;i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i] == ch[j]) {
					
				}
			}
		}
	}

}
