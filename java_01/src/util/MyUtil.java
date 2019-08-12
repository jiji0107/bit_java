package util;

public class MyUtil {
private static final String max = null;

//method 메소드 오버로딩 
			public static long add(int a, int b) { 
				return a+b; //이걸 두번 쓰면 구분이 안되서 에러
				
			}
			public static double add(double a, double b) { 
				return a+b; 
			}
			public static double add(double a, double b , double c) { 
				return a+b+c; 
				
				}
			
			public static double add(double ...nums) {//가변인자는 배열로 취급된다. 항상 마지막에 와줘야 한다. (double ...nums , double a) 이렇게 쓰면뒤에 몇개올지 모르니까
				///...은 double형으로 데이터가 몇개 들어올지 모른다. 내부적으로 배열처리가 되어버린다.  nums는 배열
				
				double sum=0;
				for(double data :nums) {
					sum += data;
				}
				    
				return sum;
			}
			/*public static double add(double[] a) { //이건배열
			  double sum =0;
			  for(double data: a) {
				  sum += data;
				  
				  return sum;
			  } */
			public static String rightPad (String str, int size, char padChar) {
				if(str.length() > size) {
					return str;
				}
				int count = size-str.length(); 
				for(int i=0; i< count;i++) {
					str = str + padChar; //str에서 더하기연산 쓰면 안좋다.
				}
		  
				return str;
			}
			public static String leftPad (String str, int size, char padChar) {
				if(str.length() > size) {
					return str;
				}
				int count = size-str.length(); 
				for(int i=0; i< count;i++) {
					str = padChar + str; //str에서 더하기연산 쓰면 안좋다.
				}
		  
				return str;
			}
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
			//숫자를 넘겨 받아 그 중 가장 큰수를 리턴하는 함수 max
			
			public static int max1(int a, int b) {
				int max1 = Integer.MIN_VALUE; //큰값을 맥스에 넣어주고 싶어
				max1 = a>=b?a:b;
				return max1; //여기까지 에러나는 이유는 초기화 안해서.
			}
			public static int max(int ...a ) {
				int max = Integer.MIN_VALUE; //큰값을 맥스에 넣어주고 싶어
				for(int data:a) {
					if(max < data) max = data;
				}
				return max; //여기까지 에러나는 이유는 초기화 안해서.
			}
				
			public static int min(int ...a ) {
					int min = Integer.MAX_VALUE; //큰값을 맥스에 넣어주고 싶어
					for(int data:a) {
						if(min > data) min = data;
											}
						return min; //여기까지 에러나는
				}
}


