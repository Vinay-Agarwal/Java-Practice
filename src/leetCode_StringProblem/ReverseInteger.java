package leetCode_StringProblem;

import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int numb = 1534236469;
		int revInt = 0;
		
		while(numb !=0) {
			int a = numb % 10;
			numb = numb/10;
			if(revInt > Integer.MAX_VALUE/10) {
				System.out.println(0);
			}
			if(revInt < Integer.MIN_VALUE/10) {
				System.out.println(0);
			}
			revInt = revInt*10+a;
			
		}
		System.out.println(revInt);

	}

}
