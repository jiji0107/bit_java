package day04_ex;

public class prob3 {

	public static void main(String[] args) {
	
		//1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10)
		
		int sum=0; //sum은 i값을 누적
		int totalsum=0;//sum을 계속 누적
		for(int i =1; i <=10 ; i++) {
		    sum +=i;
		    totalsum += sum;
			
		}
		System.out.println(totalsum);
	}

}
