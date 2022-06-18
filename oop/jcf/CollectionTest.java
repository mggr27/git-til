package jcf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;

class A{
	int i;
	A(int i){
		this.i = i;
	}
	@Override //source - generate hashCode() and equals()
	public int hashCode() {
		return Objects.hash(i);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		return i == other.i;
	}
}

public class CollectionTest {
	public static void test(Collection c) {
		c.add(new String("one")); //add()의 매개변수타입은 Object이다. String이 Object로 업캐스팅
		c.add(new Integer(2)); //Integer가 Object로 업캐스팅
		c.add(3); //AutoBoxing : 컴파일시에 c.add(new Integer(3));로 바뀜 Integer가 Object로 업캐스팅
		c.add(2); //AutoBoxing
//		c.add(new A(5));
		c.add(new A(5));
		
		System.out.println("자료수 : "+ c.size());
		System.out.println(c); // c.toString()자동호출됨
	}
	public static void test(Map m) {
		m.put("one", "first");
		m.put(new Integer(2), "second");
		m.put(3, "third");
		m.put(2, "fourth");
		System.out.println("자료수:"+m.size());
		System.out.println(m); //m.toString()자동호출됨 // {2=fourth, 3=third, one=first}
	}
	public static void main(String[] args) {
//		List list = new ArrayList(); //List는 인터페이스 하위클래스인 ArrayList는 일반클래스
//		test(list);
		test(new ArrayList()); //[one, 2, 3, 2]
		test(new HashSet()); //[2, 3, one] 중복허용안할때 쓰면적합
//		test(new HashMap()); //Collection계열아님 상속관계가 아님
		
		
	}

}
