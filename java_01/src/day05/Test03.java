package day05;

import java.util.Arrays;

public class Test03 {

	public static void main(String[] args) {
			String msg = "hello JAVA ~~~";
			String msg2 = "hi ~~~ SQL ";
			//char[] c = {'h' , 'e', 'l'};
			char[] c = new char[msg.length()];
			for(int i = 0; i<msg.length();i++) {
				c[i] = msg.charAt(i); //i데이터의 문자를 꺼내서 배열로 만들어주라.
			}
			
			
			char[] cc = msg.toCharArray();
			cc[0]='Q';
			String ne = new String(cc); //string은 문자들의 집합이니까 char로 가는건 간단하고 반대로 char도 string으로 가기 간단하다. 아주 간단하게 왔다갔다가 가능하다.
			
			System.out.println(msg);
			System.out.println(Arrays.toString(c));
			System.out.println(Arrays.toString(cc));
			System.out.println(ne);
}
}