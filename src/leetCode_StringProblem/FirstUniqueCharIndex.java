package leetCode_StringProblem;

public class FirstUniqueCharIndex {

	public static void main(String[] args) {
		String s = "dddccdbba";

		int firstUniqueCharIndex = firstUniqChar(s);
		System.out.println("first unique char index: " + firstUniqueCharIndex);

	}

	private static int firstUniqChar(String s) {
		char[] orgStr = s.toCharArray();
		String comparedStr = "";
		int count = 1, i, j;
		int length = orgStr.length;
		if (length == 1) {
			return 0;
		}
		else if(length == 2) {
			if(orgStr[0] == orgStr[1]) {
				return -1;
			}else {
				return 0;
			}
		}
		else {
			for (i = 0; i <= length; i++) {
				for (j = i + 1; j < length; j++) {
					System.out.println("Comapring: " + orgStr[i] + " With " + orgStr[j]);
					if (orgStr[i] == orgStr[j]) {
						count++;
						System.out.println("Count is: " + count);
						comparedStr += orgStr[i];
						break;
					}
				}
				if (count < 2) {
					if (comparedStr.contains(String.valueOf(orgStr[i]))) {
						break;
					} else {
						return i;
					}

				} else {
					count = 1;
				}
			}
			return -1;
		}

	}

}
