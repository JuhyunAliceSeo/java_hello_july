package java_0703;
import java.util.ArrayList;
import java.util.List;

public class _01_Liseted {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int sum= 0; 
		
		for(int i = 1; i <= 10 ; i++) {
			list.add(i);
//			sum += i;
		}
		
		System.out.println(sum);
		
		List<String> season = new ArrayList<>();
		
		season.add("Spring");
		season.add("Summer");
		season.add("Fall");
		season.add("Winter");
		
		int seasonLength = 0;
		sum=0;
		
		for(int i = 0; i< season.size(); i++) {
			String str = season.get(i);
			sum = sum + str.length();
			System.out.println(sum);
		}
		
//		for ( String s : season) {
//			seasonLength += s.length();
//		}
		
		System.out.println(seasonLength);
		////////////////////////////////
		
		List<Integer> circleList = new ArrayList<>();
		
		circleList.add(10);
		circleList.add(20);
		circleList.add(30);
		
		double result = 0;
		
		 double totalArea = 0;
	        for (int radius : circleList) {
	            double area = calculateCircleArea(radius);
	            totalArea += area;
	        }

	        System.out.println("Total Area: " + totalArea);

	}
	 public static double calculateCircleArea(int radius) {
	        return Math.PI * radius * radius;
	 }
	 
//	 List<Circle3> circleList = new LinkedList<>();
//     
//     for (int i=1; i<=10; i++) {
//        circleList.add(new Circle3(i));
//     }
//     
//     double sum =0;
//     for (Circle3 circle3 : circleList) {
//        sum += circle3.getArea();
//        System.out.println(sum);
//    }

}
