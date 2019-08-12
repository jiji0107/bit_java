package day08_ex;

class Book { 
	
	
	
	
	private String title; //stack
	private int price;
	
	public Book(String title, int price) { // 노란색은 heap
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
}


  
