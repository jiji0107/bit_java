package day13;

public class Test {

	public static void main(String[] args) {
char [] x = {'a','b','c'};
char [] y = {'h','e','l','l','o'};

System.arraycopy(x,2,y,x.length,1);
for(int inx = 0; inx < y.length ; inx++) {System.out.println( y[inx]);
	}

}
}
