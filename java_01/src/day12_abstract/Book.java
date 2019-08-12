package day12_abstract;

public class Book extends Object {

	private String title;
	private int price;
	
	public Book() {}
	
	public Book(String title, int price) {
		super();
		this.title = title;
		this.price = price;
	}
	public Book(int price, String title) { //파라미터는 같고 순서는 달라도 오버라이딩 가능
		super();
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() { //내가 찍고자 하는 정보를 리턴해준다.
		StringBuilder sb =new StringBuilder();
		sb.append("Book정보     title: ");
		sb.append(title);
		sb.append(", 가격:");
		sb.append(price);
	
		return sb.toString();
				
	//	return "Book정보     title: " + title+" / 가격 : " +price;
	}
	public boolean equals(Object obj){
		boolean flag = false;
		if(obj == null || ! (obj instanceof Book)) {
			return false;
		}
		Book data = (Book)obj; //위에 Book에서 캐스팅한게 데이터로 들어간다.
		if(price == data.price && title.equals(data.title) )
		{flag = true;
		}
		return flag;
		/*if(title.equals(obj.title) && price == obj.price) {
		   return true;
	}
		return false;
	}*/
	}
	@Override
	protected void finalize() throws Throwable {
		//객체가 소멸되기 직전에 호출되는 메소드  이지만 자바에서는 사용안하고 별도의 자원반납 기능을 만들어 사용한다. ex) close()
		System.out.println("자원 반납코드 ~~~~~~~~~~~~");
	}
	public void close() {
		System.out.println("close() 자원 반납 코드 ~~~~ ");
	}
}
