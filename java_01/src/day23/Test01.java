package day23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test01 {

	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in); // 키보드로부터 들어는inputstream을 reader로 컨버팅 데이터를 차타임으로 바꾸어주는 역할
		BufferedReader br = new BufferedReader(ir);

		String s = null;
		try {
			while ((s = br.readLine()) != null) { //null이 아닌동안 한줄씩 읽는다
				System.out.println("keyboard input data => " + s);
			}
		} catch (Exception e) {

		} finally {
			try {
				if (br != null)
					br.close();
				if (ir != null)
					ir.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}