package day02_ex;

public class Probl { // probl는구분자 public 누구든 접근 가능하기

	public static void main(String s[] ) { //static new안에 메모리가 올라간다.
		int tom = -1; //data 
		char marry = '9';
		boolean john = false;
		String sarah = "Sarah Jang"; //string은 주소 레퍼렌스 
		System.out.println("our freiends..\n  "
				+  tom + "," +    marry + " , "  +john + " and " +sarah); // println 문자출력 후 줄 띄어주기
	
		System.out.printf("our freiends..%n %d,%c,%b and %s %n" ,tom,marry,john,sarah);
			
		
	}

}
