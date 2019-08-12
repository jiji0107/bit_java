package day08;

public class Card {
      static int WIDTH=100;    //변수에 static 변수에 static 처리
      final static int HEIGHT=250; //파이널 처리하면 수정 불가능
      String Kind = "다이아몬드";
      int number;
      
      public static void main(String[] args) {
    	  //Card.width=0;
    	  System.out.println(WIDTH+"*"+HEIGHT); // share공유 개념이 있어서 static new를 안해도 메모리에 올라가니까 주소가 없다
    	  System.out.println(new Card().Kind); // kind는 인스턴스베리어블이기 때문에 메모리에  띄어야 사용이 가능하다
      }
      
}
