package day08_exx;

import java.util.Arrays;

public class BookTest {

	public static void main(String[] args) {
		BookMgr mgr = new BookMgr(5);
		  mgr.addBook(new Book("Java Program",160000));
		  mgr.addBook(new Book("JSP Program",25000));
		  mgr.addBook(new Book("SQL Fudamentals" ,30000));
		  mgr.addBook(new Book("JDBC Program",19000));
		  mgr.addBook(new Book("EJB Program",17500));
		  mgr.addBook(new Book("EJB Program",17500));
		  mgr.bookListPrint();
		  System.out.println("총합계 : "+ mgr.bookTotalprice());
		
	}
}
			//Book[] b = mgr.getBookList();
			//for(int i=0; i<b.length ;i++) {
	 		// b[i].print(); 
		  
		//System.out.println(Arrays.toString(mgr.getBookList())); 배열이 어떻게 어로케이드 되는지 확인하려고 썼다.
		
		//for(Book data : mgr.getBooklist()) {
		//	System.out.println(data);
		
	
	
	
		