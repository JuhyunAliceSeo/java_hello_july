package java_0703;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class _03_set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Toy");
		set.add("Box"); //같은게 있어서 이거 없어지고 밑에게 살아남음
		set.add("Robot");
		set.add("Box"); 
		System.out.println("인스턴스의 수 : " + set.size());
		
		//반복자를 이용한 전체출력
		for(Iterator<String> itr = set.iterator(); itr.hasNext(); )
			System.out.println(itr.next() + '\t');
		System.out.println();		
	
		//for-each문을 이용한 전체 출력
		for(String s : set)
			System.out.println(s + '\t');
		System.out.println(); //box가 먼저 나옴
	 
	}
}
