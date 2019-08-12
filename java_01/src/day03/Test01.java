package day03;

public class Test01 {

	public static void main(String[] args) {
	 // == : 기본형의 값이 같은 지 비교 ,
		// equals() : 참조한 데이터가 같은지 비교
		
		int num1 = 99;
		int num2 = 99;
		
		String name1 = "홍길동";
		String name2 = "홍길동";
		
		String msg1 = new String("Hello");
		String msg2 = new String("Hello java");
		
		        System.out.println("num1==num2 => "+ (num1==num2)); 
			System.out.println("name1==name2 => " +name1.equals(name2)); // string하고 인투를 더하려고 하니까 타임일치 X
				System.out.println("msg1==msg2 =>" +msg1.equals(msg2)); //equals를 통해서 msg1과 msg2가 같으니? 
				
         msg1 = msg2;  //msg1도 이제 msg2를 가리키게 되니까 msg1은 가비지의 대상이 된다.
   
				
	}

}
