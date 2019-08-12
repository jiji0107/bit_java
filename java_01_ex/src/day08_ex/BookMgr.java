package day08_ex;

class BookMgr {
			Book booklist[] = new Book[5];
				public BookMgr(Book[] booklist) {
					this.booklist=booklist;
					}
				void printBookList() {
					System.out.println("=== 책 목록 ===");
				for(int i =0;i<booklist.length;i++) {
				System.out.println(booklist[i].getTitle());
				}
				}
				void printTotalPrice() {
						int sum =0;
				System.out.println("=== 책 가격 ===");
				for(int i =0;i<booklist.length;i++) {
					sum +=  booklist[i].getPrice();
				}
				System.out.println("전체 책 가격의 합: " + sum);
				}
				}
