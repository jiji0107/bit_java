package day13;

public class Person {
	public static void main(String[] args) {

String s = "홍길동 _ 이순신_김유신 /박철 ".replace("_","/");
 String[] n = s.split("/"); //split 한문자를 쪼개는거
 for(int i =0 ; i<n.length; i++) {
	 System.out.print(n[i].trim().charAt(0));
	 for(int j =0; j<n[i].trim().length()-1;j++) {
		 System.out.print("*");
	 }
 System.out.println();
 }
	}
}
