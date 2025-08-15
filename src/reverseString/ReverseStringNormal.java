package reverseString;

public class ReverseStringNormal {

	public static void main(String[] args) {
		
		String str = "Software";
		String revStr = "";
		char ch;
		
		System.out.println("Original String is: "+str);
		
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			revStr = ch+revStr;
		}
		
		System.out.println("New Reversed String is: "+revStr);

	}

}