package java_0704;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class _08_SimpleWriter {

	public static void main(String[] args) {
		try(Writer out = new FileWriter("data.txt")){
			out.write('A'); //문자저장
			out.write('한');
		}
		catch(IOException e) {
			e.printStackTrace();
		}

		
		try(Writer out = new FileWriter("data.txt")){
			for(char c = 'A'; c <= 'Z'; c++) {
				out.write(c);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
