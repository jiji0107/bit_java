package day12_ex;

public class CircleT extends ShapeT{
	private double radius; //원의 면적을 구하는 정보

	
	public CircleT(String name,double radius) {
		super(name);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void calculationArea() { //면적을 계산하기 위해 radius정보가 필요하다.
				area = radius * radius * Math.PI;
	}

}
