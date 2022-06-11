import java.util.Date;
/**
  기본형은 메서드가 없다
  int i = 34;
  i.toString(); (X)
  
  기본형과 참조형은 형변환불가
  String s = i; (X) 
  String s = (String)i; (X)
  
  기본형->String으로 바꿔주는 메서드를 활용
    String s = String.valueOf(i); i는 숫자 삼십사, s는 문자열 "34"
  String->기본형으로 바꿔주는 메서드를 활용
    int j = Integer.parseInt(s); s는 문자열 "34", j는 숫자 삼십사
  
  기본형->참조형으로 바꿔주는 방법
    Integer inte = new Integer(i);  
  참조형->기본형으로 바꿔주는 방법  
    int k = inte.intValue();
    
 * @author 
 *
 */
public class WrapperTest {
	public static void main(String[] args) {
		int i = 34;
//		System.out.println(i.toString()); //기본형은 기능이 없다
//		System.out.println(i.a); //기본형은 상태값도 없다
		Integer inte = new Integer(i);
		inte.toString();
		System.out.println(Integer.MIN_VALUE); //기본형int의 최소값
		System.out.println(Integer.MAX_VALUE); //기본형int의 최대값
		
		Object[] arr = new Object[5];
		arr[0] = new String("문자열");
		arr[1] = new Date();
//		arr[2] = new Integer(i); //기본형과 참조형은 형변환 안됨 ex) arr[2] = i; (x)
		arr[2] = i; //AutoBoxing : 컴파일러에의해 arr[2] = new Integer(i);로 바뀜
		
//		arr[3] = new Character('A');
		arr[3] = 'A'; //AutoBoxing :arr[3] = new Character('A');로 바뀜
		
//		int j = arr[2]; //참조형->기본형 형변환 안됨
		int j = (Integer)arr[2]; //AutoUnBoxing : 컴파일러에의해 
		                        //Integer inte2 = (Integer)arr[2];
		                       //int j = inte2.intValue();로 바뀜
		int k = (int)arr[2]; //권장안함

	}

}
