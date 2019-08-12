package day10;

public class Point { // x,y좌표 표현
				int x;
				int y;
				
				public Point() {
					super();
				}
				public Point(int x, int y) {
					super();
					x = x;
					this.y = y;
				}
				public int getX() {
					return x;
				}
				public void setX(int x) {
					x = x;
				}
				public int getY() {
					return y;
				}
				public void setY(int y) {
					this.y = y;
				}
				
				public void print() {
					System.out.printf("point[%d,%d]%n",x,y);
				}
						
	}


