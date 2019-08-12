package day06;

public class Test03 {

	public static void main(String[] args) {
			//int num;
			//String name;
		    Employee emp1 = new Employee();
		    emp1.display(); // display 앞에 주소가 반드시 있어야한다. 
	
		    Employee emp2 =  new Employee();
		    //emp2.age = 201901;
		    emp2.setAge(31);
		    emp2.setName("홍길동");
		    emp2.setDept("인사부");
		    emp2.display();
		    
		    
		    Employee emp3 =  new Employee(); //메모리에 떠있는거 오브젝트 = 인스턴스
		    //emp3.age = 201902;
		    emp3.setAge(27);
		    emp3.setName ("박보검");
		    emp3.setDept ("영업부");
		    emp2.setSingle(true);
		    emp3.display();	
		    
		    
		    
		    Employee emp4 =  new Employee(); //메모리에 떠있는거 오브젝트 = 인스턴스
		    //emp3.age = 201902;
		    emp3.setAge(28);
		    emp3.setName ("김길동");
		    emp3.setDept ("영업부");
		    emp2.setSingle(true);
		    emp3.display();	
		    
		    
		    
	}

}
