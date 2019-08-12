package day12_abstract;

public class year {

	public static void main(String[] args) {
       int num = 11;
		
		
		
		//System.out.println(num >= 2 && num <=12 ? "이번 년도 윤년이 아니다 " :  "이번년도 윤년이다."); // 식안에 식이 있을수 있다 삼항연산자 중첩 시킬 수 있다.
		System.out.println(  num >=1 && num <=2  ? "윤년" :  (num > 2 && num <= 12 ? "윤년이 아니다." : "해당없음"));
		//System.out.println(num + ":"+result);
		
	}
	

}
