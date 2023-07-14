package snippet;

class DBox<Key, Value> {
	Key k;
	Value v;

	public void set(Key s, Value num) {
		this.k = s;
		this.v = num;
	}

	@Override
	public String toString() {
		return k + " & " + v;
	}


}


//class Person {
//	String name;
//	int age;
//	
//	public Person(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		Person pObj = (Person)obj;
//		if( pObj.name.equals(this.name) && pObj.age == this.age) {
//			return true;
//		}
//		return false;
//	}
//	
//}

class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public boolean equals(Object obj) {
		Person pObj = (Person)obj;
		if (pObj.name.equals(this.name) && pObj.age == this.age) {
			return true;
		}
		return false;
	}
}

public class Java_EqualsAndWrapper {
	public static void main(String[] args) {
		Person kim = new Person("홍길동", 35);
		Person park = new Person(new String("홍길동"), 35);
		Person heo = new Person("홍길동", 34);
		if (kim.equals(park))
			System.out.println("같은 사람입니다.");
		else
			System.out.println("다른 사람입니다.");
		if (kim.equals(heo))
			System.out.println("같은 사람입니다.");
		else
			System.out.println("다른 사람입니다.");
//		=========================
//		같은사람입니다.

		DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25);
		System.out.println(box); // Apple & 25
	}

}
