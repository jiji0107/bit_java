package day21;

import day21.Teacher;

public class TeachTest {

	public static void main(String[] args) {
		Teacher t1 = new Teacher("대장금", 20, "여");
		Student s[] = { new Student("강감찬", 20, "남"), new Student("이순신", 20, "여"), new Student("성길동", 20, "남"),
				new Student("강길동", 20, "여"), new Student("수제자", 20, "남"), new Student("박길동", 20, "여"),
				new Student("고길동", 20, "여"), new Student("홍길동", 20, "여"), new Student("세종대왕", 50, "남"),
				new Student("세종대왕", 50, "남") };
		t1.stu=s;
		t1.setbest();
		t1.print();
		// System.out.println("수제자"+name+

	}

}
