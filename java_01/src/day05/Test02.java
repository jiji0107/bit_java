package day05;

import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
			int[] scores = {77,99,100,85,91};
			int[] sc = new int[scores.length*2]; 
			System.arraycopy(scores, 0, sc, 0, scores.length); 
			System.out.println(Arrays.toString(scores));
			System.out.println(Arrays.toString(sc));
			
			String[] names = {"홍길동" , "박길동" , "고길동", "최길동"};
			String[] nc = new String[names.length*2];
			
			System.arraycopy(names, 0 , nc, nc.length-names.length ,  names.length);
			System.out.println(Arrays.toString(names));
			System.out.println(Arrays.toString(nc));
		    //					   어느위치 
			//arraycopy라는 메소드가 있다. 계좌이체 할때 어느 통장에서 어느통장으로 얼마 먼가 기능 수행을 하기위해 필요한 정보가 있을
			//수도 있고 없을 수도 있다. 없으면 호출하고 있다면 꼭 넘겨주어야 한다. 어느배열에서 어느 배열로 어느 위치에서 어느 위치로 몇개 복사 할 것인지 object는 주소
	}

}
