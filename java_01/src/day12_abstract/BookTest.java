package day12_abstract;

public class BookTest {

	public static void main(String[] args) {
		String msg1 = "hello";
		String msg2 = "hello";
		System.out.println(msg1.toString()); //toString은 이미 오버라이딩을 해서 주소가아닌 데이터가 찍힌다.
		System.out.println(msg1.equals(msg2));
		System.out.println(msg2);
		
		Book b1 = new Book("java", 2200);
		Book b2 = new Book("java", 2200);
		System.out.println(b1.toString());
		System.out.println(b1.equals(b2)); //기본연산자는 == 문자는 무조건 equals쓰기 equals 중복체크할때 사용 , 주소를 비교해서 주소가 달라서 false가 나왔음
		System.out.println(b2);
		
		System.out.println(b1.equals(msg1));
		b1.close();
		b2.close();
		b1=null;
		b2=null; //null로 사인을 해야만 가비지가 동작할때 가능 다쓰고나면 꼭 널로 싸인하기
		
		System.gc();
		
		System.out.println("=== main end === ");
		
	}
}
