package java_0703;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _07_Test {
	 public static void main(String[] args) {
		 List <Integer> list = new ArrayList<>();
		 int sum = 0;
		 
		 for(int i = 0; i <= 10; i++) {
			 sum += i;}
		 
		 System.out.println(sum);
		 /////////////////////////
		 List <Integer> lotto = new ArrayList<>();

		 while(lotto.size() != 6) {
			 int randomNumber = (int) (Math.random() *45) + 1;
	            lotto.add(randomNumber); 
		 }
		 
		 System.out.println(lotto);
		 /////////////////////////////////
		 
		 List <Integer> circle = new ArrayList<>();
		 
		 circle.add(10);
		 circle.add(20);
		 circle.add(30);
		 
	 
		 double result = 0;
			
		 double totalArea = 0;
	        for (int radius : circle) {
	            double area = calculateCircleArea(radius);
	            totalArea += area;
	        }

	        System.out.println("Total Area: " + totalArea);

	}
	 public static double calculateCircleArea(int radius) {
	        return Math.PI * radius * radius;
	 }
		 
		
}
