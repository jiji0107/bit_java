package day13;

import java.lang.reflect.Array;

public class Test03 {

	public static void main(String[] args) {
				Circle c1 = new Circle(new Point(5,5),3);
				System.out.println(c1);
				System.out.println(((Shape)c1).area());
				//((Drawable)c1).draw(); 밑에처럼 캐스팅 안해도 호출된다.
				((Drawable)c1).draw();
				//abstract 하고 interface 다른점
	}
}
