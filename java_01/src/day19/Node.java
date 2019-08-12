package day19;

public class Node <E>{
	//String data; //string을 모아 관리할건데 next가 다음 동작을 가지고 있어
	//Node next; // next에 null이 들어 있으면 그다음 동작이 없다.
	E data;
	Node<E> next;
//	
	public Node(E data, Node<E> next) {
		super();
		this.data = data;
		this.next = next;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
	
}
