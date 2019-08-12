package day12_abstract;

public class Test01 {

	public static void main(String[] args) {
		Animal[] a = { new Dog("시베리안허스키", "케리"), new Fish("구피", "물고기"), new Fish("Fish", "구피") };

		for (Animal data : a) {
			System.out.println(data.toString()); // data하고 .찍으면 자동으로 data.toString이 된다.
			data.breath();
		}
		
		
		//시험문제였던것
		System.out.println(ssss("java programing"));
	}
	
		public static String ssss(String d) { //string 넘겨받아서 역순으로 바꿔서 리턴하겠습니다.
			String result ="";
			for(int i = d.length()-1;i>=0;i--) {
				result += d.charAt(i);
			}
			return result;
		}
	}

