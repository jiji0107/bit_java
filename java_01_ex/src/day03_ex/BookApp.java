package day03_ex;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
System.out.println("***************명령선택************");
		
		
		System.out.println("1 , insert(등록)" );
		System.out.println("2 , delete(삭제)" );
		System.out.println("3 , update(수정)" );
		System.out.println("4 , quite(종료)" );

		System.out.println("*********************************");

		System.out.println("수행할 명령을 선택하세요!");
		System.out.println(" 1 2 3 4 중 하나를 선택하세요.._");
		

		int num = scan.nextInt();
		String res = "";
		switch(num)
		{ 
		case 1 :
			res = "등록" ; break;
		case 2 :
			res = "삭제 " ; break;
		case 3 :
			res = "수정" ; break;
		case 4 :
			res = "종료" ; break;
		default : 
				res = "잘못된값";
		}
	
		System.out.println( num + res +  "합니다.");
	}
		}	
	
		

		
/*		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("***************명령선택************");
				
				
				System.out.println("1 , insert(등록)" );
				System.out.println("2 , delete(삭제)" );
				System.out.println("3 , update(수정)" );
				System.out.println("4 , quite(종료)" );

				System.out.println("*********************************");

				System.out.println("수행할 명령을 선택하세요!");
				System.out.println(" 1 2 3 4 중 하나를 선택하세요.._");
				
						
        int scan = x;
        String res;
        
        	if(scan = 1)	
			res = "등록 " ;
        	else if(scan = 2)
        	res = "삭제" ;
        	else if(scan = 3)
            res = "수정" ;
            else if (scan =4)
            	res = "종료" ;
            	else 
            		res = "잘못된값" ;
            	
			
		  }
	}

}
*/
