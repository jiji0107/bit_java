package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import day17.PriceException;

public class BookTest {
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("c://lib//sample.txt"));
			while (scanner.hasNext()) {
				String[] data = scanner.nextLine().replace('_', '/').split("/");
				// System.out.println(Arrays.toString(data));
				Book book = null;
				try {
					book = new Book(data[0], Integer.parseInt(data[1])); //여기서 e.getmessage로갔다가 book으로 갔다가 다시 while문으로 간다.
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println(book);
			}
		} catch (FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (scanner != null) {scanner.close();}
			scanner = null;
			System.out.println("자원반납수행");
		}

		System.out.println("main end");
	}
}
