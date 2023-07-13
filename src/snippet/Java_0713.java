package snippet;
class GetSum{
	int num;

	public void setNum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}
	
	public int sum(){
		int sum = 0;
		for(int i = 1; i<=num; i++) {
		 sum += i;
		}
		return sum;
	}

	
}

public class Java_0713 {
	
	public static void main(String[] args) {
		GetSum getsum = new GetSum(); // 1)객체 생성
        int num; // 2)num 변수 선언

        num = 100;

        getsum.setNum(num); // 3)getsum 객체의 setNum함수 호출, num값 50 저장

        num = getsum.sum(); // 4)getsum객체의 sum함수 호출, 1-100까지 합 구함
        System.out.println(num);

        getsum.setNum(1000);
        num = getsum.sum(); // 4)getsum객체의 sum함수 호출, 1-1000까지 합 구함
        System.out.println(num);
		
		
		for(int i = 0; i < 5; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
				
		}
		

	}
}
