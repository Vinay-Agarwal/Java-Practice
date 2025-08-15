package inheritance;

public class Main {

	public static void main(String[] args) {
		// No Argument constructor
		Box box = new Box();
		System.out.println(box.l + " " + box.h + " " + box.w);

		// parameterized constructor
		Box box1 = new Box(4);
		System.out.println(box1.l + " " + box1.h + " " + box1.w);

		// parameterized constructor
		Box box2 = new Box(box1);
		System.out.println(box2.l + " " + box2.h + " " + box2.w);
		
		BoxWeight box3 = new BoxWeight();
		System.out.println(box3.l+" "+box3.h+" "+box3.w+" "+box3.weight+" ");

		BoxWeight box4 = new BoxWeight(1,2,3,5);
		System.out.println(box4.l+" "+box4.h+" "+box4.w+" "+box4.weight);
		
	}

}
