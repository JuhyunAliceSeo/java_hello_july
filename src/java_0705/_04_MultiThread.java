package java_0705;


public class _04_MultiThread {

	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		Thread thread1 = new Thread(myThread1);
		MyThread2 myThread2 = new MyThread2();
		
		thread1.start();
		myThread2.start();
	}

}

class MyThread1 implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("%s", new String("-"));
		}
	}
}

//1. 쓰레드란 프로그램 안에 또다른 프로그램
//2. 쓰레드의 실행 시점은 알수가 없음 - 전적으로 OS의 스케쥴링 알고리즘에 따라 움직이므로
//3. 프로그램은 기본적으로 쓰레드를 기준으로 컨텍스트 스위칭 됨
//4. 싱글 프로세스는 기본적으로 main 쓰레드가 있다

//class MyThread1 extends Thread {
//public void run() { //main
////	String name = Tread.currentTread().get();
//	System.out.println(getName());
//	
//	for(int i=0;i<3;i++) {
//		System.out.printf("%s", new String("-"));
//	}
//}//run()
//}

class MyThread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.printf("%s", new String("|"));
		}
	}
}
