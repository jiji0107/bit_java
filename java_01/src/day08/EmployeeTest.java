package day08;



public class EmployeeTest {

	public static void main(String[] args) {
        		Employee emp1 = new Employee(); //객체생성
        		//emp1.setName("홍길동");
        		//emp1.setDept("인사부");
        		//emp1.setSingle(true);
        		  emp1.print();
        		
        		Employee emp2 = new Employee("고길동","영업부",false); //()에 기본 생성자를 이용해서 생성하겠습니다.
        		emp2.print();
        		
        		Employee emp3 = new Employee("김길동","인사부");
        		emp3.print();
        		
        		Employee emp4 = new Employee("최길동","기술부",true);
        		emp4.print();
	// 객체 생성 과정에서만 호출되는게 생성자 함수 return타입 언급 X
        		
        		
	}

}
