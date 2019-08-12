package day11;

import day10.Animal;
import day10.Dog;

public class AnimalTest2 {

	public static void main(String[] args) {
		Animal[] animals = { // 모든 객체의 부모가 될 수 있다.
				new Dog("진돗개", "쫑이"), 
				new Fish("구피"), 
				new Dog("시베리안허스키", "케리") 
				};
		
	//	for (Animal data : animals) {
	//		data.breath();
	//		data.print();
	//	}
		Dog a1 = new Dog("진돗개", "쫑이");
		Fish f1 = new Fish("구피");
		callD(f1); // 밑에 public으로 설계하면 다 호출 가능하다. 자바 다형성 
		
		
	}
	//public static void callD(Dog d) { //Dog 타입의 d를 매개변수로 받는다 위에 f1은 안된다.
	//	d.breath();
	//}
	//public static void callD(Fish d) { //dog타입 fish타입 다 처리할게 메소드 오버로딩
	//	d.breath();
	//}
	public static void callD(Animal d) { //animals[0] 처리 가능 오버로딩한 자원이여서 앞에가 없어도 된다. 오버로딩 되어서 animal의 부모쪽만 보겠다.
		d.breath(); //d를 호출했는데 다똑같은 메소드가 아니다.
	}
  
}
