package day04_ex;

import java.util.Scanner;

public class prob4 {


		public static void main(String[] args) {
			String sourceString = 
			"everyday we have is one more than we deserve";
			String encodedString = "";
			
			for(int i = 0 ; i <sourceString.length() ; i++ ) {
				char sing = sourceString.charAt(i);	
	       if( sing != ' ' ) {
	       if (sing < 'x') { 
	    	   sing = (char)(sing + 3 );
	          
	       } else {sing = (char)(sing - 23);
	    	   encodedString = encodedString + sing;
	    		   
	       }
	      
	       }
	    	   
			encodedString = encodedString + sing;
			// 프로그램을 구현부 시작.	
			// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
			// 프로그램 구현부 끝.
}
			System.out.println("암호화할 문자열 : " + sourceString);
			System.out.println("암호화된 문자열 : " + encodedString);
		}
	}
	
