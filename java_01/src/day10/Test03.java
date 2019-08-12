package day10;

public class Test03 {

	public static void main(String[] args) {
		// int hour;
		// int minute;
		// int second;
		// 따로 관리하면 안되니까 class가 필요하다.
		Time t1 = new Time(13, 20, 20);
	}

}

class Time {
	int hour;
	int minute;
	int second;

	public Time() {
		// super(); //상속 .super부모 super를 지워도 밑에 계속 있다.
	}

	public Time(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {

		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
}