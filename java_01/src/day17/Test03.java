package day17;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Test03 {
	public static void main(String[] args) {
		
		List list = new Vector(); //object[]
		list.add("hello");
		list.add("java");
		list.add(200);
		list.add(new Date()); //Object의 배열
		list.add(new Book("Spring",50000));
		
		System.out.println(list);
		
		for(int i =0;i<list.size() ;i++) {
		System.out.println(list.get(i)); //Object
	}
	}
}
