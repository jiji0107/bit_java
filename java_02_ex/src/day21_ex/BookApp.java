package day21_ex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultEditorKit.InsertBreakAction;

class BookApp extends JFrame implements ActionListener {
	public static void main(String[] args) {
		new BookApp();
	}

	JButton Insert, delete, list, search, quit;
	TextField msg;
	TextArea output;
	Panel p1;
	Panel p2;
	int isbn = 0;
	BookMgr mgr = new BookMgr();
	// Scanner scanner = new Scanner(System.in);
	// 횟수가 보이면 while문 안보이면 for문

	BookApp() { // 생성자
		p1 = new Panel();
		p1.add(Insert = new JButton("Insert"));
		p1.add(delete = new JButton("Delete"));
		p1.add(list = new JButton("List"));
		p1.add(search = new JButton("Search"));
		p1.add(quit = new JButton("Quit"));

		add(p1, BorderLayout.SOUTH);

		add(output = new TextArea(15, 40));
		output.setFont(new Font("SansSerif", 1, 20));

		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Insert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String a = JOptionPane.showInputDialog("책 제목을 입력하세요");
				int b = Integer.parseInt(JOptionPane.showInputDialog("가격을 입력하세요"));
				mgr.addBook(new Book(isbn, a, b));
			}
		});

		delete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String a = JOptionPane.showInputDialog("책 제목을 입력하세요");
				mgr.deleteBook(a);

			}
		});
		list.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Set<Book> d = mgr.bookListPrint();
				output.setText("");
				d.forEach(i -> output.append(i.toString() + "\n"));
			}
		});
		search.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String a = JOptionPane.showInputDialog("책 제목을 입력하세요");
				Set<Book> d = mgr.searchTitleBook(a);
				output.setText("");
				d.forEach(i -> output.append(i.toString() + "\n"));
			}
		});
		quit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// p1.setBackground(Color.BLACK);
				setVisible(false); // 일단 안보이게 바꾸어 버린다. 눈엔 안보이는것처럼 보인다.
				dispose();
				System.exit(0);
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
