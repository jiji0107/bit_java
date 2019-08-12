package day18_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test04 {

	public static void main(String[] args) {
		Set<Employee> set = new HashSet<Employee>(); // set구조 자체가 이미 중복 불가이다.
		set.add(new Employee(2017001, "홍씨", "영업부"));
		boolean flag = set.add(new Employee(2017001, "홍씨", "영업부"));
		if (!flag)
			System.out.println("등록되었습니다.");

		flag = set.add(new Employee(2017001, "홍씨", "영업부"));
		if (!flag)
			System.out.println("이미 있는 데이터 입니다.");

		set.add(new Employee(2017002, "김씨", "마케팅부"));
		set.add(new Employee(2017003, "박씨", "기술부"));

		// 2017003 사번의 사원을 검색 출력하세요
		System.out.println("사원 목록");
		Iterator<Employee> it = set.iterator();
		while (it.hasNext()) {
			Employee data = it.next();
			System.out.println(data.toString());
			// set 목록 출력
		}
		System.out.println();
		it = set.iterator();
		System.out.println("검색 결과입니다.");
		while (it.hasNext()) {
			Employee data = it.next();
			if (data.number == 2017003) {
				System.out.println(data);
			}
			// System.out.println(data.toString()); // 주소 변환 tostring 오버라이딩
		}

	}

}

class Employee  implements Comparable <Employee>{
	int number;
	String name;
	String dept;

	@Override
	public int hashCode() { // Number만 체크하면 number만 가지고 비교할래
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", dept=" + dept + "]";
	}

	public Employee() {
		super();
	}

	public Employee(int number, String name, String dept) {
		super();
		this.number = number;
		this.name = name;
		this.dept = dept;

	}

	@Override
	public int compareTo(Employee o) {
		return number - o.number ; // 그냥 정렬이 되어서 관리가 되어진다.
	}

}
