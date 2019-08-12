package day12_ex;

public class Rectangular extends Shape {

private double width;
private double hight;
public Rectangular(String n2,double width, double hight) {
	super(n2);
	this.width = width;
	this.hight = hight;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public double getHight() {
	return hight;
}
public void setHight(double hight) {
	this.hight = hight;
}
@Override//부모클래스에 있는 메소드를 자식클래스가 자기의 상황에 맞게 다시 정의해서 쓰는것
public void calculationArea() {
			area= width*hight;
}


	}


