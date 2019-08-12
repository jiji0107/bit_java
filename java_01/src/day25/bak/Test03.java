package day25.bak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;

public class Test03 {

	public static void main(String[] args) {
		String adress = "https://www.naver.com/index.html";
		String line = null;
		URL  url = null;
		BufferedReader br = null;
		FileWriter fw =null;
		BufferedWriter bw = null;
		try {
			url = new URL(adress);
			br = new BufferedReader( new InputStreamReader (url.openStream()));//저 사이트를 열거다 , load관이 연결 되었다. ,바이트스트림 였던게 reader 바뀐다. 
			fw = new FileWriter("naver.html");
			bw = new BufferedWriter(fw);	
			
			while ((line =br.readLine()) != null) {
				System.out.println(line); //naver index 읽어와라
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) br.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}


	}


