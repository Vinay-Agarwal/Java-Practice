package interfaceClass;

public class Car implements Engine, Brake, Media {
	
	int a = 10;

	@Override
	public void start() {
		System.out.println("I start like a normal car");
		
	}

	@Override
	public void Brake() {
		System.out.println("I Brake like a normal car");
		
	}

	@Override
	public void stop() {
		System.out.println("I stop like a normal car");
		
	}

	@Override
	public void acc() {
		System.out.println("I accelerate like a normal car");
		
	}

	@Override
	public void Start() {
		System.out.println("Put music in system");
		
	}
	
	

}
