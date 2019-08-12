package day12_ex;

public class TestShapeT {
	public static void main(String[] args) {
		ShapeT [] ShapeT = new ShapeT[2]; //객체생성X 무조건 생성자 형태가 와야한다. 
		
		ShapeT[ 0 ]  = new CircleT("원",10);
		ShapeT[ 1 ] = new RectangularT("직사각형",10,20);
		
		for (int i = 0; i < ShapeT.length; i++) {
			ShapeT[ i ].calculationArea();
			ShapeT[ i ].print();
		}
	}
}




