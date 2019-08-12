package day11_ex;

public class Test02 {

	public static void main(String[] args) {
//object는 최상단에만 접근하기 때문에 object를 보는순간 꼭 equals랑 tostring 쓸꺼 아니면 다운캐스팅 꼭 하기
	        Person []	p = {
	        	  new Student ("홍길동", 20, 2012001),
		          new Teacher("이순신", 30, "JAVA"),
			      new Employee("유관순", 40, "교무과")
	        };
	        
	        for(Person data :p) {
	        	data.print(); //부모Person() 영역의 자원을 접근할때는 바로 접근 가능
	        	//자식이 가지고 있는걸 부모가 만든다
	        	//System.out.println();
	        }
	        System.out.println("==========================");
	        
	        for(Person data :p) {
	        	//자식 영역의 자원을 접근할때는 다운 캐스팅 필요
	        	// 반듯이 하단부에 어떤 객체가 바인딩 되어 있는지 타입 체크 필요
	        	if(data instanceof Student) ((Student)data).print(); //student면 student로 다운 캐스팅
	        	if(data instanceof Teacher) ((Teacher)data).print();
	        	if(data instanceof Employee) ((Employee)data).print();
	        
	        }
	}

}

