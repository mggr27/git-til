public class CallByTest {
	public static int m(int i) {
//	 System.out.println(i); //10
		i =99;
		return i;
	}
	public static void m(int[] arr) {
		arr[0] = 99;
	}
	public static void main(String[] args) {
		int i=10;
		int j = m(i);
		System.out.println(i); //10
		System.out.println(j); //99
		
		int[] arr = {10,20,30}; //callbyvalue 값을 전달하는방식, 직접그 값 그대로 전달
		m(arr); //인자의 자료형에 따라 메서드호출 
		//byte b=7; m(b); m(int i)메서드호출 자동형변환
		//float f=7.8F; m(f); 컴파일에러 double없고 자동형변환불가
		System.out.println(arr[0]);
		
	}
}
