package day02;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
	     
		Scanner input = new Scanner(System.in); // new는 무조건 heap영역으로 간다. 스캐너는 어떤 정보를 키보드로부터도 입력받고 키보드에서도 받을수있다 
		//syetem.in은 키보드로부터 데이터를 입력받는다 nextline은 한줄을 입력받는다 input은 하나를 입력받는다. new를 안쓰면 heap이 아니다 . 
		
		System.out.println("학생 이름을 입력하세요 :_");
		String name = input.nextLine();
		
		System.out.println("점수를 입력하세요 :ex)90");
		int score = input.nextInt();
		
		System.out.printf("이름 : %s,점수 : %d %n", name,score);
		 
		input.close();
		input = null; //가비지의 대상이 되려면 null 이어야 한다. , 모든 자원이 반납되었다고 착각하면 안된다. input(losec) input = null
		

		
	}

}
