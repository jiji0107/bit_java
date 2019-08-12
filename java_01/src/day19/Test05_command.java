package day19;

import java.util.Scanner;

public class Test05_command {
	public static void main(String[] args) { //main 메소드 뒤에 정보 넘겨 줄 수 있어 
		Command delete = new DeleteCommand(); //is a 관계 활용
		Command update = new UpdateCommand();
		Command select = new SelectCommand();
		Command insert = new InsertCommand();

		//String cmd = args[0]; // delete update select insert
		Scanner scanner = new Scanner(System.in);
		System.out.println("delete update select insert");
		String cmd = scanner.nextLine();

		switch (cmd) {
		case "insert":
			insert.exec();
			break;
		case "update":
			update.exec();
			break;
		case "select":
			select.exec();
			break;
		case "delete":
			delete.exec();
			break;
		default:
			System.out.println("잘못입력했습니다.");
			break;
		}

	}
}
