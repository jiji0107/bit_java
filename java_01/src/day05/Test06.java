package day05;

public class Test06 {

	public static void main(String[] args) {

		int [] [] t1 = new int[4][]; // 4개가 다 null
		t1[0] = new int[4];
		System.out.println(t1[0]);
		System.out.println(t1[0][0]);
		
		int[][] t2 = {
				{1,2,3,4,5},
				{44,66,77,99,55,66},
				{11,22}
				};
			for(int i=0;i<t2.length ; i++) {
				for(int j=0; j<t2[i].length ; j++) {
		System.out.print(t2[i][j]+" ");
			}
		System.out.println();
	}
  char[][] s = {
		  { 'X','X','X','X','X','X','X','X'},
		  { 'X','X','X','X','X','X','X','X'},
		  { 'X','X','X','O','X','X','X','X'},
		  { 'X','X','X','X','X','X','X','X'},
		  { 'X','X','X','X','X','X','X','X'},
		  { 'X','X','X','X','X','X','X','X'},
		  
  };
  for(int i =0; i<s.length ; i++) {
	  for(int j=0; j<s[i].length ; j++) {
		  if(s[i][j]== 'O') {
			  System.out.printf("[%2d행 %2d열]%n",i,j);
			  
		  }
	  }
     
  }

}
}