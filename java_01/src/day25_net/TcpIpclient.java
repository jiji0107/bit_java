package day25_net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpIpclient {
	public static void main(String[] args) {
		String serverIp = "127.0.0.1";
		// String serverIp = "192.168.0.135";
		BufferedReader br = null;
		BufferedWriter bw = null;
		Socket socket = null;
		Scanner keyboard = null;
		try {
			System.out.println(serverIp + "연결 시도 할께요..");
			socket = new Socket(serverIp, 7777);
			System.out.println("서버와 연결이 되었습니다.");

			br = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 내가 연결된 소켓으로 부터 읽을 거야
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

			new clientTread(br).start(); // 읽는 작업을 할 준비가 되었다.
			
			keyboard = new Scanner(System.in);
			System.out.println("이름을 입력하세요...");
			bw.write(keyboard.nextLine() + "\n");
			bw.flush();
		//	System.out.println(br.readLine()); 스레드가 받을거다.
			
			while (true) {
				System.out.println("메세지를 입력하세요");
				String msg = keyboard.nextLine();
				bw.write(msg + "\n");
				bw.flush();
		//	System.out.println(br.readLine()); 스레드가 받을거다.
				if (msg.equals("q"))
					break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (socket != null)
					socket.close();
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}

class clientTread extends Thread {
	BufferedReader br =null;
	
	public clientTread(BufferedReader br) {
		this.br = br;
	}

	@Override
	public void run() {
		String msg = null;
		try {
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
			//	System.out.println(br.readLine()); 
		} catch (Exception e) {
		}
	}
}
