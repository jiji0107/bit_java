package day07;

/**
 * 
 * @author sjh
 * @since 201907월16일
 * @version 1.0
 * 
 *
 */
public class Employee {
	
	private String name;
	private String dept;
	private boolean single;
	
	public Employee() {
		//초기화 작업을 주로 한다. 항상 호출되기 때문에
	System.out.println("Employee() call");
	name = "사원이름";
	dept = "ooo 부서";
	single = true;
	//기본 생성자
			
	}
	
	public Employee(String name, String dept, boolean single) {
		//초기화 작업을 주로 한다. 항상 호출되기 때문에
		
		System.out.printf("Employee(%n,%s,%s) call%n", name,dept,single);
		    this.name = name;
			this.dept = dept;
			this.single = single;
	//기본 생성자
			
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
		System.out.printf("[사원명 :%s 근무부서 :%s single:%s]%n",
						name,dept,single);
	}
	
		
	

}
