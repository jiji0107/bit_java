package day17;

public class Book1<T extends Number> { // <>제너릭
	private String title;
	private T price;
	
	
	public Book1() {}
	public Book1(String title, T price) {
		super();
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + "]";
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public T getPrice() {
		return price;
	}
	public void setPrice(T price) {
		this.price = price;
	}
	
	
}
