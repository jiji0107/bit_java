package day10_ex;



public class Teacher extends Person  {
	//private String name = "유관순";
	//private int age  = 40;
	

	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	private String subject = "교무과";
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void name() {
		System.out.println(getName());
	}
	public void age() {
		System.out.println(getAge());
	}
	void print() {
		System.out.printf("이    름 :%s    나이:%s  담당과목:%s \n",getName(),getAge(),this.subject);
	}
	
}
