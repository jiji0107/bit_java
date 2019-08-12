package day10;
//같은 패키지에 있으니까 import 사라진다. 다른 패키지로 가면 import가 있어야한다.

// Animal을 상속 받는다.
public class Dog extends Animal{	//class의 선언부
		private String kind = "동물의 종류";
		private String name = "강아지 이름";
	
		public Dog() {	
			super("강아지과"); //super() 앞의 문장과 차이점은 뒤에꺼는 Animal기본 생성자를 호출하는 문장
		}
		public Dog( String kind, String name) {
			super("강아지과");
			this.kind = kind; //나의 영역에 있는 kind Animal에 있는 kind는 super를 써준다.
			this.name = name;
		}
		public Dog(String superkind, String kind, String name) { //생성자
			super(superkind); //이걸 안써도 부모영역에 갔다와서 밑에 부모영역 데이터를 초기화
			//super.kind = superkind;
			this.kind = kind;
			this.name = name;
		}
		public String getKind() {
			return kind;
		}
		public void setKind(String kind) {
			this.kind = kind;
		}
		public String getName() {
			return name;
		}
	
		public void setName(String name) {
			this.name = name;
		}
		public void dogprint() {
			System.out.printf("[%s:%s:%s]%n",super.kind,this.kind,this.name);
		}
		public String getsuperkind() { //super.kind를 가지고 올것이다.
			return super.kind;
			
		}
		@Override
			public void print() {
			//super.print(); // 부모가 가진 메소드에 내가 가진 아래꺼도  추가
				//System.out.printf(" : %s %n",kind,name);
				this.dogprint();
			}
		

}
