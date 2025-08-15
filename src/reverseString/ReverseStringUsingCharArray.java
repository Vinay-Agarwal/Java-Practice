package reverseString;

public class ReverseStringUsingCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Software Testing";
		String revStr = "";
		
		char[] charArraySet = str.toCharArray();
		System.out.println("Original String is: "+str);
		
		for(int i = charArraySet.length -1 ; i >= 0; i--) {
			revStr = revStr+ charArraySet[i];
		}
		
		System.out.println("New Reversed String is: "+revStr);
	}

}
