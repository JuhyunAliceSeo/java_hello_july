package snippet;
interface Printable {
	void print(String doc);
}

class SPrinterDriver implements Printable{

	String s = "Samsung printer";

	@Override
	public void print(String doc) {
		System.out.println("From " + s);
		System.out.println(doc);
	}
	
}


class LPrinterDriver implements Printable{

	String l = "LG printer";
	@Override
	public void print(String doc) {
		System.out.println("From " + l);
		System.out.println(doc);
		
	}
	
}

public class Java_0718 {
	
	interface Printable { // MS가 정의하고 제공한 인터페이스
        public void print(String doc);
}

        //SPrinterDriver 와 LPrinterDriver를 만드시오
        public static void main(String[] args) {
                String myDoc = "This is a report about...";

                // 삼성 프린터로 출력
                SPrinterDriver prn = new SPrinterDriver();
                prn.print(myDoc);
                System.out.println();

                // LG 프린터로 출력
                LPrinterDriver prn1 = new LPrinterDriver();
                prn1.print(myDoc);
        }

	}

