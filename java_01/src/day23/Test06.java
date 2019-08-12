package day23;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.Set;

public class Test06 {

	public static void main(String[] args) {
		String filename = "account.obj";
		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(filename);
			ois = new ObjectInputStream(fis);
			System.out.println(" Data Object Read ");
			Set<Account> a1 = (Set<Account>) ois.readObject();
			a1.forEach(i -> System.out.println(i));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (ois != null)
					ois.close();
				if (fis != null)
					fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
//object를 저장하고 저장된 object 읽어오는 작업