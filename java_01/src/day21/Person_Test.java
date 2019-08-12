package day21;

public class Person_Test {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("이디야");
		p1.setAge(23);
		p1.setSex("여");
		p1.print();
		p1.grow();
		Person p2 = new Person("메리",25,"남");
		if (p2.getSex().equals("여")) {
			System.out.println("여자입니다.");
		}
		
	}

}
