package java_0704;

import java.util.HashSet;
import java.util.TreeMap;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
	@Override
	public String toString() { 
		return name + "(" + age + "세)"; 
	}
	
	@Override
    public int hashCode() {
        return age;
    }

    @Override
    public boolean equals(Object obj) {
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

public class _04_Practice {
	public static void main(String[] args) {
		HashSet<Person> hSet = new HashSet<Person>();
        hSet.add(new Person("LEE", 10));
        hSet.add(new Person("LEE", 10));
        hSet.add(new Person("PARK", 35));
        hSet.add(new Person("PARK", 35));

        System.out.println("저장된 데이터 수: " + hSet.size());
        for (Person person : hSet) {
            System.out.println(person);
        }
        //////////////////////
        
       
                TreeMap<Integer, String> map = new TreeMap<>();
                map.put(45, "Brown");
                map.put(37, "James");
                map.put(23, "Martin");

                for (String value : map.values()) {
                    System.out.println(value);
           
        }
	}
}