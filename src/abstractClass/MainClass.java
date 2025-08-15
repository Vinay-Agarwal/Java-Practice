package abstractClass;

public class MainClass {
	public static void main(String[] args) {
		Child child = new Child(20);
		child.career();
		child.partner();
		child.staticMethod();
		
		//Parent mom = new Parent();// Can not create object of parent class
	}

}
