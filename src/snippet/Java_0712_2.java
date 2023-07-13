package snippet;
class Member{
	String str;

	public Member(String str) {
		this.str = str;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((str == null) ? 0 : str.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		Member other = (Member) obj;
		if (str == null) {
			if (other.str != null)
				return false;
		} else if (!str.equals(other.str))
			return false;
		return true;
	}
	
//	   String color;
//	   
//	   public Member(String color) {
//	      this.color = color;
//	   }
//
//	   @Override
//	   public boolean equals(Object obj) {
//	      Member obj2 = (Member)obj;
//	      String obj2Color = obj2.color;
//	      boolean answer = color.equals(obj2Color);
//	      return answer;
//	   }
	
	
	
}

public class Java_0712_2 {
	
	public static void main(String[] args) {
		Member obj1 = new Member("Black");
		Member obj2 = new Member("Black");
		Member obj3 = new Member("White");
		
		System.out.println(obj1.equals(obj2)); // true가 출력
		System.out.println(obj1.equals(obj3));  // false가 출력
	}

}
