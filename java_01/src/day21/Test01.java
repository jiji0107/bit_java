package day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test01 {
	public static void main(String[] args) {
		new UI_1();
	}

}

class UI_1 {
	Frame f1;
	Button red, blue, exit;
	Panel p1;

	UI_1() {
		f1 = new Frame("awt UI Test ~~");
		p1 = new Panel();
		p1.add(red = new Button("RED"));
		p1.add(blue = new Button("BLUE"));
		p1.add(exit = new Button("EXIT"));
		f1.add(p1, BorderLayout.SOUTH);

		f1.setSize(300, 300);
		f1.setVisible(true);

		red.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				p1.setBackground(Color.RED);

			}
		});
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.setBackground(Color.BLUE);
			}
		});
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				p1.setVisible(false);
				System.exit(0);
			}
		});

		// f1.addWindowListener(new WindowEventP()); //listener가 붙으면 모두 인터페이스
		// addwindowlistener니가 할일은 new windoweventp에 있어
		f1.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f1.setVisible(false); // 일단 안보이게 바꾸어 버린다. 눈엔 안보이는것처럼 보인다.
				f1.dispose();
				System.exit(0);
			}
		});

	}
}

class WindowEventP extends WindowAdapter {
	@Override
	public void windowClosing(WindowEvent e) {
		// f1.setVisible(false); //일단 안보이게 바꾸어 버린다. 눈엔 안보이는것처럼 보인다.
		// f1.dispose(); 밖으로 빼놓아서 f1쓰면 안된다.
		System.exit(0);

	}
}

