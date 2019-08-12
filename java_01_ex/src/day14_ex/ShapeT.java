package day14_ex;

public class ShapeT {

	public static void main(String[] args) {
			Shape[] shapes = {	
					new Rectangle(5,6),
					new RectTriangle (6,2)
			};
			for(Shape data:shapes) {
				System.out.println("area : "+ data.getArea());
				if(data instanceof Resizable) { //data라는 객체는 Resizable타입이 될 수 있나요? instanceof 타입 체킹 해준다. 가능하면 true 아니면 false 
					((Resizable) data).resize(0.5);
					System.out.println("new area : "+ data.getArea());
				} //생성된 개체가 Resizable하다면
			}
			}

}
