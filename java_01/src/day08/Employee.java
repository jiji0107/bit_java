package day08;

/**
 * 
 * @author sjh
 * @since 201907월16일
 * @version 1.0
 * 
 *
 */
public class Employee {
	//static String cName = "BIT";
	private String name;
	private String dept;
	private boolean single;
	
	public Employee() {  //디폴트(기본생성자) 초기화작업을 주로한다.
		this("사원이름","ㅇㅇㅇ 부서",true); // 나의 또다른 생성자 함수를 호출하는 문장 이건 룰이다. , 가기전엔 안돼 갔다가 온 담에 해야해
		    //System.out.println("Employee () call");
			//this.name = "사원이름";
			//this.dept="ㅇㅇㅇ부서";
			//this.single= true;
		   
	}
	public Employee(String name, String dept) { 
			//System.out.printf("Employee(%s,%s) call%n", name,dept);
			//this.name = name;
			//this.dept = dept;
			this(name,dept,false); //this의 함수꼴은 생성자 함수안에 올 수 있고 퍼스틱스태익안에만 올수 있다. 첫번째 문장만 허용하니까 super가 없겠다.
	}
	public Employee(String name, String dept, boolean single) {
		//초기화 작업을 주로 한다. 항상 호출되기 때문에
		//System.out.printf("Employee(%s,%s,%s) call%n", name,dept,single);
		    super(); //퍼스트 스테이먼트에만 해당
		    this.name = name;
			this.dept = dept;
			this.single = single;
			
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public boolean isSingle() {
		return single;
	}
	/** @param single 미혼인지?
	 */
	public void setSingle(boolean single) {
		this.single = single;
	}
	/**
	 * Employee 정보 출력
	 */
	public void print() {
	//	System.out.println("회사명: "+cName);
		System.out.printf("[사원명 :%s 근무부서 :%s single:%s]%n",
						name,dept,single);
	}
	
		
	

}
