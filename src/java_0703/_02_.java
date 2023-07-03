package java_0703;

import java.util.Iterator;
import java.util.LinkedList;

public class _02_ {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10); //저장과정에서 오토박싱 진행
		list.add(20);
		list.add(30);
		
		int n;
		for(Iterator<Integer> itr = list.iterator(); itr.hasNext();) {
			n = itr.next(); //오토 언박싱 진행
			System.out.println(n + "\t");
			
		}
		System.out.println();
	}

}
