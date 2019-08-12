package day23;

import java.io.Serializable;

public class Book implements Comparable<Book>, Serializable {

	String tittle;
	int pirce;

	public Book() {
	}

	public Book(String tittle, int pirce) {
		super();
		this.tittle = tittle;
		this.pirce = pirce;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public int getPirce() {
		return pirce;
	}

	public void setPirce(int pirce) {
		this.pirce = pirce;
	}

	@Override
	public String toString() {
		return "Book [tittle=" + tittle + ", pirce=" + pirce + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + pirce;
		result = prime * result + ((tittle == null) ? 0 : tittle.hashCode());
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
		Book other = (Book) obj;
		if (pirce != other.pirce)
			return false;
		if (tittle == null) {
			if (other.tittle != null)
				return false;
		} else if (!tittle.equals(other.tittle))
			return false;
		return true;
	}

	@Override
	public int compareTo(Book o) {
		// return price - o.price;
		return tittle.compareTo(o.tittle);
	}

}
