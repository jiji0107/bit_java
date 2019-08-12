package day11;

import day10.Animal;
import day10.Dog;
//부모타입인데 하단부에 접근할수 없는 곳을 접근 한다 오버라이팅
public class AnimalTest {

	public static void main(String[] args) {
					Animal d= new Dog("진돗개" , "쫑이"); //부모에 데이터 타입에 Dog를 넣는다.
					((Dog)d).dogprint();
					if(d instanceof Dog) ((Dog)d).dogprint();
					//    d가 Dog일때                 d가있는데 캐스팅하고싶어
					
					Dog dd = (Dog) d;
					if(d instanceof Fish) {
						Fish ff = (Fish) d;
					}
					d.breath();
					
					Animal f = new Fish("구피");
				//Fish f 자리에 오브젝트 애니멀 피쉬가 올수 있다
					if(f instanceof Fish) ((Fish)f).fishPrint();
					f.breath(); //접근 할 수 없는 하단부에 있었는데 접근이 되어버림. 캐스팅 없이 하단부에 있는곳을 접근 => 오버라이딩
					((Fish)f).breath();
					
					
	}

}
