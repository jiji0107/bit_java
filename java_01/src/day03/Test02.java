package day03;

public class Test02 {

	public static void main(String[] args) {
		
		int num = 99;
		
		System.out.println(num > 0 ? "양수" : "음수"); 
        // 양수 , 0 , 음수
		
		System.out.println(num > 0 ? "양수 " :  (num==0 ? "0" : "음수")); // 식안에 식이 있을수 있다 삼항연산자 중첩 시킬 수 있다.
		
		String result = num > 0 ? "양수 " :  (num==0 ? "0" : "음수");
		System.out.println(num + ":"+result);
		
	}
	
}	
	
