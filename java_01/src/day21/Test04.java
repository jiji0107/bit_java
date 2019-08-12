package day21;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test04 {
	public static void main(String[] args) {
		new UI_4();
	}

}

class UI_4 extends JFrame implements ActionListener {
	// Frame f1;
	JButton red, blue, exit;
	Panel p1;

	UI_4() {
		// f1 = new Frame("awt UI Test ~~");
		super("awt UI Test ~~");
		p1 = new Panel();
		p1.add(red = new JButton("RED"));
		p1.add(blue = new JButton("BLUE"));
		p1.add(exit = new JButton("종료"));
		add(p1, BorderLayout.SOUTH);

		setSize(300, 300);
		setVisible(true);

		red.addActionListener(this);
		blue.addActionListener(this);
		exit.addActionListener(this);

		// f1.addWindowListener(new WindowEventP()); //listener가 붙으면 모두 인터페이스
		// addwindowlistener니가 할일은 new windoweventp에 있어
//		addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				setVisible(false); // 일단 안보이게 바꾸어 버린다. 눈엔 안보이는것처럼 보인다.
//				dispose();
//				System.exit(0);
//			}
//		});

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame에서 새로 추가된 기능
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	 switch(e.getActionCommand()) {
	 case"RED":
		 p1.setBackground(Color.red);
		 break;
	 case"BLUE":
		 p1.setBackground(Color.blue);
		 break;
		 case"종료":
			 System.exit(0);
			 default:
				 break;
	 }
	}
}
