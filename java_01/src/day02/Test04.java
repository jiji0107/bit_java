package day02;

public class Test04 {

	public static void main(String[] args) {
      System.out.println("byte type max vslur =>" +Byte.MAX_VALUE);
      System.out.println("int type max value =>" +Integer.MAX_VALUE);
      System.out.println("long type max value =>" +Long.MAX_VALUE); // static 자원들은 무조건class name으로 접근
      
      System.out.println(Math.PI); //pI 상수화처리된 변수 한번 정해지면 수정이불가능하다.
      
      char c = 's';
      System.out.println(c + "숫자니? " +Character.isDigit(c) ); // character는 클래스안에 있는 isdigit이라는 기능을 
      //호출  저자리에 true 아님 flase로 호출한다. 출금해줘 하면 출금해주는게 리턴 반환되는 값 // 리턴타입 c에 있는 문자 s가 숫자니? 메소드 호출
      
      String ss = "1"+"1";
      System.out.println(ss);
  
      
      int s1 = Integer.parseInt("1") + Integer.parseInt("1"); // 문자형을 숫자형으로 변환
      System.out.println(s1);
      
      double s2 = Double.parseDouble("1.6") + Double.parseDouble("1.7"); // 1.6은 인트로 못바뀐다 parseDouble를 
      //호출한자리에 double값을 반환해래     
      //double s2 = 1.6 + 1.7;
      System.out.println(s2);
      
      
      
      
      
      
      
      

      
      
	}

}
