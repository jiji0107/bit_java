package day21;

public class Person {

	String name;
	int age;
	String sex;

	Person() {
	}

	Person(String name, int age, String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) { // 이 name은 받아오는거
		this.name = name; // person
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void print() {
		System.out.println("이름: " + name + "\n나이: " + age + "\n성별: " + sex);
	}

	public void grow() {
		age++;
		System.out.println("나이를 먹어서" + age + "되었다.");
	}
}

class Student extends Person {
	int ban;
	int num;

	Student() {
	}
	Student(String name, int age, String sex) {
		super(name, age, sex);

	}
	@Override
	public void print() {
		super.print();

		System.out.println("ban" + ban + "num" + num);

	}
	@Override
	public String toString() {
		return "Student [ban=" + ban + ", num=" + num + "]";
	}
	
}

class Teacher extends Person {
	Student[] stu = new Student[10];
	Student best = null;
	String subject;

	Teacher(String name, int age, String sex) {
		super(name, age, sex);

	}

	Teacher() {
	}

	public void setbest() {
		for (int i = 0; i < stu.length; i++) {
			if (stu[i].getName().equals("수제자")) {
				best = stu[i];
				return;
			}

		}
		best = null;
	}

	@Override
	public void print() {
		super.print();

		System.out.println(" best: " + best + " subject: " + subject);

	}
}
