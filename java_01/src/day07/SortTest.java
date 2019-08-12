package day07;

import java.util.Arrays;

import util.Sort;

public class SortTest {

	public static void main(String[] args) {
			int [] src = {5,9,3,77,1,4,6,99}; //src는 원본
			int [] result = Sort.sort(src);//sort는 copy라는 배열을 8개 만든다. 
			
			System.out.println(Arrays.toString(src));
			System.out.println(Arrays.toString(result));
	}

}
