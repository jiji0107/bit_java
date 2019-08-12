package day08;

public class BlockTest {
	public static void main(String[] args) {
		Block b1 = new Block();
		b1.print();
		Block b4 = new Block();
		b4.print();
	}
}

class Block {
	int i;
	int j;
	static String name;
	static {
		name = "~~~~";
		// System.out.println("static { }");
	}
	{ // 딱한번 초기화 된다. 생성자 함수에서 반복적으로 생기는 코드를 밖으로 꺼낼 수 있다.
		this.j = 99;
	}
	
	 // System.out.println("{ }");
	 // 아무것도 안쓰면 그냥 초기화 Block (생성자 함수보다 먼저 나오는)

	public Block() {
		//this.j = 99;
		// System.out.println("생성자"); //생성자 함수는 초기화 할때 많이 사용된다. 그리고 여러개 있을 수 있다.
	}

	public Block(int i) {
		this.j = 99;
		this.i = i;

	}

	public void print() {
		System.out.printf("i=%s,j=%s,name=%s %n", i, j, name);
	}

}
// 자동으로 기본 생성자가 만들어지고 Block(); 안에 들어간다.