package day06;

public class Employee {
		//데이터(변수)+기능(메소드)
	 private String name; //public하지 않으면 접근이 안된다. 패키지 레벨 디폴트 same패키지에 있어야만 접근이 가능하다. 
	 private String dept;
	 private int age; 	//201901 private는 이 클래스 이외에서는 접근이 불가능하다. 데이터히든
	 private boolean single; 
	 
	 
	public void display()  {
		
		
		System.out.printf("[생존:%10s,이름:%10s,나이:%10s,결혼여부:%10s]%n", this.getAge(), this.getName(), this.getDept(),this.isSingle());
		
		return; // return 다음 데이터가 없이 그냥 돌아가는게 void 
		
	}
	
	public void setAge(int age) {//local변수 
		if(!(age>0 && age <=100)) {
			System.out.println("age(나이) 정보가 올바르지X");
			return;
		}
		this.age = age;
	 //age = data;
		return;
	}
	
	
	public int getAge() {
		return  age; // 반드시 age타입을 public 뒤에 써줘야한다.
	}

	public String getName() {
		return name;
	}

	public void setName(String name) { //this 꼭 가져오기.
		this.name = name;
	}

	public String getDept() { //홍길동의 dept궁금
		return dept;
	}

	public void setDept(String dept) { // dept의 값을 Stirng 타입으로 가져온다. 그리고 this로 가져온다.
		this.dept = dept;
	}

	public boolean isSingle() { 			//get 대신 is로 바뀐다 boolean 읽을 수 있어야하고 왜 생기는 지 꼭 알아야 한다.
		return single;
	}

	public void setSingle(boolean single) {
		this.single = single;
	}

	
}


