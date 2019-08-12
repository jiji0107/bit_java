package day23;

import java.util.concurrent.ThreadFactory;

public class Test09 {
	public static void main(String[] args) {
		// System.out.println(Thread.MAX_PRIORITY); //10
		// System.out.println(Thread.MIN_PRIORITY); //1
		// System.out.println(Thread.NORM_PRIORITY); //5
		System.out.println("Main Start");
		
		
		System.out.println(Thread.currentThread()); // 우선순위 5

		// 스레드 생성 실행 대기큐에 넣기
		T1 t1 = new T1(); // 내가 thread 이면서 runable한 객체
		T2 t2 = new T2();

		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join(); //t1하고 t2 쓰레드들이 완전히 수행될때 까지 나머지는 아무일도 못한다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("홀수합  + 짝수합 = " +(t1.sum+t2.sum));
		System.out.println("Main End");

	}
}

class T1 extends Thread { 
	int sum = 0;

	public void run() {
		for (int i = 1; i < 100; i = i + 2) {
			sum += i;
			System.out.print(Thread.currentThread() + ""); // 현재 cpu에 대한 thread정보 출력
			System.out.println("1~" + i + "홀수합 :" + sum);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();  //job1에 런메소드에 집어넣은것
			}
		}
	}

}

class T2 extends Thread {
	int sum = 0;

	public void run() {
		for (int i = 0; i < 100; i = i + 2) {
			sum += i;
			System.out.print(Thread.currentThread() + "");
			System.out.println("0~" + i + "짝수합 :" + sum);
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				e.printStackTrace();  //job1에 런메소드에 집어넣은것
			}
		
		}
	}

}
