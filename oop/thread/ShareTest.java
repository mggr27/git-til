package thread;

class Share{
	int i;
	Share(int i){
		this.i = i;
	}
	public void push() {
		synchronized(this) {
			notify();
			System.out.print("before push:i=" + i);
			i++;
			System.out.println(", after push:i=" + i);
		}
	}
	public void pop() {
		synchronized(this) {
			if(i==0) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.print("before pop:i=" + i);
			i--;
			System.out.println(", after pop:i=" + i);
		}
	}
}
class Push extends Thread{
	Share s;
	Push(Share s){
		this.s = s;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			s.push();
		}
	}
}
class Pop extends Thread{
	Share s;
	Pop(Share s){
		this.s = s;
	}
	public void run() {
		for(int i=0; i<10; i++) {
			s.pop();
		}
	}
}
public class ShareTest {
	public static void main(String[] args) {
		Share s = new Share(7);
//		s.i = 7;
		Push push = new Push(s);
		Pop pop = new Pop(s);
//		Pop pop = new Pop();
//		pop.s = s;
		
		pop.start();
		push.start();
	}

}
