package day25.bak;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpServer {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		try {
			serversocket = new ServerSocket(7777);
			System.out.println("서버가 준비 되었습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		}
		while (true) {
			try {
				System.out.println("Client 요청을 기다립니다.");
				// serversocket.accept(); //client를 기다리는 문장
				Socket socket = serversocket.accept(); // client를 가지고 있게된다.
				//System.out.println(socket.getInetAddress() + "와 연결중입니다."); // socket에 나한테 요청한 것의 ip주소

				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

				String name = br.readLine(); //읽은 다음에 쓸것이다.
				System.out.println("Hello~~~~" + name + " 님 \n"); //name 은 클라이언츠 이름
				
				bw.write("Hello~~~~" + name + "\n"); //name 은 클라이언츠 이름
				bw.flush();
				String msg = null;
				while((msg = br.readLine()) != null) {
					bw.write(name + " : " +msg +"\n");
					bw.flush();
				}
				
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {

			}
		}
	}

}
