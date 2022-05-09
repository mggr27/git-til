package inheritance;

public class Child extends Parent {
	private String c1;
	
	public Child() {}
	public Child(String c1) {
		super("자식에서설정한부모변수", 10000);
		this.c1 = c1;
	}
	
	public void cm() {
		System.out.println("자식의 기능입니다");
		System.out.println("c1=" + c1);
		pm(); //간접 접근은 가능
//		System.out.println("p1=" + p1); 자식이라도 부모의 private 직접은접근불가 상속은됨
	}
}
