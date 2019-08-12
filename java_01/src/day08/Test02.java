package day08;

public class Test02 {

	public static void main(String[] args) {
			//student[] students = new student[100]; // 이제 student 100개를 만들어서 관리할거야
		student[] students = {
			  new student("김길동", 2019001, 90 , 99, 71),
			  new student("홍길동", 2019001, 90 , 79, 72),
			  new student("강길동", 2019001, 90 , 99, 73),
			  new student("최길동", 2019001, 69 , 99, 77),
			  new student("박길동", 2019001, 59 , 99, 71)
			//setGradeprocess();
			};
		for(student data :students) { 
			if(data.getGrade()=='B') //data.getGrade는 차라 equals 못씀
			data.print();
		}
	
	}
}

class student{
		private String name;
		private int number;
		private int kor;
		private int eng;
		private int math;
		private char grade; //생성자 함수가 아니다.
		
		public student() { }
		public student(String name, int number, int kor, int eng, int math) {
					this.name = name;
					this.number = number;
					//this.kor = kor;
					this.setkor(kor);
					//this.eng= eng;
					this.setEng(eng);
					//this.math = math;
					this.setMath(math);
					setGradeprocess();
		}
		public student(String data) {
			
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getNumber() {
			return number;
		}
		public void setNumber(int number) {
			this.number = number;
		}
		public int getKor() {
			return kor;
		}
		
			public void setkor(int kor) {
				if(!checkJumsu(kor)) return;
				this.kor = kor; 
		   }
		public int getEng() {
			return eng;
		}
		public void setEng(int eng) {
			  if(!checkJumsu(eng)) return;
			  this.eng = eng; 
		}
		public int getMath() {
			return math;
		}
		public void setMath(int math) {
				if(!checkJumsu(math)) return;
				this.math = math; 
		}
		public char getGrade() {
			this.setGradeprocess();
			return grade;
		}
		
		private void setGradeprocess() { //private 내부적으로 막아놨다. 내부에서만 쓸 수있고 외부에선 안보인다.
			double avg = (kor+eng+math)/3.;
			this.grade = avg>=90? 'A':(avg>=80?'B':(avg>=70?'C':(avg>=60?'D':'F')));
		}
		public void print() {
			System.out.printf("%s,%.2f,%s %n",name,(kor+eng+math)/3.,this.getGrade());
		}
	private boolean checkJumsu(int num) {
		boolean flag = true;
		
		if(!(num>=0 && num<100)) {
		System.out.println(num+ "=>점수가 유효하지 않습니다.");
		return  false;
}
		return flag;
     
	}
	
}