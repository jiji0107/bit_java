package day08;

public class P164_Test { //메인메소드를 포함하고 있는게 클래스 이름이어야 한다.

public static void main(String[] args) {
	  System.out.println(Count.count);
			Count c1 = new Count();
			Count c2 = new Count();
			Count c3 = new Count();
			Count c4 = new Count();
	}

}

class Count{
	int c;
	static int count; //   System.out.println(Count.count); 이곳에서 공유
	public Count() {
		c++;
		count++;
}
}
//클래스 둘다 퍼블릭을 못한다. 