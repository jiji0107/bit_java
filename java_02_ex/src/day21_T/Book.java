package day21_T;

public class Book extends Object implements Comparable<Book> {
	
		private int isbn;
		private String title;
		private int price;
		
		public Book() {}
		public Book(int iSBN, String title, int price) {
			super();
			isbn = iSBN;
			this.title = title;
			this.price = price;
		}
		public int getISBN() {
			return isbn;
		}
		public void setISBN(int iSBN) {
			isbn = iSBN;
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
			if (price<0) return;
			this.price = price;
		}
		@Override
		public String toString() {
			return "Book [ISBN=" + isbn + ", title=" + title + ", price=" + price + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + isbn;
			return result;
		}
		
			@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Book other = (Book) obj;
			if (isbn != other.isbn)
				return false;
			return true;
		}
			public void print() {
				System.out.printf("Book[ %10d :%-20s : %10d원 ] %n",isbn,title,price);

			}
			@Override
			public int compareTo(Book o) {
				return title.compareTo(o.title);
			}
 	}


