package day15;

public class Test07 {
	public static void main(String[] args) {
		AAA a = new AAA() {
			@Override
			void exec() {

			}
		};
				III i =new III() {
					
					@Override
					public void exec() {
						
					}
				};
				CCC c = new CCC() {
					void exec() {}
					
				};
	}
}

abstract class AAA {
	abstract void exec();

}

interface III {
	void exec();
}
class CCC {
	void exec() {} //부모한테까지만 호출된다. 오버라이딩이 안되어서.  
	 
}