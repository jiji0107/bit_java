package day04;

public class Test03 {

	public static void main(String[] args) {
		

	OUT:	for(int i=1;i<=9;i++) {			
			for(int j=2;j<=9;j++) {
				if(j==5) break OUT;
				//if(j==5)continue;	// j가 5일때 처리 안 된다. 그리고 재진입
				System.out.printf("%d*%d=%2d | " ,j,i,j*i );
			}
				System.out.println();
		
	/*	for(int j = 0 ; j>=2 & j<10 ; j++) {
			for(int i =0 ; i<10 ; i++) {
				
			}
			System.out.println("j ="+j );
			 System.out.print('*');
		*/
			
		}
		}
		

		 
				
	}


