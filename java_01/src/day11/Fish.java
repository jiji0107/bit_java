package day11;

import day10.Animal;

public class Fish extends Animal {
		
		private	String name;
     

		public Fish() {}

		public Fish(String name) {
			super("물고기");
			this.name = name;
			
		} 

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public void fishPrint() { 
			System.out.printf("[%s : %s] %n",kind,name);
			
		}
		
		//메소드 오버라이딩 => 부모로 부터 물려 받은 기능을 나에 상황에 알맞게 재정의를 한다. 부모의 선언부 그대로
		@Override //이 메소드가 override가 잘 되었는지 체크해준다. 에노테이션기반이다.
		public void breath() {
				System.out.printf(kind +" : 아가미로 숨쉬기~~~ %n"); //breath를 아가미로 다시 바꾸었다.
		}
					@Override
					public void print() {
					//super.print(); //부모가 가진 메소드 호출
					//System.out.printf("  %s : %n ",kind, name);
					this.fishPrint(); //내가 가진 메소드 호출
					}
}

