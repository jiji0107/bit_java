package day23;

public class Test08 {
	public static void main(String[] args) {
		// System.out.println(Thread.MAX_PRIORITY); //10
		// System.out.println(Thread.MIN_PRIORITY); //1
		// System.out.println(Thread.NORM_PRIORITY); //5
		System.out.println("Main Start");
		// try {
		// Thread.sleep(5);
		// } catch (InterruptedException e) {
		// e.printStackTrace();
		// 
		Thread.yield(); // 기다리는게 없으니까 무시
		System.out.println(Thread.currentThread()); // 우선순위 5
		// 스레드 생성 실행 대기큐에 넣기
		Job1 job1 = new Job1();
		Thread t1 = new Thread(job1, "job1");

		T2 job2 = new T2();
		Thread t2 = new Thread(job2, "job2");

		t1.start();
		t2.start();

		//join메소드 쓰려면 쓰레드 주소 필요
		
		try {
			t1.join();
			t2.join(); //t1하고 t2 쓰레드들이 완전히 수행될때 까지 나머지는 아무일도 못한다.
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("홀수합 + 짝수합 = " + (job1.sum + job2.sum)); //기다려랴 위에 t1.join 이랑 t2.join 끝날때까지
		System.out.println("Main End");

	}
}

class Job1 implements Runnable {
	int sum = 0;

	public void run() {
		for (int i = 1; i < 100; i = i + 2) {
			sum += i;
			System.out.print(Thread.currentThread() + ""); // 현재 cpu에 대한 thread정보 출력
			System.out.println("1~" + i + "홀수합 :" + sum);
			Thread.yield();

		}
	}

}

class Job2 implements Runnable {
	int sum = 0;

	public void run() {
		for (int i = 0; i < 100; i = i + 2) {
			sum += i;
			System.out.print(Thread.currentThread() + ""); // 현재 cpu에 대한 thread정보 출력
			System.out.println("0~" + i + "짝수합 :" + sum);
			Thread.yield();
		}
	}

}
