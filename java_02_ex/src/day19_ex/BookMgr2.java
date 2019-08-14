package day19_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.function.BiConsumer;

import org.omg.CORBA.portable.ValueBase;

public class BookMgr2 {

	Map<Integer, Book> map = null;

	public BookMgr2() {
		map = new HashMap<Integer, Book>();
	}

	public void addBook(Book book) {
		map.put(book.getISBN(), book);
	}
	// public Book[] getBookList() {
	// return bookList;
	// }

	public void deleteBook(String title) {
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) { //데이터 있는지 찾아보고 있으면 next명령으로 데이터를 꺼낸다.
			Integer isbn = it.next();
			Book data = map.get(isbn);
			if (data.getTitle().equals(title)) {
				System.out.println(data + "삭제됩니다.");
				// map.remove(isbn);
				it.remove();

			}
		}

	}

	public void searchTitleBook(String title) {
		System.out.println("제목" + title + "검색");
		Iterator<Integer> it = map.keySet().iterator();
		while (it.hasNext()) {
			Integer isbn = it.next();
			Book data = map.get(isbn);
			if (data != null && data.getTitle().toUpperCase().contains(title.toUpperCase())) {

			}

		}
		System.out.println("-------------------------");

	}

	public void bookListPrint() {
		System.out.println("============Book forech 기반=============");

		// bookList.forEach(t -> System.out.println(t));

		map.forEach((Integer k, Book v) -> System.out.println(k + ":" + v));

		System.out.println("================================");
	}

}
