package java_0704;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Scanner;

public class _02_HashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		 
		   // Key-Value 기반 데이터 저장
		   map.put(45, "Brown");
		   map.put(37, "James");
		   map.put(23, "Martin");

		   // 데이터 탐색
		   System.out.println("23번: " + map.get(23));
		   System.out.println("37번: " + map.get(37));
		   System.out.println("45번: " + map.get(45));
		   System.out.println();

		   // 데이터 삭제
		   map.remove(37);

		   // 데이터 삭제 확인
		   System.out.println("37번: " + map.get(37));
		   
		   ////////////////////////////////////////////
		   
		   // Key만 담고 있는 컬렉션 인스턴스 생성
		   Set<Integer> ks = map.keySet();

		   // 전체 Key 출력 (for-each문 기반)
		   for(Integer n : ks)
		      System.out.print(n.toString() + '\t');
		   System.out.println();

		   // 전체 Value 출력 (for-each문 기반)
		   for(Integer n : ks)
		      System.out.print(map.get(n).toString() + '\t');
		   System.out.println();

		   // 전체 Value 출력 (반복자 기반)
		   for(Iterator<Integer> itr = ks.iterator(); itr.hasNext(); )
		      System.out.print(map.get(itr.next()) + '\t');
		   System.out.println();
		   /////////////////////////////////////////////////////
		   
//		   Scanner scanner = new Scanner(System.in);// Scanner 객체를 생성하여 사용자의 입력을 받을 준비
//
//	        int maxNumber = Integer.MIN_VALUE;//maxNumber 변수를 초기화
//	        // maxNumber는 입력된 숫자 중 가장 큰 수를 저장하는 변수로, 초기값으로 Integer.MIN_VALUE를 설정
//	        // 따라서 int maxNumber = Integer.MIN_VALUE;는 maxNumber 변수를 -2,147,483,648로 초기화하는 것을 의미.
//	        // 이렇게 초기화된 maxNumber 변수는 이후 입력된 숫자와 비교하면서 가장 큰 수를 추적
//	        int inputNumber;
//
//	        System.out.println("양의 정수를 입력하세요 (-1을 입력하면 종료):"); 
//
//	        while (true) { //루프를 통해 사용자로부터 입력
//	            inputNumber = scanner.nextInt(); //사용자로부터 정수를 입력(inputNumber)
//
//	            if (inputNumber == -1) { //-1 넣는순간 끝남
//	                break;
//	            }
//
//	            if (inputNumber > maxNumber) { //입력된 값이 maxNumber보다 크다면 maxNumber를 업데이트
//	                maxNumber = inputNumber;
//	            }
//	        }
//
//	        if (maxNumber != Integer.MIN_VALUE) { //maxNumber가 초기값인지 확인 , 초기값이 아니라면 입력된 숫자가 존재하므로 가장 큰 수를 출력
//	            System.out.print("가장 큰 수: " + maxNumber);
//	        } else {
//	            System.out.println("입력된 숫자가 없습니다.");
//	        }
//
//	        scanner.close();
//	        
	        
	        //////////////////////////////////////
//	        Scanner scanner1 = new Scanner(System.in);
//	        
//	        int maxNum = 0;
//	        int inputNum ;
//	        
//	        while(true) {
//	        	inputNum = scanner1.nextInt();
//	        	
//	        	if(inputNum == -1) {
//	        		break;
//	        	}
//	        	if ( inputNum > maxNum ) { 
//	        		maxNum = inputNum;
//	        	}
//	        }
//	        if(maxNum !=0) {
//	        	System.out.println("가장큰수 : " + maxNum);
//	        }else {
//	            System.out.println("입력된 숫자가 없습니다.");
//	        }
//	        
//	       scanner1.close();
//	    
	        
		   List<Integer> list = new LinkedList<>();
	       Scanner sc1 = new Scanner(System.in);
	       
	       System.out.println("정수(-1이 입력될 때까지)>>");
	       
	       while(true) {        
	          
	          try {
	              int num = sc1.nextInt(); //7 9 10
	              
	              if(num == -1)
	                 break;
	              
	              list.add(num);
	         } catch (Exception e) {
	            System.out.println("잘못된 입력입니다. 다시 넣어 주세요");
	             sc1 = new Scanner(System.in);
	            continue;
	         }

	       }
	       
	       //큰값 구하기
	       
	       int max = 0;
	       for (int num : list) {
	         if(num > max)
	            max = num;
	      }
	       
	       System.out.println("가장 큰수는" + max);
	       
	       System.out.println(list);
	}
}
