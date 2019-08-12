package day23;

import java.io.RandomAccessFile;

public class Test07 {
	public static void main(String[] args) throws Exception {

		RandomAccessFile raf = new RandomAccessFile("rand.dat", "rw");

		String msg = "Hello, RandomAccessFile...";
		String result = null;

		raf.writeBytes(msg);
		raf.seek(0); //커서를 앞으로 보낸
		while (true) {
			result = raf.readLine();
			if (result == null)
				break; // null이 아닐때까지 계속 읽어
			System.out.println(result);
			// randomAccessFile 읽고 쓰기가 다 가능해서 읽고 쓰기 다함
		}
		System.out.println("====================================");

		raf.seek(raf.length());
		msg = "\n hi.. java test.. io test...";
		raf.writeBytes(msg);
		raf.seek(7);
		while (true) {
			result = raf.readLine();
			if (result == null)
				break; 
			System.out.println(result);
		}
		System.out.println("===================");
		raf.close();
	}
	
}

