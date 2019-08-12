package day10;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
				char[] c = "ABCDEF".toCharArray(); //다 차에 배열로 만들어줘
				int count = 6;
				int d = 0;
				System.out.println(Arrays.toString(c));
				
				System.arraycopy(c, d+1 , c , d, count-d-1);
				c[--count]=' ';
				System.out.println(Arrays.toString(c));
				
	}

}
