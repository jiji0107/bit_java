package day16;

public class Test03 {

	public static void main(String[] args) {
		System.out.println("main start");
		String msg = null;
		//msg = "dgdgdgd";
		try {
			if(msg != null ) {
				System.out.println(msg.charAt(3)); // 한라인에서 여러개의 문제가 발생할수 있다.
				int num = Integer.parseInt(msg);
			}
		} catch (NullPointerException e) {
			System.out.println("예외발생 :" + e.getMessage()); // null
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("예외발생 :" + e.getMessage()); //index
		}catch (NumberFormatException e) {
			System.out.println("예외발생 : 정수로 입력해주세요" ); 
		}catch (Exception e) {
			System.out.println("예외발생 :" + e.getMessage()); // null
		}finally {
			System.out.println("finally {자원 반납 코드}");
		}

		System.out.println("main end");
	}

}
