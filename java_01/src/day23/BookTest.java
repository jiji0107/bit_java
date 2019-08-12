package day23;

public class BookTest {
	public static void main(String[] args) {
				BookMgr bookMgr = new BookMgr();
				
				/*bookMgr.add(new Book("java", 900) );
				bookMgr.add(new Book("jav", 700) );
				bookMgr.add(new Book("sql", 500) );
				
			
				bookMgr.save();*/
				bookMgr.getBookList().forEach(i -> System.out.println(i));
				
				//bookMgr.add(new Book("~~~~",0));
				
				//bookMgr.save();
	}

}
