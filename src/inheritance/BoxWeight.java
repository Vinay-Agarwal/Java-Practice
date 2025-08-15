package inheritance;

public class BoxWeight extends Box{
	double weight;
	
	public BoxWeight(double l, double h, double w, int weight) {
		super(l,h,w);
		this.weight = weight;
	}

	public BoxWeight() {
		this.weight = -1;
	}
}
