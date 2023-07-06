package java_0706;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class _02_URLConEx {

	  public _02_URLConEx() {
	      
	      String code = null;
	      System.out.println("웹 주소를 입력 하세요.");
	      Scanner scanner = new Scanner(System.in);
	      String address = scanner.next();
	      
	      try {
	         URL url = new URL(address);
	         URLConnection con = url.openConnection();
	         BufferedReader webData = new BufferedReader(new InputStreamReader(con.getInputStream()));
	         FileWriter fw = new FileWriter("C:\\javalec\\workspace\\file.html", false);
	         
	         while ((code = webData.readLine()) != null) {
	            System.out.println(code);
	            fw.write(code);
	         }
	         System.out.println("The End");
	         
	         fw.close();
	         webData.close();
	         
	      } catch (Exception e) {
	         e.printStackTrace();
	      } 
	   }

	  public static void main(String[] args) {
		  new _02_URLConEx();
	  }
}
