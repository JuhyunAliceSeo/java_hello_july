package snippet;

class TV1{
	String s;
	int year;
	int inch;
	
	public TV1() {
	}

	public TV1(String s, int i, int j) {
		this.s = s;
		this.inch=i;
		this.year=j;
	}

	public void show() {
		System.out.println( s +" 에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
	
}

class ColorTV1 extends TV1{
	private int size;
	private int i;
	
	   public ColorTV1(int i, int j) {
		this.i = i;
		this.size = j;
	}
	public void TV (int size) { this.size = size; }
	   public int getSize() { return size; }

	public void printProperty() {
		System.out.println( i + "인치 " + size + "컬러");
	}
	
}

public class Java_0714 {
	
	public static void main(String[] args) {


	
		   ColorTV1 myTV = new ColorTV1(32, 1024);
		   myTV.printProperty();
		
		//32인치 1024컬러
	}

}
