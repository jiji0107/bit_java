package day17;

public class Test01 {
	public static void main(String[] args) {
		Book1 b1 = new Book1("java",900); // T => 아예 언급을 안하면 object
		System.out.println(b1);
		
		Book1<Double> b2 = new Book1<Double>("sql", 700.0);
		System.out.println(b2);
		
		Book1<Integer> b3 = new Book1<Integer>("JSP", 5000); //오토박싱 인트로 자동으로 형변환이 된다. 인트와 인티저 사이는 자동으로 왔다갔다 한다.
		System.out.println(b3);
}
}
