package day07_ex;

public class Prob11 {

	
	public String rightPad (String str, int size, char padChar) {
			/*  여기에 프로그램을 완성하십시오. */
			if(str.length() > size) {
				return str;
			}
			int count = size-str.length(); 
			for(int i=0; i< count;i++) {
				str = str + padChar; //str에서 더하기연산 쓰면 안좋다.
			}
	  
			return str;
		}

	
	public static void main(String[] args) {
		Prob11 p =new Prob11();
		System.out.println( p.rightPad("bit", 6, '#') ); //###bit
		System.out.println( p.rightPad("bit", 5, '$') ); //$$bit
		System.out.println( p.rightPad("bit", 2, '&') ); //
	}
}



