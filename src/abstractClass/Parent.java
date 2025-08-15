package abstractClass;

public abstract class Parent {
	
	static int age;
	
	Parent(int age){
		Parent.age = age;
	}
	
	static void staticMethod() {
		System.out.println("hello");
	}
	
	abstract void career();
	abstract void partner();

}
