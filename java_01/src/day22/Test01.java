package day22;

import java.io.File;
import java.util.Date;

import javax.print.DocFlavor.INPUT_STREAM;

public class Test01 {
	public static void main(String[] args) {

		File dir = new File("c:\\");
		String[] list = dir.list();
		File file = null;
		Date date = null;
//stream은 데이터가 흘러들어가는 통로
		for (String data : list) {
			file = new File(dir, data); // dir폴더에 있는 데이터
			System.out.print(file.getName() + "\t");
			System.out.print(file.length() + "\t");
			System.out.print(file.length() + "\t");
			date = new Date(file.lastModified());
			System.out.print(date + "\t");

			if (file.isDirectory())
				System.out.print("<dir>");
			System.out.println();
						
		}

	}

}
