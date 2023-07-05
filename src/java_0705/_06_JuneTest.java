package java_0705;

import java.util.HashSet;
import java.util.Set;

class Shape {
    public double getArea() {}
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}



public class _06_JuneTest {

	public static void main(String[] args) {
		for(int i=2; i < 10; i++) {
			for(int j=1; j <10; j++) {
				System.out.println(i + " * " + j + " = " + i * j );
			}
			System.out.println();
		}
		
		Set <Integer> lottoNum = new HashSet<>();
		
		while(lottoNum.size() != 6){
			 int randomNumber = (int) (Math.random() *45) + 1;
	            lottoNum.add(randomNumber);
		}
		System.out.println(lottoNum);
		
		///////////////////////////
		
	      Shape[] shapes = { new Circle(10), new Rectangle(10, 20) };
	        double area = 0;

	        for (Shape shape : shapes) {
	            area += shape.getArea();
	        }

	        System.out.println(area);

	}
}
