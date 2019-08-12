package day07;

public class P139 {
    public static int increase(int n){ //static은 new를 생성안해도 올라가있다.
    		++n;
    		return n;
    }
    public static void main(String[] args) {
    	int var1 = 100;	
    	
    	int var2 = P139.increase(var1); //P139는 클래스이름
    	
    	System.out.println(var1);
    	
    }
		
	}


