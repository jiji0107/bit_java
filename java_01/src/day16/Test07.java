package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("c://lib//sample.txt"));
		while (scanner.hasNext()) {
			String [] data = scanner.nextLine().replace('_','/').split("/");
			System.out.println(Arrays.toString(data));
		}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}catch (Exception e) { // exception e 는 예외상황을 전달받는것
			System.out.println(e.getMessage());		
		}finally{
			if(scanner != null) scanner.close();
			scanner=null;
			System.out.println("자원반납수행"); //예기치 못한 상황 뒷정리
		}
		
		System.out.println("main end");
	
}
}
