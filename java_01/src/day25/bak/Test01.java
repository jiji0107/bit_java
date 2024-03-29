package day25.bak;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test01 {
	public static void main(String[] args) {
		InetAddress ip = null;
		try {
			ip = InetAddress.getLocalHost();
			}catch(UnknownHostException e) {
				e.printStackTrace(); 
			}
			
			System.out.println("getHostName: " + ip.getHostName());
			System.out.println("getHostAdress :" + ip.getHostAddress());
			System.out.println("toString : " + ip.toString());
			System.out.println("--------------------------------------");
		
		try {
		ip = InetAddress.getLocalHost();
		ip = InetAddress.getByName("www.naver.com");
		}catch(UnknownHostException e) {
			e.printStackTrace(); 
		}
		
		System.out.println("getHostName: " + ip.getHostName());
		System.out.println("getHostAdress :" + ip.getHostAddress());
		System.out.println("toString : " + ip.toString());
	}
}
