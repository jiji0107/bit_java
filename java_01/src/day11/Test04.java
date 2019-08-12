package day11;

public class Test04 {

	public static void main(String[] args) {
		String msg1 = "hello";
		String msg2 = "hello";
		System.out.println(msg1);
		System.out.println(msg1);
		
		Book b1 = new Book("Java", 700);
		Book b2 = new Book("Java", 700);
		
		System.out.println(b1);
		System.out.println(b2);
	} //object에는 toString과 equals가 있다.

}
class Book extends Object{
	String title;
	int price;
	public Book() {}
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() { //string클래스는 부모로부터 물려받은 tostring을 밑에처럼 오러라이딩했다.
		return "[Book 제목:"+title+"/가격:"+price+"]";
		
	}
}	
	
	
	

