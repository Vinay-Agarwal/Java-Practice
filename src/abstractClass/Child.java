package abstractClass;

public class Child extends Parent {

	public Child(int age) {
		super(age);

	}
	
	@Override
	void career() {
		System.out.println("I am going to be doctor");
		// TODO Auto-generated method stub
		
	}

	@Override
	void partner() {
		System.out.println("I Love iron man");
		System.out.println("age is: " + age);
		
	}

}
