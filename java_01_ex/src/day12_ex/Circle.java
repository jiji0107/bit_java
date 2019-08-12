package day12_ex;

public class Circle extends Shape{
	
	private double radius ;

	public Circle(String n1 , double radius) {
		super(n1);
		this.radius = radius;
		
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius ;
	}
	@Override//부모클래스에 있는 메소드를 자식클래스가 자기의 상황에 맞게 다시 정의해서 쓰는것
	public void calculationArea() {
        		area=radius*radius*Math.PI;
	}
	

}
