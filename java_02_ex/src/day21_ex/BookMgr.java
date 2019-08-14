package day21_ex;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class BookMgr {
	Set<Book> bookList = new HashSet<Book>();

	public BookMgr() {

	}

	public void addBook(Book book) {
		bookList.add(book);
	}
	// public Book[] getBookList() {
	// return bookList;
	// }

	public void deleteBook(String title) {
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if (data.getTitle().equals(title)) {
				bookList.remove(data);
				//System.out.println(title + " 삭제했습니다.");
				return;
			}

		}

		//System.out.println(title + "삭제 할 도서가 없습니다.");

	}

	public Set<Book> searchTitleBook(String title) {
		Set<Book> temp=new HashSet<Book>();
		Iterator<Book> it = bookList.iterator();
		while (it.hasNext()) {
			Book data = it.next();
			if (data != null && data.getTitle().toUpperCase().contains(title.toUpperCase())) { // 북에있는걸 다 꺼내서 대문자로 바꾸고		
			temp.add(data);
			}}			
		return temp;
	}

	public Set<Book> bookListPrint() {
		return bookList;
	}

}
