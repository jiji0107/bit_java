package day06;

public class Test04 {

	public static void main(String[] args) {
				
		 Employee emp1 =  new Employee();
		  emp1.setAge(31);
		    emp1.setName("홍길동");
		    emp1.setDept(null);
		    emp1.setSingle(true);
		 
		    Employee emp2 =  new Employee();
		    emp2.setAge(31);
		    emp2.setName("홍길동");
		    emp2.setDept("인사부");
		    emp2.setSingle(true);
		    
		    Employee emp3 =  new Employee(); //메모리에 떠있는거 오브젝트 = 인스턴스
		    emp3.setAge(27);
		    emp3.setName ("박보검");
		    emp3.setDept ("영업부");
		    emp3.setSingle(true);
		    
		    Employee emp4 =  new Employee(); //메모리에 떠있는거 오브젝트 = 인스턴스
		    emp4.setAge(28);
		    emp4.setName ("김길동");
		    emp4.setDept ("영업부");
		    emp4.setSingle(true);
		    
		    
			Employee[] emp = {emp1,emp2,emp3,emp4};
			
		System.out.println("== 영업부에 근무하는 사원 목록 ==");
		double sum = 0;
		int count = 0;
		for(int i =0; i<emp.length ; i++) {
			//for(Employee data1 : emp) { 
			// if(	emp[i].geDept() equlas.("영업부") /이조건은 널일땐 죽는다/주소가 있어야 도뜨를 쓴다.
			//	if(emp[i].getDept !=null &&	emp[i].geDept() equlas.("영업부") / null체크는 기본으로 한다 String 으로 안쓴다.
							// sum+= emp[i].getAge()
			if(emp[i].getDept() !=null&& emp[i].getDept().equals("영업부")) {
				sum+= emp[i].getAge();
				count++;
				emp[i].display();
			
		}
		}
		System.out.println(" == single인 사원 목록 == ");
	
		for(int i =0;i<emp.length ; i++) {
		//System.out.println(emp[i].isSingle());
		if(emp[i].isSingle()) {
			emp[i].display();
		}
		
		}
	}
	}


