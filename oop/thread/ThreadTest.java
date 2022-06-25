package thread;

import java.text.SimpleDateFormat;
import java.util.Date;

class First extends Thread{
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println(Thread.currentThread().getName() + ":i="+i);
		}
	}
}
class Second implements Runnable{
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			Date dt = new Date();
//			System.out.println(dt);
			String formatStr = sdf.format(dt);
//			System.out.println(formatStr);
			System.out.println(Thread.currentThread().getName() +":현재시간="+formatStr);
			
			long millis = 1000L;
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace(); //예외종류, 예외내용, 예외발생위치가 모두 출력됨
				//e.getMessage() //예외내용만 반환
			}
		}
	}
}
public class ThreadTest {

	public static void main(String[] args) {
		Thread ct = Thread.currentThread();
		String ctName = ct.getName();
		System.out.println("현재 사용중인 스레드이름: "+ctName);
		
		First one = new First();
		First two = new First();
		//one.run(); //main스레드에서 run()가 호출됨
		one.start(); //Thread-0
		two.start(); //Thread-1
		
		Second second = new Second();
		//second.start(); //Runnable인터페이스에 start메서드없음

		Thread three = new Thread(second);
		Thread four = new Thread(second);
		three.start(); //스레드시작 //Thread-2
		four.start(); //Thread-3
		
		System.out.println("끝");

	}

}
