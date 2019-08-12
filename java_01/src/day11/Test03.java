package day11;

public class Test03 {

	public static void main(String[] args) {
		    
			Person  p = new Person("고길동",22); //p는 다운캐스팅 불가능 p밑에 없어성 new는 클래스 로딩 
			Person  s = new Student("홍길동",20,2019001);
			Employee e = new Employee("유관순", 40, "교무과");
			Object o = new Teacher("이순신", 30, "JAVA");
			Object msg = new Teacher("hello java");
			
	}

}
