package util;

import java.util.Arrays;


public class Sort {
	
		public static int [] sort(int[] nums) {
			
			//배열 원본은 변경되지 않도록 하고  nums가 원본
			//오름차순으로 정렬된 int[] 을 리턴한다.
			
			int[] copy = new int[nums.length];
			System.arraycopy(nums, 0, copy, 0, nums.length);
		 
			int[] num = copy;
			for(int i=0; i<copy.length-1;i++) {
				for(int j=i+1; j<copy.length ;j++) {
					if(copy[i] > copy[j]) {
			    	int temp = copy[i];
			    	copy[i] = copy[j];
			    	copy[j] = temp;
					}
		}
			}
			return copy;
		}
}
		
		
		
		
		
