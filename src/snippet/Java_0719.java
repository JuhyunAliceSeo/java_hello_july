package snippet;
class Member1{
	String s;
	public Member1(String s) {
		this.s = s;
	};

	public String getS() {
		return s;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		return false;
        }
        Member1 other = (Member1) obj;
        return obj.equals(other.getS());
	}
	

	
}

public class Java_0719 {

	public static void main(String[] args) {
		Member1 obj1 = new Member1("Black");
		Member1 obj2 = new Member1("Black");
		Member1 obj3 = new Member1("White");

		System.out.println(obj1.equals(obj2)); // true가 출력
		System.out.println(obj1.equals(obj3)); // false가 출력

	}

}
