package day05;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
//콜바이벨유 call by value
		int num1 = 99;
		int num2 = num1; //num1이 복사되어 num2로 들어간다.
		System.out.println("num1="+num1+" , num2="+num2);
		num1 = 77;
		System.out.println("num1="+num1+" , num2="+num2);
//콜바이레퍼렌스	call by reference	
		int[] n1 = {11,22,33,44,55,66,77};
		int[] n2 = n1; // n1의 주소가 넘어간다.
		int[] n3 = new int [n1.length]; // n1과 같게
		for(int i = 0; i<n1.length; i++) {
			n3[i] = n1[i];
		}
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));
		n1[2] = 0;
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(n2));
		System.out.println(Arrays.toString(n3));
		
	}

}
