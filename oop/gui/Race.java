package gui;

import java.awt.Canvas;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * 이벤트프로그램 절차
 * 1. EventSource(이벤트발생될 곳)을 결정 ex)btReady
 * 2. 이벤트 종류 결정 ex)ActionEvent
 * 3. EventHandler(이벤트 발생했을때 할일)을 작성
 *    ex) class MyHandler implements ActionListener{
 *    		public void actionPerformed(ActionEvent e){
 *    		    System.out.println("준비되었습니다");
 *    		}	
 *    	  }
 * 4. EventSource와 EventHandler를 연결
 * 	  ex)btReady.add~~~(new MyHandler());
 * @author writer
 *
 */
//class MyHandler implements ActionListener{
//	public void actionPerformed(ActionEvent e){
//	    System.out.println("준비되었습니다");
//	}	
//}
//class MyRunHandler implements ActionListener{
//	public void actionPerformed(ActionEvent e){
//    jtf.setText("달립니다");
//	}	
//}
//class MyRunHandler implements ActionListener{
//	private JTextField jtf;
//		public MyRunHandler(JTextField jtf) {
//			this.jtf = jtf;
//		}
//		public void actionPerformed(ActionEvent e){
//			jtf.setText("달립니다");
//		}
//}

//말 3마리가 달리기경주
class Horse extends Canvas implements Runnable{
	String name;
	int x = 10, y = 10;
	Horse(String name){
		this.name = name;
	}
	@Override
	public void paint(Graphics g) {
//		System.out.println("canvas의 paint x=" + x);
		g.drawString(name, x, y);
	}
//	@Override
//	public void update(Graphics g) {
//		for(int step=0; step<20; step++) {
////			System.out.println("canvas의 update");
//			x+=20;
//			super.update(g); //clear-> paint()자동호출됨
//			long millis = (long)(Math.random()*1000); //0<=r<1000
//			try {
//				Thread.sleep(millis);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
	@Override
	public void run() {
//		this.repaint();
		for(int step=0; step<20; step++) {
			x+=20;
			this.repaint();
			long millis = (long)(Math.random()*1000); //0<=r<1000
			try {
				Thread.sleep(millis);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Race {
	private JFrame jf;
	private JButton btStart, btReady;
	private JTextField jtf; //한줄입력란
	private Horse[] horses;
	
	class MyRunHandler implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			jtf.setText("달립니다");
//			for(int step=0; step<20; step++) {
//			horses[0].repaint();
//			}
//			horses[0].repaint();
//			horses[1].repaint();
//			horses[2].repaint();
			
			//스레드 시작
			for(int i=0; i<horses.length; i++) {
				new Thread(horses[i]).start();
			}
		}
	}
	
    public Race() {
		jf = new JFrame("달리기"); //액자
		btStart = new JButton("달려");
		btReady = new JButton("준비");
		jtf = new JTextField(10);
		horses = new Horse[3];
		String[] horseNames = {"태풍","화랑", "번개"};
		for(int i=0; i<horses.length; i++) {
//			horses[i] = new Horse("말" + (i+1));
			horses[i] = new Horse(horseNames[i]);
		}
		
		Container c = jf.getContentPane(); //액자뒷판
//		c.setLayout(new FlowLayout());
//		c.add(btReady);
//		c.add(btStart);
//		c.add(jtf);
		c.setLayout(new GridLayout(5,1));
		c.add(horses[0]);
		c.add(horses[1]);
		c.add(horses[2]);
		
		Panel panel = new Panel();
		panel.add(btReady);
		panel.add(btStart);
		c.add(panel);
		c.add(jtf);
		
//		MyHandler myHandler = new MyHandler();
//		btReady.addActionListener(myHandler);
		
//		btReady.addActionListener(
//				new ActionListener() { //익명클래스
//					public void actionPerformed(ActionEvent e) {
////						System.out.println("준비되었습니다");
//						jtf.setText("준비되었습니다");
//						for(Horse h: horses) {
//							h.x = 0;
//							h.repaint();
//						}
//					}
//				}
//		);
		
		//람다식
		btReady.addActionListener((ActionEvent e) ->{
			jtf.setText("준비되었습니다");
			for(Horse h: horses) {
				h.x = 0;
				h.repaint();
			}
		});
		
//		btReady.addActionListener(new ActionListener()); //인터페이스는 객체생성 못함
//		btStart.addActionListener(
//				new ActionListener() {//익명클래스
//					public void actionPerformed(ActionEvent e) {
////						System.out.println("달립니다");
//						jtf.setText("달립니다");
//					}
//				}
//		);
		btStart.addActionListener(
//				new MyRunHandler(jtf)
				new MyRunHandler() //이너클래스
		);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		jf.setSize(500, 300);
		jf.setVisible(true);
	}
	public static void main(String[] args) {
		
		new Race();

	}

}
