package day04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test04 {

	public static void main(String[] args) {
			// Array : 같은 타입의 기억공간을 하나의 타입으로 핸들링하는것 배열은 선언하고 생성하고 초기화 해야 한다. 
		
		int[] scores; //배열 선언
		scores = new int[5]; // int타입으로 10개의 방을 만드시오.(배열 생성)
		
		for(int i =0; i<5; i++) {
		System.out.print(scores[i]+"   ");
		}
		System.out.println();
		
		String[] names = new String[5]; 
		for(int i =0; i<5 ; i++) {
		System.out.print(names[i]+"   ");
		
	}
		
		System.out.println("\n======================================");
		
		scores[0] = 99;
		scores[1] = 100;
		scores[2] = 69;
		scores[3] = 79;
		scores[4] = 89;
		
		
		names[0] = "홍길동";
		names[1] = "고길동";
		names[2] = "박길동";
		names[3] = "김길동";
		names[4] = "강길동";
	
		double avg = 0.0;
		double sum = 0;
		for(int i=0 ;i<scores.length ;i++) {
			sum += scores[i];
		}
			 avg = sum/scores.length;
			 
			System.out.println(Arrays.toString(scores)); //어떤 배열이든 이쁘게 만들어 줄게 tostring
			System.out.println(Arrays.toString(names)); 
			 
			// 홍** 99점 평균이상
		
			for(int i=0; i < names.length ; i++) {
				System.out.println(names[i].charAt(0)+"** "+scores[i]+(scores[i] >= avg?"   평균이상" :"  평균미달" ));
			}
	} 
	
    			 
	
}


