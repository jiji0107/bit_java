package day14_ex;

public class Rectangle extends Shape implements Resizable { //extends=확장하다.
	
	double w;
	double h;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double w, double h) {
		super(4);
		this.w = w;
		this.h = h;
	}

	public double getW() {
		return w;
	}

	public void setW(double w) {
		this.w = w;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	@Override
	public double getArea() {
		return w*h;
	}

	@Override
	public void resize(double s) {
		w = w * s;
		h = h * s;
		
	}

	@Override
	public String toString() {
		return "Rectangle [w=" + w + ", h=" + h + "]";
	}
	
	
	
}


