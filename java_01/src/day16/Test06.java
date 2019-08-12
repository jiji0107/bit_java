package day16;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test06 {

	public static void main(String[] args) {
		System.out.println("main start");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c://lib//sample.txt"); //절대위치를 기준으로 잡아주는게 좋음! 어떤상황이든 정확하니까 예외 발생하면 e.getMessage()로감
			System.out.println("파일 준비 완료 ~~~");
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("sample.txt 파일을 확인해 주세요");
		}finally {
			try {
				if(fis != null){
				fis.close(); // c://에서 실패하면 이리로 온다. 
				fis = null;
				}
			System.out.println("자원반답 ok");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("main end");
	}

}
