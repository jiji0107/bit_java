package day10_ex;



public class Employee extends  Person {
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	//private String name = "이순신";
	//private int age  = 30;
	private String dept = "JAVA";

	public String getdept() {
		return dept;
	}
	public void setSubject(String dept) {
		this.dept = dept;
	}
	public void name() {
		System.out.println(getName());
	}
	public void age() {
		System.out.println(getAge());
	
	}
	void print() {
		System.out.printf("이    름 :%s    나이:%s  부      서:%s \n",getName(),getAge(),this.dept);
	}

}
