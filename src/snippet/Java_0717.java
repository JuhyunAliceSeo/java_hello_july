package snippet;

class Shape {
	
	public Shape() {
	
	}
	public double getArea() {
		return 0 ;
	}
	
}

class Circle1 extends Shape{
	int num;
	
	public Circle1(int num) {
		this.num = num;
	}
	
	@Override
	public double getArea() {
			return Math.PI * num * num;
		}
	
}

class Rectangle extends Shape{
	int hight;
	int width;
	
	public Rectangle(int hight, int width) {
		this.hight = hight;
		this.width = width;
	}
	
	@Override
	public double getArea() {
			return hight * width;
		}
	
}

public class Java_0717 {

	public static void main(String[] args) {
		 Shape[] shape = { new Circle1(10), new Rectangle(10, 20) };

         //
         double area = 0;

         for (Shape s : shape) {
                 area = area + s.getArea();
         }

         System.out.println(area);
	}

}
