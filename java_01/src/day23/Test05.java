package day23;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.security.auth.login.AccountException;

public class Test05 {

	public static void main(String[] args) {
		String filename = "account.obj";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;

		try {
			fos = new FileOutputStream(filename); // 파일을 보낼거니까
			oos = new ObjectOutputStream(fos);

			Set<Account> set = new HashSet<Account>(); //set에 담고 set을 저장
			
			
			Account a = new Account("2019-001", "홍길동", 100, "1234"); //set은 들어간 순서대로 안나온다. 순서를 정하고 싶으면 sort명령을 써야한다.
			Account b = new Account("2019-001", "박길동", 1000, "1111");
			set.add(a);
			set.add(b);
			set.add(a);
			set.add(new Account("2019-004", "최길동", 1000, "9999"));
			
			
			oos.writeObject(set);
			oos.flush();
			System.out.println("파일에 저장되었습니다.");

		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (oos != null)
					oos.close();
				if (fos != null)
					fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}

class Account extends Object implements Serializable {
	String number;
	String name;
	int money;
	transient String pw; // Stream을 통과하면 안돼

	public Account() {
	}

	public Account(String number, String name, int money, String pw) {
		super();
		this.number = number;
		this.name = name;
		this.money = money;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", name=" + name + ", money=" + money + ", pw=" + pw + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((pw == null) ? 0 : pw.hashCode());
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
		Account other = (Account) obj;
		if (money != other.money)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (pw == null) {
			if (other.pw != null)
				return false;
		} else if (!pw.equals(other.pw))
			return false;
		return true;
	}

}
