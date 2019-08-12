package day08_ex;

public class BookTest {

	public static void main(String[] args) {
		Book [] b = new Book[5]; 
			b[0] = new Book("Java Program", 30000);
			b[1] = new Book("JSP Program", 36000);
			b[2] = new Book("SQL Fundam entals", 15000);
			b[3] = new Book("JDBC program", 33000);
			b[4] = new Book("EJB Program", 32000);
		BookMgr bok = new BookMgr(b);
		bok.printBookList();
		bok.printTotalPrice();
	}

}
