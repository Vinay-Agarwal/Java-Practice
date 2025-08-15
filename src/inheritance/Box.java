package inheritance;

public class Box {
	
	double l;
	double h;
	double w;
	
	Box(){
		this.l = l;
		this.h = h;
		this.w = w;
	}
	
	Box(int side){
		this.l = side;
		this.h = side;
		this.w = side;
	}
	
	Box(Box box){
		this.l = box.l;
		this.h = box.h;
		this.w = box.w;
	}

	public Box(double l, double h, double w) {
		this.l = l;
		this.h = h;
		this.w = w;
	}

}
