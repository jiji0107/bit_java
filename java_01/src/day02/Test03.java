package day02;

public class Test03 {

	public static void main(String[] args) {
                   int x = 600, y = 700;
                   System.out.println("x="+x+", y="+y );
                   System.out.printf("x=%d, y=%d %n" ,x,y); // %n은줄바꿈
                		   
                   //string 에서 + 는 성능 저하의 원인이다. 메모리가 한번 뜨면 데이터가 바꿀 수 없다
                   int temp = x; 
                   x=y;
                   y=temp;
                   
                
                   System.out.printf("x=%d, y=%d %n",x,y);
                   System.out.println("------------------------");
                   
                   double d1 =99.15689, d2=77.34677;
                   System.out.printf("d1=%f , d2=%f %n, ", d1,d2);
                   System.out.printf("d1=%5.2f , d2=%5.2f %n," , d1,d2); ///%뒤에는 소숫점자리 .뒤는 몇번째 짜리까지
                   
                 
                   
                  double temp2 =d1;
                  d1=d2;
                  d2=temp2; 
                  
                  System.out.printf("d1=%5.2f , d2=%5.2f %n," , d1,d2);
                   

	}

}
