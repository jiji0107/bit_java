package day18_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		String[] names1 = {"이순신","김순신","박순신","강순신"};
		System.out.println(Arrays.toString(names1));
		Arrays.sort(names1); //배열 sort arrays는 배열을 관리해주는 util클래스
		System.out.println(Arrays.toString(names1));
		
		System.out.println("=====================================");
		List<String> list = new ArrayList<String>();
		list.add("김길동");
		list.add("고길동");
		list.add("홍길동");
		list.add("최길동");
		list.add("박길동");
		list.add("고길동");
		list.add("이길동");
		
		System.out.println(list);
		Collections.sort(list); //collect Sort 수행 collect 클래스이다.
		System.out.println(list);
		List<String> list2 = new ArrayList<String>(list.subList(1, 4)); // 1,2,3 3개가 나온다. 1번째 인덱스 부터 3개
		System.out.println(list2);
		
		Object[] obj = list.toArray(); //object의 배열
		System.out.println("obj => " +Arrays.toString(obj));// object[] type
		String[] obj2 = new String[list.size()];
		list.toArray(obj2); //내가 원하는 타입
		System.out.println("obj2 =>" + Arrays.toString(obj2)); // String [] type
		
		String[] sss = {"111","999","777","333"};
		List<String> sslist = new ArrayList<String>(Arrays.asList(sss));
		System.out.println(sslist);
		
		System.out.println("   ======  list 다루기   =====  ");
		System.out.println(list);
		System.out.println(list.contains("아길동"));
		
		for(int i=0; i<list.size() ; i++) {
			System.out.println(list.get(i).charAt(0)+"**");
		}
		for(String data:list) {
			System.out.println(data+" ");
		} //set구조는 주머니라 이렇게 해야한다.
		System.out.println();
		//iterator의 접근성을 향상시킨것이 
		Iterator<String> it = list.iterator(); //for문대신 iterator로 순회할것이다.
		while(it.hasNext()) {
			String data = it.next();
			if(data.equals("고길동")) {
				System.out.println("고길동 삭제 되었습니다.");
				it.remove();
			}
		}
		System.out.println(list);
	}

}
