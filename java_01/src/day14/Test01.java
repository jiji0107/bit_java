package day14;

public class Test01 {

	public static void main(String[] args) {
		Circle c1 =new Circle(new Point(3,3),3);
		/*System.out.println(c1);
		c1.move(3);
		System.out.println(c1);
		c1.draw();*/
		
		
		Rectangle r1 = new Rectangle(new Point(11,11),3,7);
	/*	System.out.println(r1);
		r1.move(1);
		System.out.println(r1);
		r1.draw();*/
		
		Shape [] Shapes = {c1,r1}; //rectangle이랑  circle객체를 다 shape에 넣고 싶다.
		for(Shape data : Shapes) {
			System.out.println(data);
			System.out.println(data.area());
			data.move(1);
			data.draw();
			System.out.println(data);
			
		}
		
	}

}
