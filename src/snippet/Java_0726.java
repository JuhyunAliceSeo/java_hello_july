package snippet;

import java.util.HashSet;

class Person2{
	String s;
	int i;
	

	public Person2(String s, int i) {
		this.s = s;
		this.i =i; 
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + ((s == null) ? 0 : s.hashCode());
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
		Person2 other = (Person2) obj;
		if (i != other.i)
			return false;
		if (s == null) {
			if (other.s != null)
				return false;
		} else if (!s.equals(other.s))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return s + "(" + i + "세)" ;
	}
	
	
	
	
}

public class Java_0726 {
	public static void main(String[] args) {
        HashSet<Person2> hSet = new HashSet<Person2>();
        hSet.add(new Person2("LEE", 10));
        hSet.add(new Person2("LEE", 10));
        hSet.add(new Person2("PARK", 35));
        hSet.add(new Person2("PARK", 35));

        System.out.println("저장된 데이터 수: " + hSet.size());
        System.out.println(hSet);
        //저장된 데이터 수: 2
        //[LEE(10세), PARK(35세)]
	}
}
