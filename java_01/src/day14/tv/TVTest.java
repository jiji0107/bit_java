package day14.tv;

public class TVTest {

	public static void main(String[] args) {
				
	//	STV user = new STV(); //리모콘이 부모타입이 되면 STV의 바인딩 되는 자식들은 다된다. 로커텔링 
		    play(new STV());
		    play(new LTV());
		    play(new ITV());
		// new LTV(); //하이코이즌 하나의 클래스에 연관있는거만 포함시켜서 묶어주어야한다. 서로 연관 없으면 클래스 분리하기
	}
	public static void play(TV tv){ //play 시켜주는 메소드 난 STV타입을 받을거야
			tv.poweron();
			tv.poweroff(); // 다형성 
}
}