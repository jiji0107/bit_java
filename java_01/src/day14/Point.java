package day14;

public class Point implements Cloneable{ //implements Cloneable을 꼭 써줘야 사용이 가능하다.
	
			private int x;
			private int y;
			
			public Point() {
				super();
			}
			
			public Point(int x, int y) {
				super();
				this.x = x;
				this.y = y;
			}
			public int getX() {
				return x;
			}
			public void setX(int x) {
				this.x = x;
			}
			public int getY() {
				return y;
			}
			public void setY(int y) {
				this.y = y;
			}
			@Override
			public String toString() {
				return "Point [x=" + x + ", y=" + y + "]";
			}

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + x;
				result = prime * result + y;
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
				Point other = (Point) obj;
				if (x != other.x)
					return false;
				if (y != other.y)
					return false;
				return true;
			}
@Override
public Point clone() throws CloneNotSupportedException { //CloneNotSupportedException 복제하다가 문제발생할수 있어 protected 에서 public으로 감
		return (Point) super.clone();
	}			
}

