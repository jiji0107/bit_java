package day14_ex;


public class ShapeTest {
	public static void main(String[] args) {
			
		Rectangle re = new Rectangle(5,6);
		RectTriangle re2 = new RectTriangle(6,2);
		
		Shape [] sh = {re,re2};
		
		for(Shape s1 : sh) {
			System.out.println(s1.getArea());
		}
		
		
		}
	}


