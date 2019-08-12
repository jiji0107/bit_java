package day16;

public class Test01 {
	public static void main(String[] args) {
		System.out.println("main start");
		int a = 10, b = 0;
		
		try {
			System.out.println(1);
			System.out.println(a/b); //throw new AritmeticException() java에서 예외 객체가 생성되어서 던져진걸 예외가 발생했다고 한다. 예외발생해서 catch로 간다.그래서 밑에
			// 2는 안찍고 3출력하고 내려옴
			System.out.println(2);
		}catch (ArithmeticException e) {
			System.out.println("예외 발생 :"+e.getMessage());
			e.printStackTrace(); //예외 정보만을 찍어주는 (메소드 위치가 왔다갔다 한다.)
			System.out.println(3);
		}finally {
			System.out.println("final {항 상 수 행}"); //예외발생하든 안하든 항 상 수 행
		}
		
		//System.out.println("----------------------------------------------------");
		
		//if(b!=0) System.out.println(a/b); //예외 자체가 발생하지 않게 코딩해야한다. 안그러면 비정상코드이다.
		
		System.out.println("main end"); //무슨일 있어도 이걸 찍어야한다. 안그럼 비정상종료
		
	}

}


//ArithmeticException ss;
//NullPointerException nn;
//IndexOutOfBoundsException ii; //예외 자체가 발생하지 않게 코딩해야한다. 안그러면 비정상코드이다.