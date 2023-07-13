package snippet;
//class Circle {
//	int num;
//	double result;
//
//	public Circle() {
//	}
//	public Circle(int num) {
//		this.num = num;
//		result = Math.PI * num * num;
//	}
//	@Override
//	public String toString() {
//		return String.valueOf(result) ;
//	}
//}
class Circle{
	int rad;

	public Circle(int rad) {
		this.rad = rad;
	}
	
	public double getArea() {
		return rad*rad*Math.PI;
	}

	@Override
	public String toString() {
	
		return "원의 넓이 " + getArea() + " 반지름이 " + rad + "인 원";
	}
	
	
}

public class Java_0712 {
	
	public static void main(String[] args) {
		
		Circle circle = new Circle(10);
        System.out.println(circle); //원의 넓이는 314.1592 이고 반지름은 10 인원

	}

}
