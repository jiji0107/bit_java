package day09;


import java.util.Scanner;

import day09.BookMgr;

public class BookApp {

	public static void main(String[] args) {
		BookMgr mgr = new BookMgr(10);
		Scanner scanner = new Scanner(System.in);
		// 횟수가 보이면 while문 안보이면 for문
		String cmd1 = null;
		while (true) {
			System.out.println("***************명령선택************");
			System.out.println("                                ");
			System.out.println("1 , insert(등록) \n");
			System.out.println("2 , delete(삭제) \n");
			System.out.println("3 , 목록  출력  \n");
			System.out.println("4 , quit(종료) \n");
			System.out.println("*********************************\n\n");
			System.out.println("수행할 명령을 선택하세요!");
			System.out.print(" 1 2 3 4 중 하나를 선택하세요.._");
// 내가 이런 기능을 제공한다.

			cmd1 = scanner.nextLine();
			switch (cmd1.trim()) {
			case "1":
				System.out.println("insert 작업을 수행하는 기능 호출");
				System.out.println("Book title 입력하세요");
				String title = scanner.nextLine();
				System.out.println("Book 가격 입력하세요");
				int price = scanner.nextInt();
				scanner.nextLine(); // 뒤에 엔터 표시를 소진해서 없애주는것 다음번을 위해 쓰인다. 이걸 안하면 영향을 미칠수도 있다.
				mgr.addBook(new Book(title, price));
				break;
			case "2":
				System.out.println("delete 작업을 수행하는 기능 호출");
				System.out.println("삭제할 Bokk title을 입력하세요");
				title = scanner.nextLine();
				mgr.deleteBook(title);
				break;
			case "3":
				System.out.println("목록출력 작업을 수행하는 기능 호출");
				mgr.bookListPrint();
				break;
			case "4":
				System.out.println("정말 종료 하려면 q/Q를 입력하세요");
				String quit = scanner.nextLine().trim();
				if (quit.equals("q") || quit.equals("Q")) {
					System.out.println("App 종료");
					scanner.close();
					scanner = null;
					// return; // 메인 함수 안에서의 return은 애플리케이션 안에서의 종료를 의미한다. (현재의 함수 종료 의미)
					System.exit(0); // App종료
				}
				break;
			default:
				System.out.println(" 다시입력하세요_");
				break;

			}
			System.out.println("==================================");
		}

	}

}
