package day10;

public class Test01 {

	public static void main(String[] args) {
					System.out.println("java progRamING".equals("java progRamING"));
					System.out.println("java progRamING".equals("JAVA progRamING"));
					System.out.println("java progRamING".equalsIgnoreCase("java progRamING")); //equalsIgnoreCase 대소문자 구분X
					System.out.println("java progRamING".equalsIgnoreCase("java progRamING"));
					System.out.println("java progRamING".contains("JAVA"));
					System.out.println("java progRamING".toLowerCase().contains("JAVA"));
					System.out.println("java progRamING".toLowerCase().contains("JAVA".toLowerCase()));
					System.out.println("===========================================================");
					
	}

}
