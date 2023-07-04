package java_0704;

import java.util.Deque;
import java.util.HashMap;
import java.util.ArrayDeque;

public class _01_Stack {

	public static void main(String[] args) {
		Deque<String> deq = new ArrayDeque<>();
		
		//앞으로 넣고
		deq.offerFirst("1. Box");
		deq.offerFirst("2. Toy");
		deq.offerFirst("3. Robot");
		
		//앞으로 꺼내기
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		System.out.println(deq.pollFirst());
		
		System.out.println("-------------------------");
		 //////////////////////////////
		
		HashMap<Integer, String> map = new HashMap<>();
		
		/////////////Key-Value 기반 데이터 저장
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");
		
		//데이터 탐색
		System.out.println("23번 : " + map.get(23));
		System.out.println("37번 : " + map.get(37));
		System.out.println("45번 : " + map.get(45));
		
		//데이터 삭제
		map.remove(37);
		
		//데이터 삭제 확인
		System.out.println("37번: " + map.get(37));
		

	}

}
