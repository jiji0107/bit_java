package day10;

public class AnimalTest01 {

	public static void main(String[] args) { //static 영역에서는 super랑 this 키워드 못쓴다.
					Animal a1 = new Animal(); // kind가 동물의 종류
					a1.breath();
					
					Animal a2 = new Animal("Dog"); // kind Dog Animal이 메모리에 올라간다. 널이 없어지고 동물의 종류가 나온다.
					a2.breath();
					
					Animal a3 = new Animal("고양이"); // kind Dog
					a3.breath();
					
					Dog d1 = new Dog("시베리안허스키","케리");
					//d1.breath();
					d1.dogprint();
					
					Dog d2 = new Dog("Dog","진돗개","쫑이");
					d2.dogprint();
					
					String animalKind = d2.getsuperkind();
					System.out.println(animalKind);
					
	}

}
