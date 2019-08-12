package day09;

import java.util.Arrays;

public class BookMgr {
	private Book[] bookList;
	int count = 0;

	public BookMgr() {
		this(5);
	}

	public BookMgr(int size) {
		bookList = new Book[size];
	}
	// public Book[] getBookList() {
	// return bookList;
	// }

	public void setBookList(Book[] bookList) {
		this.bookList = bookList;
	}

	public int searchBook(String title) {
		for (int i = 0; i < count; i++) {
			bookList[i].getTitle().equals(title);
			if (bookList[i].getTitle().equalsIgnoreCase(title)) {
					return i;
			}
		}
			return -5;
	    }
	
	public void deleteBook(String title) {
		int sb = searchBook(title);
		if(sb == -5 ) { 
			System.out.println("삭제할 수 없습니다.");
		}
		else {
			System.out.println("삭제되었습니다.");
			for(int i =sb; i< count-1; i++) {
				bookList[i] = bookList[i+1];
			}
			bookList[count-1] = null;
			count--;
		}
		}
	

	public void addBook(Book book) {
		if (count == bookList.length) {
			Book[] copy = new Book[bookList.length * 2];
			System.arraycopy(bookList, 0, copy, 0, bookList.length); // 여기서는 5개의 방이 온다.
			bookList = copy; // 여기서 두배가 된다.
		}
		bookList[count] = book; // 어느 위치에서 관리할지 count
		count++;
		// 삭제할때 --count;
	}

	

	public void bookListPrint() {
		System.out.println("============Book List===========");
		for (int i = 0; i < count; i++) {
			bookList[i].print();
		}
		System.out.println("총" + count + "원");
		System.out.println("================================");
	}

	public int bookTotalprice() {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += bookList[i].getPrice();
		}
		return sum;
	}
}
