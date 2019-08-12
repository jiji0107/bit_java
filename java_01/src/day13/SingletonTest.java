package day13;

public class SingletonTest {
	

	public static void main(String[] args) {
}
		//Singleton s1 = new Singleton():	//에러가 나는 이유는 밑에 private여서 
		Singleton s1 = Singleton.getInstance(); //Singleton 객체생성
		Singleton s2 = Singleton.getInstance(); //자바 프로그램이 동작할 때 최초 한번만 메모리를 할당하고 할당된 메모리에서만 사용하는 방식을 말한다.
		Singleton s3 = Singleton.getInstance();
	}

class Singleton{
	private static Singleton s = new Singleton();
	private Singleton(){ 
		System.out.println("Singleton() 생성");
	}
	public static Singleton getInstance() { //Singleton을 하나 만들어 놓고 getInstance를 호출하는 아이들을 불른다.
		if(s==null) s = new Singleton();
		return s; //return타입이 Singleton이 와야한다. 하나를 만들어서 공유하면서 쓰고 싶다.
	}
}


