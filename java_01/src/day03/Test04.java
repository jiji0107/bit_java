package day03;

public class Test04 {

	public static void main(String[] args) {
		//for(초기값; 조건식; 증감식) 전통적인 for문
		int i;
		for( i = 1 ; i<10 ;i++ ) {
			System.out.println("Hello java" + i );
		}
		System.out.println(i);

		int j = 10;
		while(j>0) {
			System.out.println("while"+j);
			j--;
			
		}
		
		boolean flag = true;
		while(flag) {
			j++;
			System.out.println("~~~~~" + j );
			if(j==5) flag = !flag;
			
		}
	System.out.println("j : " +j);
	
	 while(j<5) {
		 System.out.println("do while"); // 동작하지 않아
	 }
	 do { 
		 System.out.println("do while");
	 
	} while(j<5); // do while은 우선 한번은 동작하고 그다음 조건을 따진다.
	

}
}
