package day07;

public class Calc {
	//class 변수 왜냐하면 class name으로 접근하니까
	static int data=0; 
	
	//static method를 class method라고 불림
	 public static long add(int a, int b) { //static 처리하면 메모리에 뜬다 뉴 안해도 
		 System.out.println(Calc.data); //static은 다른메뉴에 떠서 안된다. static을 빼면 접근 가능
		 //System.out.println(this.data); //이건 static을 안쓰고 long만 썻을때
		 System.out.println(Math.random());
		 return a+b;
	 }
     public static long sub(int a, int b) {
	    return a - b;
}
    public static long multi(int a, int b ) {
	    return a*b;
}
    public static long divide(int a, int b ) {
    	if(b==0) return 0;
    	return a/b; //0이 아닐때만 a/b를 하겠다.
    }
    
}
