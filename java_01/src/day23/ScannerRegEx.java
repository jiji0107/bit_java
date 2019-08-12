package day23;

import java.util.Scanner;

public class ScannerRegEx {
public static void main(String[] args) {
	String str = "1 and 2 and animal and lion and tiger";
	Scanner scan = new Scanner(str);
	scan = scan.useDelimiter("\\s*and\\s*"); //and를 기준으로 앞뒤로 공백이 몇개여도 쪼갤수있다.
	int firstToken = scan.nextInt();
	int secondToken = scan.nextInt();
	String thirdToken = scan.next();
	String fourthToken = scan.next();
	String fifthToken = scan.next();
	System.out.printf("%d,%d,%s,%s,%s",firstToken, //%d는 숫자형식으로 반환 %s는 문자열식으로 반환
			secondToken,thirdToken,fourthToken,fifthToken);
	scan.close();
}
}
