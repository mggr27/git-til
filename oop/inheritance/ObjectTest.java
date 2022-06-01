package inheritance;
/**
 * 자바 최상위 클래스는 java.lang.Object클래스이다
 * hashCode(), toString(), equals()
 * @author writer
 *
 */
class A{ //class A extends Object{로 컴파일시 바뀐다
	int i;
	A(int i){
		this.i = i;
	}
	void print() {
		System.out.println("멤버변수i값은 "+ i + "입니다");
	}
	public String toString() {
		return "멤버변수i값은 " + i + "입니다";
	}
	/**
	 * 현재객체의 i값과 매개변수객체의 i값이 같으면 true반환, 그 외에는 false반환
	 */
	@Override
	public boolean equals(Object obj) { //A타입 obj안됨 오버라이딩규칙 타입맞춰야
		if(obj instanceof A) {
			A a = (A)obj; //다운캐스팅 자식객체가 부모타입으로 업캐스팅된 후에만 자식타입으로 다운캐스팅가능
		                 //부모객체가 자식타입으로 다운캐스팅 불가능. ClassCastException실행시 발생
			if(this.i == a.i) {
				return true;
			}
		}
		return false;
	}
}
public class ObjectTest {
	public static void toStringTest(Object o) {
		System.out.println(o.toString());
//		System.out.println(obj1.equals(obj2));
	}
	public static void equalsTest(Object obj1, Object obj2) {
		System.out.println(obj1.equals(obj2)); //==과 같음 같은메모리를 참조하는가
	}

	public static void main(String[] args) {
		A a1, a2;
		a1 = new A(3); //i를 3으로 초기화
		a2 = new A(3);
		a1.print(); //멤버변수 i값은 3입니다
		a2.print(); //멤버변수 i값은 3입니다
		
		equalsTest(a1,a2); //false
		
//		System.out.println(a1.toString()); //멤버변수i값은 3입니다
//		System.out.println(a2.toString()); //멤버변수i값은 3입니다
		toStringTest(a1); //업캐스팅
		toStringTest(a2);
		
		Object o1, o2, o3;
		o1 = new Object();
		o2 = new Object();
		o3 = o1; //대입
		System.out.println(o1.hashCode()); //366712642
		System.out.println(o2.hashCode()); //1829164700
		System.out.println(o3.hashCode()); //366712642
		
		System.out.println("---equals재정의테스트---");
		equalsTest(a1, a2); //false 각 객체의 인스턴스변수값이 같으면 true, 다르면 false
		equalsTest(o1, o2); //false 각 객체가 같은메모리이면 true, 다른메모리이면 false
		equalsTest(o1, o3); //true
		equalsTest(o1, a1); //false 각 객체의 자료형이 다르면 false
		equalsTest(a1, o1); //false 각 객체의 자료형이 다르면 false
		
//		System.out.println(o1.toString()); //java.lang.Object@15db9742 
//		System.out.println(o2.toString()); //java.lang.Object@6d06d69c
//		System.out.println(o3.toString()); //java.lang.Object@15db9742
		toStringTest(o1);
		toStringTest(o2);
		toStringTest(o3);
		
		System.out.println(o1.equals(o2)); //false
		System.out.println(o1.equals(o3)); //true
	}
}
