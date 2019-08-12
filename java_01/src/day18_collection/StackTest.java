package day18_collection;

import java.util.Arrays;

public class StackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if (stack.isEmpty()) {
			System.out.println("스택이 비어있습니다.");
		}

		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}

		if (stack.isFull()) {
			System.out.println("스택이 가득 찼습니다.");
		}

		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if (num != -1)
				System.out.println(num);
		}
	}
}

class MyStack {
	int[] s = new int[10];
	int top = 0;

	public MyStack() {
		super();
	}

	public MyStack(int i) {
		if (0 <= i)
			s = new int[i]; // i크기의 배열을 생성

	}

	public void push(int i) {
		if (isFull())
			System.out.println("스택이 가득 찼습니다.");
		else
			s[top++] = i;

	}

	public boolean isFull() {
		if (top == s.length)
			return true;
		else
			return false;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return -1; // int는 리턴값이 있어야한다.
		} else {
			return s[--top];
		}
	}

	public boolean isEmpty() {
		if (top == 0)
			return true;
		else
			return false;
	}

	public int top() {
		if (isEmpty()) {
			System.out.println("스택이 비어있습니다.");
			return -1; // int는 리턴값이 있어야한다.
		} else {
			return s[top - 1];
		}
	}

	public MyStack(int[] s) {
		super();
		this.s = s;
	}

	public int[] getS() {
		return s;
	}

	public void setS(int[] s) {
		this.s = s;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(s);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyStack other = (MyStack) obj;
		if (!Arrays.equals(s, other.s))
			return false;
		return true;
	}

}
