package day04;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
	    System.out.println("알파벳 아스키 코드 값 확인");
	    
	    char a='a' , b='A'; 
	
	    for(int i =0 ; i <26 ; i++) {
	    
	    System.out.println(a+" : "+(int)a++ +"  ,  "+b+" : "+(int) b++);
	    }
	   // (int)a는 a라는 문자의 아스키코드 값 
	   // 규칙 대문자에서 소문자로 가려면 -32 소문자에서 대문자로 가려면 +32
	   System.out.println("================================");
	    
	    // 변수 ch에  저장된 문자가 대문자 인 경우에만 소문자로 변경하는 코드를 완성 합니다.
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("문자열을 입력하세요"); //문자열은 문자들이 모여있는 배열
	    String msg = scanner.nextLine();
	   //과제 소문자 골라서 대문자 대문자 골라서 소문자
		
	    for (int i1 = 0; i1<msg.length(); i1++)  {
	    char ch = msg.charAt(i1);  //관리하고 있는 문자중 i자리번째 메소드 호출 
	    char s = (ch >= 'A' &&  ch <= 'Z') ? (char)( ch + 32 ) : (ch >= 'a' && ch<= 'z' ?(char)(ch-32):ch); //+가 들어가면 int로 발생 , ch+32 가 정수로 바뀌니까 뒤에 ch랑 같게 만들어야 하니까 char를 앞에 붙여준다.
	 
	System.out.print(s);
	
	    }    

	}
	}
	    
	


