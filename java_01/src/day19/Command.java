package day19;

@FunctionalInterface // 추상메소드 하나만 있는 메소드 펑셔널
public interface Command {
	void exec();

	default public void print() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");
	}
}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");
	}
}

class InsertCommand implements Command {

	@Override
	public void exec() {
		System.out.println("InsertCommand 수행");
	}
}

class SelectCommand implements Command {

	@Override
	public void exec() {
		System.out.println("SelectCommand 수행");
	}
}