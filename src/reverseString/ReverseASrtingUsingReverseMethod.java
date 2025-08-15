package reverseString;

public class ReverseASrtingUsingReverseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Software";
		
		StringBuilder strBuild = new StringBuilder();
		
		System.out.println("Original String: "+ str);
		
		strBuild.append(str);
		
		strBuild.reverse();
		
		System.out.println("New Reversed String: "+ strBuild);

	}

}
