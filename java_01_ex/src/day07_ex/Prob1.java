package day07_ex;

public class Prob1 {
	public static void main(String[] args) {
			  
			  Prob1 prob1 = new Prob1();
			  
			  System.out.println( prob1.leftPad("bit", 6, '#'));
			  System.out.println( prob1.leftPad("bit", 5, '$')); 
			  System.out.println( prob1.leftPad("bit", 2, '&')); 
			   
			 }
			 
			 public String leftPad(String str, int size, char padChar) {
			  
			  /*  여기에 프로그램을 완성하십시오. */
			  int f = size - str.length(); // int f = 6-3 =3 length는길이
			  String result = new String(); 
			  
			  while(f != 0) // f=3 이니까 3-2 = 1 ,모든경우의동안
			  {
			   if (f < 0){ // 근데 3-2 = -1 밖으로 나가서 bit
			    break;
			   }
			   else{
			    result = padChar + str; 
			    f -= 1;
			   }
			   str = result;
			  }
			  return str;
			 }
			 }



