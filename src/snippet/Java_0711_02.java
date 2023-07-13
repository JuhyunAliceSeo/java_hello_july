package snippet;

//class Circle implements Shape{
//	int radi;
//
//	public Circle(int radi) {
//		this.radi = radi;
//	}
//	@Override
//	public double getArea() {
//		return radi * radi * Math.PI;
//	}
//	
//}
//
//class Rectangle implements Shape {
//	int width, height;
//
//	public Rectangle(int width, int height) {
//		this.width = width;
//		this.height = height;
//	}
//	@Override
//	public double getArea() {
//		return width * height;
//	}
//	
//}
//
//class Triangle implements Shape {
//	int width, height;
//
//	
//	public Triangle(int width, int height) {
//		this.width = width;
//		this.height = height;
//	}
//	@Override
//	public double getArea() {
//		return width * height;
//	}
//	
//}
//
//interface Shape{
//	   public double getArea();
//	}

class SPrinterDriver implements Printable{
	
	String SS = "Samsung printer";
		


	@Override
	public void print(String doc) {
		System.out.println("From "  + SS);
		System.out.println(doc);
	}
}

class LPrinterDriver implements Printable{
	
	String LG = "LG printer";

	
	@Override
	public void print(String doc) {
		System.out.println("From "  + LG);
		System.out.println(doc);
	}
}


interface Printable { // MS가 정의하고 제공한 인터페이스
    public void print(String doc);
}

public class Java_0711_02 {
	
		   public static void main(String[] args) {

//		        Shape[] shape = { new Circle(10), new Rectangle(10, 20), new Triangle(10, 20) };
//
//		        //
//		        for(Shape s: shape)
//		           System.out.println(s.getClass().getName() + " : " + s.getArea());
//		   }
		   
           String myDoc = "This is a report about...";

           // 삼성 프린터로 출력
           Printable prn = new SPrinterDriver();
           prn.print(myDoc);
           System.out.println();

           // LG 프린터로 출력
           prn = new LPrinterDriver();
           prn.print(myDoc);

		   }
}
