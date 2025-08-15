package interfaceClass;

public class Main {

	public static void main(String[] args) {
		Car car = new Car();
		
		car.start();
		car.acc();
		car.Brake();
		car.stop();
		
		Engine eng = new Car();
		//eng.a; With above we can use method or var present in car class
		//eng.brake(); // this is asking to create a method brake in engine class
	}

}
