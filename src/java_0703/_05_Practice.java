package java_0703;
import java.util.HashSet;
import java.util.Set;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {return String.valueOf(age);}
	
	@Override
    public int hashCode() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {//이걸해야 방이 2개만 생김
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

}

public class _05_Practice {
	public static void main(String[] args) {
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("PARK", 35));
		hSet.add(new Person("PARK", 35));
		
		System.out.println("저장된 데이터 수 : " + hSet.size());
		//저장된 데이터수 : 2
	}

}
//class Person{
//	   private String name;
//	   private int age;
//	   
//	   public Person(String name , int age) {
//	      this.name = name;
//	      this.age = age;      
//	   }
//	   
//	   @Override
//	   public int hashCode() {      
//	      return age;
//	   }
//	   
//	   
//	   @Override
//	   public boolean equals(Object obj) {
//	      
//	      Person person = (Person) obj;
//	      
//	      if( (this.name.equals(person.name)) && (this.age == person.age))
//	         return true;
//	      
//	      
//	      return false;
//	   }
//	   
//	   @Override
//	   public String toString() {
//	      return name + "(" + age + "세)";
//	   }
//	}
//	public class MainClass {
//	   public static void main(String[] args) {
//	      HashSet<Person> hSet = new HashSet<Person>();
//	      hSet.add(new Person("LEE", 10));
//	      hSet.add(new Person("LEE", 10));
//	      hSet.add(new Person("PARK", 35));
//	      hSet.add(new Person("PARK", 35));
//
//	      System.out.println("저장된 데이터 수: " + hSet.size());
//	      System.out.println(hSet);