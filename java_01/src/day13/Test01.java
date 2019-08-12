package day13;

import java.util.Calendar;
import java.util.Formatter;

public class Test01 {
	public static void main(String[] args) throws Exception{ //메인메소드 처리하다 예외가 발생하면 JVM에서 처리할거야
			// 내가 하드디스크에 가서 기록하고 싶어. 이걸 모아서 한번에 기록하는것이 좋다. formatter같은건 버퍼를 통해 모아서 기록하고 돌아간다.
		Calendar c = Calendar.getInstance();
		System.out.println(c);
		String date = String.format("현재시간은 %tk 시: %tM 분 %ts초 %n",c,c,c);
		System.out.println(date);
		
		System.out.printf("%f",Math.PI);
		String f = String.format("%f", Math.PI);
		System.out.println("----------------------------------------------------");
		StringBuffer sb= new StringBuffer(); //data를 넣어서 차곡차곡관리
		//Formatter fm = new Formatter(sb); stringbuffer 차곡차곡관리
        //Formatter fm = new Formatter();
		//Formatter fm = new Formatter(System.out); 콘솔창에 뜬다.
		Formatter fm = new Formatter("sss.txt");
		
		fm.format("현재시간은 %tk 시: %tM 분 %ts초 %n",c,c,c); //sss.txt라는 파일에 기록이 되었다.
		fm.format("%f %n",Math.PI, args);
		System.out.println(sb);
		fm.flush();
		System.out.println("main end");
	}
	

}
