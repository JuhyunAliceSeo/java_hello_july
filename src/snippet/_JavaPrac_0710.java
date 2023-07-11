package snippet;

public class _JavaPrac_0710 {

	public static void main(String[] args) {
		int kor, math, eng, total;
		double avg;
		
		kor = 90;
		math = 45;
		eng = 70;
		total = kor + math + eng;
		avg = total / 3;
		
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("=============================");
		System.out.println("총점: " + total);
		System.out.println("평균 : " + avg);
		
		if(avg>=90.0) {
			System.out.println("성적 : 수");
		}else if(avg>=80.0) {
			System.out.println("성적 : 우");
		}else if(avg>=80.0) {
			System.out.println("성적 : 미");
		}else if(avg>=80.0) {
			System.out.println("성적 : 양");
		}else{System.out.println("성적 : 가");}
		
		int num1, num2, num3;
		int max;
		
		
		num1 = -6;
		num2 = 10;
		num3 = 1;
		max = num1;
				
		if(max < num2) {
			max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		
		System.out.println(max);
		
		int month = 3;
		
		switch(month){
			case 12: case 1: case 2: case 3:
			System.out.println("겨울입니다.");
			break;
			case 4: case 5: case 6: 
				System.out.println("봄입니다.");
				break;
			case 7: case 8:
				System.out.println("여름입니다.");
				break;
			default:
				System.out.println("가을입니다");

		}
		

	}

	private static void Switch(int month) {
		// TODO Auto-generated method stub
		
	}

}
