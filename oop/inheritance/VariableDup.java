package inheritance;
class PP{
	int ppv;
	String sv;
}
class P extends PP{
	int pv;
}
class C extends P{
	int cv;
	int sv;
	void c() {
		System.out.println(super.sv); //null
		System.out.println(super.pv); //0
	}
}
public class VariableDup {
	
	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.sv); //0 부모와 자식의 변수 같을때 자식이 우선, 부모변수 쓰려면 super.
//		System.out.println(c.super.sv);//없는표현 안됨 
		c.c();

	}

}
