package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

public class Test05_command_Map {
	public static void main(String[] args) { // main 메소드 뒤에 정보 넘겨 줄 수 있어
		// Map 구조 설계
		// Command delete = new DeleteCommand(); // is a 관계 활용
		// Command update = new UpdateCommand();
		// Command select = new SelectCommand();
		// Command insert = new InsertCommand();

		Map<String, Command> map = new HashMap<String, Command>();

		map.put("delete", new DeleteCommand());
		map.put("update", new UpdateCommand());
		map.put("select", new SelectCommand());
		map.put("insert", new InsertCommand());
		map.put("new", new Command() {

			@Override
			public void exec() {
				System.out.println("기능추가");
			}

		});

		Scanner scanner = new Scanner(System.in);
		System.out.println("delete update select insert 중하나를 입력하세요");
		String cmd = scanner.nextLine();

		Command command = map.get(cmd);
		if (command != null)
			command.exec();

	}
}

// String cmd = args[0]; // delete update select insert
