package day19;



public class Employee implements Comparable <Employee>{
	int number;
	String name;
	String dept;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public int hashCode() { // Number만 체크하면 number만 가지고 비교할래
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [number=" + number + ", name=" + name + ", dept=" + dept + "]";
	}

	public Employee() {
		super();
	}

	public Employee(int number, String name, String dept) {
		super();
		this.number = number;
		this.name = name;
		this.dept = dept;

	}

	@Override
	public int compareTo(Employee o) {
		return number - o.number ; // 그냥 정렬이 되어서 관리가 되어진다.
	}

}
