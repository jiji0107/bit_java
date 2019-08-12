package day19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Test07_foreach {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(2017002, "김씨", "마케팅부")); // list는 중복허용 set은 안한다.
		list.add(new Employee(2017003, "박씨", "기술부"));
		list.add(new Employee(2017002, "박씨", "전산실"));
		list.add(new Employee(2017003, "고씨", "기술부"));
		list.add(new Employee(2017002, "홍길동", "영업부"));

		// iterator 기반으로 목록 출력
		System.out.println("**** iterator 기반 목록 출력 *****");
		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			Employee data = it.next();
			System.out.println(data);
		}
		System.out.println();// foreach 기반 목록 출력
		System.out.println("**** foreach 기반 목록 출력 ****");
		list.forEach(new Consumer<Employee>() { // 이름없는 consumer을 list가 관리하는 데이터 타입Employee을 정의할게요
			@Override
			public void accept(Employee t) { //foreach accept => 다 소비할거야 데이터꺼내면서 쓸거야
				System.out.println(t);
			}
		}); 
		System.out.println();
		//람다로 표현 
		System.out.println("**** foreach 람다로1 ~~~ ****");
		list.forEach(
			
		(Employee t) -> { System.out.println(t);}); 
		System.out.println();
		System.out.println("**** foreach 람다로2 ~~~ ****");
		list.forEach(t -> System.out.println(t));
		System.out.println("**** foreach 람다로3 ~~~ ****");
		list.forEach(System.out::println); //가능하다
		
	}
}
