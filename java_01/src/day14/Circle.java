package day14;


abstract class Shape implements MoveAndDraw{  //기반코드를 준것과 안준건 차이가 난다.
	 abstract double area();// 도형의 면적은 area야. 항상 public이 들어가야 한다 인터페이스일땐
}
 
interface Drawable{
	public abstract void draw() ; 
} //자바에서 뒤에 able이 붙여져 있으면 다 인터페이스 interface에는 abstract만 들어갈수 있어서 생략 가능 반대로 abstract 은 추상말고도 들어옴


interface Moveable{  //abstract만 들어감 abstract 클래스에서는 항상 abstract이라고 마킹 해야한다.
			 void move(int m);
				
}

interface MoveAndDraw extends Drawable ,Moveable {
	
}
public class Circle extends Shape implements Cloneable{ //이상황에서 Point로 상속받을거라고 결정하면 Shape 상속 못받는다.
	public Point p; //Shape를 위에서 상속받고 Point는 has a 관계 extends 뒤에는 클래스가 오고 implements 뒤에는 추상메소드가 온다. 항상 extends가 앞에 와야 한다.
	public int r; //extends는 상속 에 의미가 가능 implement는 구현의 의미가 강함
	public Circle() {}
	public Circle(Point p, int r) {
		super();
		this.p = p;
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [p=" + p + ", r=" + r + "]";
	}
	@Override
	public double area() { //부모보다 자식의 접근 지정자가 커져야한다.
		return r*r*Math.PI;
	}

	@Override
	public void draw() {
		System.out.println(getClass().getName()+"그리기");
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		result = prime * result + r;
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
		Circle other = (Circle) obj;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		if (r != other.r)
			return false;
		return true;
	}
	@Override
	public void move(int m) {
			//p.x = p.x+m; 프라이빗해서 에러 p.x는 세팅해야한다.p.x+m은 얻어와야한다. 
			p.setX(p.getX()+m);
			p.setY(p.getY()+m);
	}
	@Override
		public Circle clone() throws CloneNotSupportedException {
		Circle c = (Circle)	super.clone();
		Point p =c.p.clone(); // c1에 있는걸 복제한 주소를 다시 넣어주세요.
		c.p = p; //복제한 p 는 c.p
		return c;
		}
}

   // implement 뒤에는 ,로 인터페이스를 나열할 수 있다. 




