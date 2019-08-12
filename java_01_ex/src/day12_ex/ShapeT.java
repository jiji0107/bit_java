package day12_ex;

public abstract class ShapeT {
				private String name;
				protected double area;
				
				public ShapeT() {
						this("~~~"); //아래로 넘어가서 수퍼를 가져운다
				}
				public ShapeT(String name) {
					super();
					this.name = name;
				}
				public String getName() {
					return name;
				}
				public void setName(String name) {
					this.name = name;
				}
				public abstract void calculationArea();
				public void print() {
					System.out.println(name+" 의 면적은"+area);
				}
}
