package day08_exx;

import java.util.Arrays;

public class BookMgr {
	private Book[] bookList;
    int count = 0;
	 public BookMgr() {
		 this(10);
	 }
	 public BookMgr(int size) {
		 bookList = new Book[size];
	 }
	//public Book[] getBookList() {
	//	return bookList;
	//}

	public void setBookList(Book[] bookList) {
		this.bookList = bookList;
	}
	public void addBook(Book book) {
		if(count == bookList.length) {
			Book[] copy = new Book[bookList.length*2];
			System.arraycopy(bookList, 0, copy, 0, bookList.length); //여기서는 5개의 방이 온다.
			bookList = copy; //여기서 두배가 된다. 
		}
		bookList[count] = book; //어느 위치에서 관리할지 count
		count++;
		//삭제할때 --count;
		
	}
	public void bookListPrint() {
		for(int i=0; i<count ;i++) {
			bookList[i].print();
		}
	}
	public int bookTotalprice() {
		int sum = 0;
		for(int i=0;i<count;i++) {
			sum += bookList[i].getPrice();
		}
		return sum;
	}
}

		