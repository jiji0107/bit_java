package day15;

import day14.Point;

public class Test03 {

	public static void main(String[] args) {
		Outer.Inner i = new Outer().new Inner();
		i.print();

	}
}

class Outer {
	Point P = new Point(5, 3);

	class Inner {
		void print() {
			System.out.println(P);
		}
	}
}