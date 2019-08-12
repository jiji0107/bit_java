package day05_ex;

import java.util.Arrays;

public class day05_ex2 {

	public static void main(String[] args) {
		int[] num = null;  // 아직은 주소가 없지만 곧 들어갈거야
		num = new int[6];
		//System.out.println(num.length);
		for(int i =0;i<num.length ; i++) {
			num[i] = (int) (Math.random() * 45)+1 ;
			for(int j =0; i>j; j++) {
				if (num[j] == num[i]) {
					i--;
					break;
			}
			}
	//		System.out.println(Arrays.toString(num));
		}
		//서술형 시험
		System.out.println(Arrays.toString(num));
		System.out.println("============sort===============");
		//int count=0;
		for(int i=0; i<num.length-1;i++) {
			int min = i;
			for(int j=i+1;j<num.length ;j++) {
				if(num[min] > num[j]) {
					min=j;
				}
			}
			if(i != min) {
			int temp = num[i];
			num[min] = temp;
			num[i] = num[min];
			//count++;
			}
		}
	//	System.out.println(count);
		System.out.println(Arrays.toString(num));
	}
}
