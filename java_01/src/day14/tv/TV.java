package day14.tv;

interface  TV {
	public void poweron();
	public void poweroff();
	
}

class STV implements TV{
		public void poweron() {
			System.out.println("STV on");
		}
		public void poweroff() {
			System.out.println("STV off");
		}
}
class LTV implements TV{
	public void poweron() {
		System.out.println("LTV on");
	}
	public void poweroff() {
		System.out.println("LTV off");
	}
}
class ITV implements TV{  
	public void poweron() {
		System.out.println("ITV on");
	}
	public void poweroff() {
		System.out.println("ITV off");
	}
}

