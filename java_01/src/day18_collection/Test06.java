package day18_collection;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test06 {

	public static void main(String[] args) {
		Set<Employee> set = new TreeSet<Employee>(); // set구조 자체가 이미 중복 불가이다. TreeSet은 sort 한 후에 정렬한다.
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

