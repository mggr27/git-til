class A{
	int iv;
	static int sv;
	void m() {
		System.out.println("non-static method입니다 iv=" + this.iv);
		System.out.println("sv=" +this.sv);
		System.out.println("A.sv="+A.sv);
		sm(); //static method호출가능
	}
	static void sm() {
		System.out.println("static method입니다 sv=" +A.sv);
//		System.out.println("iv="+ this.iv);
//		System.out.println("iv="+iv);
//		m(); //this.m()
	}
}
public class StaticTest {

	public static void main(String[] args) {
		A a1, a2;
		a1 = new A();
		a2 = new A();
		a1.iv++;
		a1.sv++; 
		System.out.println(a2.iv); //0
		System.out.println(a2.sv); //1 경고
		System.out.println(A.sv); //1 권장
		
		a1.m();
//		A.m(); 안됨

		a1.sm();
		A.sm();
	}

}
