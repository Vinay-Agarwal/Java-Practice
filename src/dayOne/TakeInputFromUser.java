package dayOne;

import java.util.Scanner;

public class TakeInputFromUser {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		String name = scan.nextLine();
		
		System.out.println("Enter your age: ");
		int age = scan.nextInt();
		
		System.out.println("Your name is: "+name+" and age is: "+age);
		
		scan.close();

	}

}
