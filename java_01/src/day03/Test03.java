package day03;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) { //함수는 호출한후 종료한후 다시 나를 호출한곳으로
		
		int jumsu ; 
		// 키보드로부터 점수를 입력 받는다
		
		Scanner input = new Scanner(System.in);  // scanner 다음 input자리는 내 맘대루 정해도 된다.
	    System.out.println("점수를 입력하세요");
		// jumsu = input.nextInt(); //nextint는 한번만 읽어 들인다. 
	    //input.nextLine(); // 뒤에 있는 데이터 다 소진한다.
		//-------------------------------------------------------위에꺼랑 아래꺼 두가지 방법이 있다.
		jumsu = Integer.parseInt(input.nextLine()); // 앞에는 int고 뒤에는 문자열이기 때문에 형변환 필요하다. , input은 system에서 받는다. 
		// 키보드에서부터 입력 받은걸 되돌려 받는다. ,static 한 메소드는 클래스 메소드로 접근한다. /  Integer는 클래스 이름 static은 내가 생성 안해서 주소가
		//없어서 클래스 name으로 접근한다.// nextLine을 호출했으니 이자리에 문자열 들어왔다. parseInt는 무조건 정수로 바뀌어야한다. 안그러면 인식 못한다.
		input.close();
		input = null; // 다쓰고 나면 자원 반납할거야
		
		if(!(jumsu >=0 && jumsu <=100)) // 유효성검사 0과 100사이에 없다면
		
		{ 
		System.out.println("유효하지 않은 점수 입니다.");	
	      return; //현재 수행중인 함수를 종료하고 호출한 자리로 돌아가는 문장 , 메인함수 안에서 return을 쓰면 메인함수의 종료
		}
	   
	 /*   if(jumsu>=80) {
		    System.out.println("PASS");
		    } else {
		    System.out.println("NO PASS");
		    }
		    */   // 삼황 연산으로 처리 
	  String result = jumsu >= 80 ? "Pass " :  "NO PASS ";
	    // System.out.println("점수 : " +jumsu+" : "+result);
	    	  
	    //A,B,C,D,F 등급처리
	   String grade = "F"; // 지금 grade가 F이니까 그냥 이 상태로 남는다라는 의미이다. 
	  if (jumsu >=90) {    
	        grade = "A";
	  }else if (jumsu>=80) {
	    	grade = "B";
	  }else if(jumsu>=70) {	   
	    	grade = "C"; 
	  }else if(jumsu>=60) {
	    	grade = "D";
	  }
	  //{} 이 안에서만 사용가능한 스코프 영역
	   // System.out.println("점수 : " + jumsu + ":" + result + ":" + grade + "등급");
	    System.out.printf("점수 :%s : %s : %s 등급%n" , jumsu,result,grade);
	 
	    
	    //과제 삼황연산자로 처리 
	   
		System.out.println(jumsu >= 90 ? "A" :  (jumsu >= 80 ? "B" : (jumsu >= 70 ?  "C" : jumsu >= 60 ?  "D" : "F"  ))); 
	
	    
   	 	// 등급 처리 switch로
	
	
		
	    System.out.println("***************등급처리 switch************");
	    char c = ' ';
	    
	    switch (jumsu/10) {
	    case 10:
	    case 9:
	    	c='A';
	    	break;
	    case 8:
	    	c='B';
	    	break;
	    case 7:
	    	c='C';
	    	break;
	    case 6:
	    	c='D';	    
	        break;	    
	    default:
	    	c = 'F';
	    	break;
	    	
	    }
	    System.out.println(jumsu+":"+c);
		return;
		

	}

}

