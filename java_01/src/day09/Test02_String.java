package day09;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Test02_String {

	public static void main(String[] args) {
			String msg = "Java Programming/23000";
			System.out.println(msg.indexOf("/")); //문자열 문자 다 가능  오버로딩
			
			String d1 = msg.substring(0,msg.indexOf("/"));
			String d2 = msg.substring(msg.indexOf("/")+1);
			
			System.out.println(d1);
			System.out.println(d2);
			
			String url = "http://127.0.0.1:8080/web1/list.do"; //substring은 문자열 뽑아내는거
			System.out.println(url.indexOf('/'));
			System.out.println(url.lastIndexOf('/'));
			System.out.println(url.substring(url.lastIndexOf('/')));
			
			System.out.println(url.contains("web1")); //contains 포함하는지
			
			String data = "2019001/홍길동/ 90_ 70/ 100";
			System.out.println(data);
			data = (data.replace('_', '/')); 
			//데이터가 가르키는 곳에 가서 _를 /로 바꾸라는 말로 착각하면 안된다.
			// 읽어다가 바뀐 결과값만 가져다주는 함수 저 위에는 바뀌지 않는다.
			//System.out.println(data);
			String[] sdata = data.split("/"); //split는 문자 하나로 쪼갠다. 안쪼개질때는 replace
			System.out.println(Arrays.toString(sdata));
			System.out.println("==================================================");
			data = "2019001/홍길동/ 90_ 70/ 100";
			StringTokenizer st =new StringTokenizer(data,"/_");
			System.out.println(st.countTokens());
			while(st.hasMoreElements()) {
				System.out.print(st.nextToken()+" , "); }
	}

}
