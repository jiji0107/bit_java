package day25_net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class TcpIpServer {

	public static void main(String[] args) {
		ServerSocket serversocket = null;
		// BufferedReader br = null;
		// BufferedWriter bw = null;
		List<BufferedWriter> clientList = new ArrayList<BufferedWriter>();
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
				// System.out.println(socket.getInetAddress() + "와 연결중입니다."); // socket에 나한테 요청한
				// 것의 ip주소
				new ServerThread(socket, clientList).start();

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				// 이곳에서 하면 객체 생성 하자마자 닫아버린다.
			}
		}
	}

}

class ServerThread extends Thread {
	BufferedReader br = null;
	BufferedWriter bw = null;
	Socket socket = null; // 스레드로 넘어갈 자원
	String name = null; // 이름을 기억할 변수
	List<BufferedWriter> clientList = null;

	public ServerThread(Socket socket, List<BufferedWriter> clientList) {
		this.socket = socket;
		this.clientList = clientList;
		try {
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			clientList.add(bw); // bw를 arraylist에등록

			name = br.readLine(); // 이름 한번만 읽을것이다.
			// bw.write("Hello~~~~" + name + "\n"); // name 은 클라이언츠 이름 클라이언츠 쪽에서는 이런 메세지를
			// 받아본다.
			// bw.flush();
			broadcast(" 님이 입장하셨습니다.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}

	@Override
	public void run() {
		String msg = null;
		try {
			while ((msg = br.readLine()) != null) {
				broadcast(msg);
				if (msg.equals("q")) {
					broadcast(" 님이 퇴장하셨습니다.");
				}
			}
		} catch (Exception e) {

		} finally {
			try {
				if (br != null)
					br.close();
				if (bw != null) {
					clientList.remove(bw);
					bw.close();
				}
				if (socket != null)
					socket.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

	private synchronized void broadcast(String msg) { // 동기화 처리를 하지않으면 메세지의 순서가 엉켜버린다.
		clientList.forEach(bw -> {
			try {
				bw.write(name + " : " + msg + "\n");
				bw.flush();
			} catch (Exception e) {
		//		e.printStackTrace();
			}
		});

	}
}
