package day21;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.stream.Stream;

import javax.swing.JFrame;
import javax.tools.Tool;

public class Test06 {
	public static void main(String[] args) {
		new DrawImg();
	}
}

class DrawImg extends JFrame {
	Image im;

	DrawImg() {
		super.setTitle("DrawImg");
			im = Toolkit.getDefaultToolkit().getImage("c://img/vr.png");
			
			String[] fontlist = Toolkit.getDefaultToolkit().getFontList(); //디프리케이 된 에이피아이 예전엔 이걸 썻는데 지금은 쓰지마
			Stream.of(fontlist).forEach(i -> System.out.println(i));
			
			setSize(500,500);
			setVisible(true);
			//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			

			addWindowListener(new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
				setVisible(false); // 일단 안보이게 바꾸어 버린다. 눈엔 안보이는것처럼 보인다.
				dispose();
				System.exit(0);
			}
		});
		repaint();	
	}
	

	public void paint(Graphics g) {
		g.drawImage(im, 20, 20,120,120, this);
	}

}