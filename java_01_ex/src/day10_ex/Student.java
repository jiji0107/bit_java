package day10_ex;


public class Student extends Person  {
	
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}
	//private String name = "홍길동";
	//private int age  = 40;
	private int id = 200201;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void name() {
		System.out.println(getName());
	}
	public void age() {
		System.out.println(getAge());
	}
	void print() {
		System.out.printf("이    름 :%s    나이:%s  학      번:%s \n",getName(),getAge(),this.id);
	}

}

