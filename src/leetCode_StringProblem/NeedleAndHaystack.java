package leetCode_StringProblem;

public class NeedleAndHaystack {

	public static void main(String[] args) {
		
		int currentI = strStr("sadbutsad","sad");
		System.out.println(currentI);

	}

	public static int strStr(String haystack, String needle) {
		int currentIndex = 0;
		
		if(haystack.contains(needle)) {
			for(int i=0;i<haystack.length()-needle.length()+1;i++) {
				String poo = haystack.substring(i, i+needle.length());
				if(poo.equalsIgnoreCase(needle)) {
					currentIndex = i;
					break;
				}
			}
			
		}else {
			return -1;
		}
		
		return currentIndex;

	}

}
