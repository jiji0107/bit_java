package day23;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class BookMgr {
	// Book[] 관리
	List<Book> list = null; // Book의 배열은 콜렉션에서 관리한다.
	String fileName;

	BookMgr() {
		this("book.dat");
	}

	BookMgr(String fileName) {
		this.fileName = fileName;
			list = (List<Book>) MyFile.load(fileName); // 파일이 있으면 데이터 들어가고 아니면 널이니까 아주 기본적인 생성
			if(list == null) {
				list = new ArrayList<Book>();
			}
	}

	// CURD
	public void add(Book data) {
		list.add(data);
		// 제어권은 ArrayList로 넘어갔다.
	}

	public List<Book> getBookList() {
		return list;

	}

	public void save() {
		MyFile.save(fileName, list); // myfile에 save 동작해서 filename과 list 출력
	}
	class AutoSave extends Thread {
		public void run() {
			while (true) {
				save();
				System.out.println("AutoSave() ~~~~ ");
				try {
					Thread.sleep(1000*60*2);
				}catch (Exception e) {
					
				}
			}}
}}
