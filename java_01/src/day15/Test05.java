package day15;

import javax.swing.JOptionPane;

public class Test05 {
	public static void main(String[] args) {
		String msg = JOptionPane.showInputDialog("1.list 2.update 3. insert 4. delete "); // 추상메소드 하나 있을때 람다로 표현
		command list = () -> System.out.println("*** list ***");
		// command를 implements한걸 객체생성 이자리에서 클래스 생성하고 정의
		command update = () -> System.out.println("*** update ***");
		command insert = () -> System.out.println("*** insert ***"); // 변수에 함수를 바인딩 시키는거 람다식 , 인터페이스의 추상메소드가 하나만 있어야 한다. (람다로 가려면)
		// 람다 => 변수에 함수를 등록하여 사용한다.
		command delete = () -> System.out.println("*** delete ***"); //익명 delete라는 변수에 syte이라는 함수가 등록해서 사용하는거다.

		switch (msg) {
		case "1":
			list.exec(); //위에서 등록했던 함수가 동작을 한다.
			break;
		case "2":
			update.exec();
			break;
		case "3":
			insert.exec();
			break;
		case "4":
			delete.exec();
			break;
		default:
			break;
		}

	}
}
