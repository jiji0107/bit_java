package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) {
		String src = "c://lib//Ben.mp3";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		System.out.println(" 파일 복사 시작합니다. ");
		try {
			fis = new FileInputStream(src);
			fos = new FileOutputStream("c://lib//copy.mp3",false); //어펜드 모드 true 2배로 복사된다. true 원본 유지

			int read = 0;
			int count = 0;

			while ((read = fis.read()) != -1) { // 읽을값 read에 집어넣고 없으면 -1
				fos.write(read);
				count++;
			}
			System.out.println("I/O 횟수 : " + count);
			System.out.println("파일 복사 완료");
		} catch (FileNotFoundException e) {
			System.out.println(src + "파일(복사원본) 확인해 주세요");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
				if (fis != null)
					fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main end");
	}
}
