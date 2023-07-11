package snippet;

class Accumulator {

	public static int sum = 0;

	public static void add(int i) {
		sum += i;
	}

	public static void showResult() {
		System.out.println("sum : " + sum);

	}
}

class TV {
	private int size;

	public TV(int size) {
		this.size = size;
	}

	public int getSize() {
		   return size;
	}

}

class ColorTV extends TV{
	public int color;
	
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
		
	}
	

	public void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
		
	}
	
}
	

public class Java_0710 {

	public static void main(String[] args) {
		
		 for (int i = 0; i <= 10; i++) {
             Accumulator.add(i); } // 전달되는 값을 모두 누적

		 Accumulator.showResult(); // 최종 누적 결과를 출력
		 
		 ColorTV myTV = new ColorTV(32, 1024);
		   myTV.printProperty();


	}

}
