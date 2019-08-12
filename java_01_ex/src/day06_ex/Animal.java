package day06_ex;
public class Animal {
	//데이터(변수)+기능(메소드)
	boolean live; 
	int age; 	
    String name;
	public boolean isLive() {
		return live;
	}
	public void setLive(boolean live) {
		this.live = live;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
  public void display() {
	System.out.printf("[생존:%10s,이름:%10s,나이:%10s]%n", this.live, this.name, this.age);
	return;  
  }
}
// public static void main(String[] args) {
//Animall a =new Animal();
//a.setName("큰뿔소");
//a.setName(3);
//a.print();
//a.name = "~~~" instance varable 반드시 주소가 있어야한다.
//a.print(); instance method
