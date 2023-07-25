package snippet;

//class Member1{
//	   private String color;
//
//	   public Member(String color) {
//	      this.color = color;
//	   }
//
//	   @Override
//	   public boolean equals(Object obj) {
//	      Member1 objMem = (Member1)obj;
//	      String color = objMem.color;
//	      boolean stringTOF = this.color.equals(color);
//	      return stringTOF;
//	   }
//	   
//	}

class Person1{
	private String s;
	private int age;
	
	public Person1(String s, Integer age) {
		this.s = s;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		Person1 objPer = (Person1)obj; //obj를 Person1으로 강제 형변환 시켜야함
		String s = objPer.s; //objPer.s는 Person1의 s이다
        int age = objPer.age; //objPer.age는 Person1의 age이다
		
		if(this.s.equals(s) && this.age == age) 
			//int는 참조형이 아니라서 메소드가 없어서 equals가아닌 숫자로 ==으로 비교함
			// Person1 s와 objPer의 s가 같고 둘의 age가 같으면 true반환
		return true;
		else
			return false;
		
		
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person1 other = (Person1) obj;
//		if (age != other.age)
//			return false;
//		if (s == null) {
//			if (other.s != null)
//				return false;
//		} else if (!s.equals(other.s))
//			return false;
//		return true;
	}
	
	
}

public class equals {

	public static void main(String[] args) {
		Person1 kim = new Person1(new String("홍길동"),35);
		Person1 park = new Person1(new String("홍길동"),35);
		Person1 heo = new Person1(new String("홍길동"),34);
		        
		if(kim.equals(park))
		        System.out.println("같은 사람입니다.");
		else
		        System.out.println("다른 사람입니다.");
		if(kim.equals(heo))
		        System.out.println("같은 사람입니다.");
		else
		        System.out.println("다른 사람입니다.");

	}
//	Member1 obj1 = new Member1(new String("Black"));
//    Member1 obj2 = new Member1(new String("Black"));
//    Member1 obj3 = new Member1(new String("White"));
//
//    System.out.println(obj1.equals(obj2)); // true가 출력
//    System.out.println(obj1.equals(obj3)); // false가 출력      

}
