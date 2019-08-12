package day25_net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

import javax.xml.ws.soap.Addressing;

public class Test02 {

	public static void main(String[] args) {
		String adress = "https://www.naver.com/index.html";
		String line = null;
		URL url = null;
		BufferedReader br = null;

		
		try {
			url = new URL(adress);
			br = new BufferedReader(new InputStreamReader(url.openStream()));// 저 사이트를 열거다 , load관이 연결 되었다. ,바이트스트림 였던게
															// reader 바뀐다.

			while ((line = br.readLine()) != null) { //line이 읽은 내용을 가지고 있다. 이거 밖을 벗어나면 안된다. 한줄읽고 line에 저장하면 이전에 읽던건 없어진다.
				System.out.println(line); // naver index 읽어와라
				
			}
			//flush는 즉각즉각 나갈때는 꼭 해줘야한다.
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

	

		      
		
	}


