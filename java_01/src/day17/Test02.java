package day17;

public class Test02 {
	public static void main(String[] args) {
		Book b1 = new Book("java", 900); // <object,object> object다운캐스팅을 항상 준비하기
		
		if(b1.getTitle() instanceof String) //String에 해당되는 아이들만
		System.out.println(((String) b1.getTitle()).charAt(0));
		
		Book<String, Integer> b2 = new Book<String, Integer>("SQL" , 400);
		System.out.println(b2.getTitle().charAt(0));
		
		//Object[] obj = {1,2,3};
		Book<?, Integer> b3 = new Book<String, Integer>("Spring" , 4400);
		System.out.println(b3.getTitle()); // ? => object++		
		Book<String, ? extends Number> b4 = new Book<String, Integer>("Spring" , 4400);
		System.out.println(b4.getPrice()); // ? => 데이터 타입 Number type Number의 자식
		Book<String, ? super Number> b5 = new Book<String, Object>("Spring" , 440);
		System.out.println(b5.getPrice()); // ?=> Object Number의 부모
}
}
