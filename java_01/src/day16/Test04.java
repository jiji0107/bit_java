package day16;

import java.io.IOException;


public class Test04 {
	
	public static void main(String[] args) {
	
		System.out.println("main start");
		int jumsu =  900;
		
		//throw new RuntimeErrorException("~~~~~~ 문제 발생 ~~~~~"); //예외가 발생해서 던져졌는데 예외 아무도 안받아주면 비정상 종료함!
		try {
			if (!(jumsu >=0 && jumsu <=100))
				throw new IOException("jumsu가 유효하지 않습니다."); //런타임일수도 있고 io일수도 있는데 런타임이면 try이 catch안해도 통과 io일땐 해줘야한다.
		}catch (IOException e) {  //던져진 위에걸 잡아서 여기 왔다가 파이널 블럭으로 간다.
			System.out.println(e.getMessage()); //위에 고의로 문제발생 메세지가 getmessage로 등록되어서 , 출력 사용자에게 에러메시지를 보이게 해준다.
		}catch(Exception e) {
		}finally { System.out.println();
		}
		System.out.println("main end"); 
}
}
