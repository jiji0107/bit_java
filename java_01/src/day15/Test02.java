package day15;

public class Test02 {

	public static void main(String[] args) {
		//A a = new A();
		//a.p();
		A.B b = new A("AA").new B(); // 이너클래스 생성해서 그걸 외부Test02에서 가져다가 썼다.
		b.print();
		// A.C c=new A().new C();
		// c.print();
		A.C.print(); // C는 static 해서 객체생성 없이 갈수 있다.
	}
}
class A {
	String name = "A";

	public A() {}
	public A(String name) {
		super();
		this.name = name; // 생성자를 통해 A가 가지고 있는 값 바꿀수 있어
	}

	void p() {
		System.out.println("A에서호출");
		new B().print(); // B클래스를 쓰고 싶어 new B()가 객체를 생성하는거
	}

	 class B {
		String name = "B";

		void print() {
			System.out.println(A.this.name);
			System.out.println(this.name); // class b 접근
		}
	}

	static class C { // 이너 클래스만 static허용
		static void print() {
			System.out.println("~~~~~~~~~~");
		}

	}
	class D {
		void p() {
			class E { // 로컬이너클래스

			}
		}
	}
}
