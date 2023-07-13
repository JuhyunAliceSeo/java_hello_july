package snippet;

public class Java_0711 {
	public static void main(String[] args) {
		int sum =0 ;
		for( int i = 3 ; i <= 3 ; i ++) {
			for( int j = 1 ; j <= 9 ; j ++) {
				System.out.println( i + " * " + j + " = " + i * j );
			}
		}
		int num = 1;
		
		 while (true) {
	            if (num % 11 == 0 && num % 7 == 0) {
	                System.out.println("첫 번째로 11의 배수이자 7의 배수인 숫자: " + num);
	                break;
	            }
	            num++;
		}
	

}
}
