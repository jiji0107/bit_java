package day24_Thread;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("main start");

		MyStack stack = new MyStack();
		Push job1 = new Push(stack);
		pop job2 = new pop(stack); // 같은 스택을 쓴다.

		Thread push = new Thread(job1, "push");
		Thread pop = new Thread(job2, "pop");

		push.start();
		pop.start();
		System.out.println("main end");

	}

}

class pop implements Runnable {
	MyStack stack;

	public pop() {
	}

	public pop(MyStack stack) {
		super();
		this.stack = stack;
	}

	@Override
	public void run() {
		for (int i = 0;; i++) {
			stack.pop();

		}
	}

}

class Push implements Runnable {
	MyStack stack;

	public Push() {
	}

	public Push(MyStack stack) {
		super();
		this.stack = stack;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			stack.push(i);
			try {
				Thread.sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
				e.printStackTrace(); // runnable한 push
			}
		}
	}

}
