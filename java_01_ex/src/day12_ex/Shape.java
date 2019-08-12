package day12_ex;

public abstract  class Shape { //이 메소드는 아직 정의하지 않았으니, 쓰고 싶으면 너가 정의해! / 책임을 부여
	



	protected double area;
	private String name; //멤버변수

	public Shape( String name) {
		super();
		this.name = name;
	}

	public Shape() {

	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract void calculationArea();

	void print() { System.out.println(name+"의 면적은 " + area);
	}
}
