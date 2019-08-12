package day14_ex;

public class RectTriangle extends Shape {
	
	 double w;
	 double h;


	public RectTriangle() {
		super();
	}
	
	public RectTriangle(double w, double h) {
		super(3);
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
		
		return w*h/2;
	}

	@Override
	public String toString() {
		return "RectTriangle [w=" + w + ", h=" + h + "]";
	}

}

