package day15;
//추상메소드가 하나밖에 없는 인터페이스를 FunctionalInterface라고 한다. 이런것들이 람다로 표현 가능한 대상
public interface command {
	void exec(); 
	default public void check() { //바디부 가지고 싶으면 default
		System.out.println("check ~~~~~");
	}
}
class DeleteCommand implements command {
	@Override
	public void exec() {
			System.out.println("DelteCommand 수행");		
	}
	
}
class UpdateCommand implements command{
	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");
	}
	
}