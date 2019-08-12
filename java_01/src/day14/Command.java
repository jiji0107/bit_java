package day14;

public interface Command { //추상메소드 다형성 가장 많이 사용하는 중요한 기술 // 사용하는 가이드를 가지고 잘 사용해 굳이 내부를 알려고 하지말아라 .기본 사용법을 
	//숙지하고 사용해 기본틀 같은 거
	public void exec();
	default public void check() {  //interface는 추상메소드 이외에 다른메소드를 추가할수 있다. 마치 static처럼 내부적으로 관리  추상메소드에서 바디부에 default메소드
		//인터페이스 안에는 디폴트 함수가 있을수 있다.
	System.out.println("Command check() 함수");
	}
	}         
class DeleteCommand implements Command{
	@Override
	public void exec() {
		System.out.println("Delete(삭제) 수행");
	}
	public void check() {
	System.out.println("DeleteCommand check() 함수");
	}
}
class InsertCommand implements Command{
	@Override
	public void exec() {
		System.out.println("Insert(등록) 수행");
	}
}
class UpdateCommand implements Command{
	@Override
	public void exec() {
		System.out.println("Update(수정) 수행");
	}
}
class ListCommand implements Command{
	@Override
	public void exec() {
		System.out.println("List(목록) 수행");
	}
}


