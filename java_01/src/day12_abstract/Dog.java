package day12_abstract;

public class Dog extends Animal { //Animal이 가지고 있는 추상 메소드를 구현(오버라이딩)하지 않아서
	String kind;
	String name;
	public Dog() {
		super("강아지");
	}
	public Dog(String kind, String name) {
		super("강아지");
		this.kind= kind;
		this.name =name;
	}
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void breath() {
		System.out.println(super.kind+" => 폐로 숨쉬기");		
	}
	@Override
	public String toString() {
		return "Dog [kind=" + kind + ", name=" + name + "]";
	}
}
