package day17;

public class DiceGame {
	public static void main(String args[]) throws Exception {
		DiceGame game = new DiceGame();

		int result1 = game.countSameEye(10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result1);

		int result2 = game.countSameEye(-10);
		System.out.println("면의 개수가 8개인 주사위 2개를  던져서 같은 눈이 나온 횟수 : " + result2);

	}

	int countSameEye(int n) throws Exception {

		Dice dice1 = new Dice(8);
		Dice dice2 = new Dice(8);
		if (n < 0)
			throw new Exception("음수발생");
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (dice1.play() == dice2.play()) {
				count++;
			}

		}
		return count;

	}

}
