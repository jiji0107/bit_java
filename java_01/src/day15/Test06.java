package day15;

import javax.swing.JOptionPane;

public class Test06 {
	public static void main(String[] args) {
		String msg = JOptionPane.showInputDialog("1.list 2.update 3. insert 4. delete ");
		command list = new command() {
			@Override
			public void exec() {
				System.out.println("*** list ***");
			}

		}; // command를 implements한걸 객체생성 이자리에서 클래스 생성하고 정의

		command update = new command() {
			@Override
			public void exec() {
				System.out.println("*** update ***");
			}
		};

		command insert = new command() {

			@Override
			public void exec() {
				System.out.println("*** insert ***");
			}
		};

		command delete = new command() {

			@Override
			public void exec() {
				System.out.println("*** delete ***");
			}
		};
		switch (msg) {
		case "1":
			list.exec();
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
