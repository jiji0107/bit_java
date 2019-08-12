package day09;

import java.util.Arrays;

import javax.swing.JOptionPane;



public class Test01_String {
	public static void main(String[] args) {
		//String msg2 = new String(new char[] {'g','h'});
		//String msg1 = args[0];
		String msg1 = JOptionPane.showInputDialog("book 정보를 입력하세요 ex(title/price)"); //입력받을때  scanner 대신 쓰기
		//Java programming/23000 이 문자열을 쪼개는 작업을 해야한다. /를 기준으로
		//System.out.println(msg1); 
		//System.out.println(msg1 = msg1.toUpperCase()); //msg1을 대문자로 바꾼후 다시 msg1에 넣어서 바뀌었다.
		//System.out.println(msg1);  //string은 불변의 법칙이라 뭘해도 바뀌지 않는다.
		//String msg1 = "Java Programming/23000";
		
		System.out.println(msg1);
		if(msg1.indexOf("/") == -1) {
			System.out.println("다시 입력하세요");
			System.out.println(" / 가 필요합니다.");
			return; //내가 포함된 함수를 종료
		}
		//msg1.indexOf("/");//없다면 -1 있다면 위치인덱스
		String[] data = msg1.split("/");
		System.out.println(Arrays.toString(data));
		
		Book b1 = new Book(data[0],Integer.parseInt(data[1].trim()));
		b1.print();
		
		
	}

}
