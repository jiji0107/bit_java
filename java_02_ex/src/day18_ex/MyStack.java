package day18_ex;



public class MyStack<E> { //제네릭
		E[] stack;
		int top = 0;
// 데이터가 비어있다.

	MyStack() {
		stack = (E[]) new Object[10];
	}

	MyStack(int size) {
		if (size < 0)
			stack = (E[]) new Object[10];
		else
			stack = (E[]) new Object[size];

	}

	public boolean isEmpty() {
		return top == 0 ? true : false;
	}

	public boolean isFull() {
		return top == stack.length ? true : false;

	}

	public void push(E data) {
		if (isFull()) {
			System.out.println("stack is full...");
			return;
		}
		stack[top] = data;
		top++;

	}

	public E top() {
		if (isEmpty())
			return null;
		return stack[top - 1];
	}
	public E pop() {
		if(isEmpty()) return null;
		return stack[--top];
	}
}
