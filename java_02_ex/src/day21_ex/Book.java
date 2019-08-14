package day21_ex;

public class Book extends Object implements Comparable<Book> { 
	// 데이터에 초점을 맞춘거
	private int isbn;
	private String title; 
	private int price;
	
	public Book() {     }
	public Book(String title, int price) { 
		this.title = title;
		this.price = price;

	}
	public Book(int ISBN, String title, int price) { 
		this.title = title;
		this.price = price;
		this.isbn = ISBN;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getISBN() {
		return isbn;
	}
	public void setISBN(int iSBN) {
		isbn = iSBN;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + isbn;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (isbn != other.isbn)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Book [ISBN=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	public void print() {
		System.out.printf("Book[%3s : %5d원] %n",title,price);
	}
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o.title);
	}
	public void CreatUI() {
		
	}
}
