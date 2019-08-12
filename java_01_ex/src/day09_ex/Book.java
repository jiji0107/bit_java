package day09_ex;

class Book { 
	// 데이터에 초점을 맞춘거
	private String title; 
	private int price;
	
	public Book() {     }
	public Book(String title, int price) { 
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
	public void print() {
		System.out.printf("Book[%3s : %5d원] %n",title,price);
	}
}
