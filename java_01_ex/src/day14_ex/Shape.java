package day14_ex;

public abstract class Shape {
	
	int numSides;

	public Shape() {
		super();
	}

	public Shape(int numSides) {
		super();
		this.numSides = numSides;
	}

	public int getNumSides() {
		return numSides;
	}

	public void setNumSides(int numSides) {
		this.numSides = numSides;
	}
	
	public abstract double getArea();
		
	
	
	


}

