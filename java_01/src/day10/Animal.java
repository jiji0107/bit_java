package day10;

public class Animal {
		protected String kind = "동물의 종류"; //디폴트가 동물의 종류 same패키지에서 까지만 protected는 어느 패키지에서도 상속을 받을 수 있다.
		
		public Animal() { //기본생성자
			}
		

		public Animal(String kind) { //파라미터 하나짜리 생성자  string 뒤에 도그가 들어가서 맨위에 동물의 종류 앞에 있는거 안에 dog가 들어간다.
			super();
			this.kind = kind;
		}

		public String getKind() {
			return kind;
		}

		public void setKind(String kind) {
			this.kind = kind;
		}
		public void breath() {
			System.out.printf(kind +" :폐로 숨쉬기 ~~~ %n");
		}
		public void print() {
			System.out.printf("Animal kind : %s ",kind);
		}
		
}
