package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void test(int i) {
		if(i !=0) {
		int j = 99%i; //i가 0인 경우 ArithmeticException발생
		System.out.println("99를 "+i+"로 나눈 나머지값은 "+j);
		}else {
			System.out.println("0으로는 나눌 수 없습니다");
		}
	}
//	public static void test(Object obj) {
//		try {
//		String str = obj.toString();
//		System.out.println(str);
//		}catch(NullPointerException e) {
//			System.out.println("obj가 null입니다");
//		}
//	}
	public static void test(Object obj) throws NullPointerException{
		String str = obj.toString();
		System.out.println(str);
	}	
	public static void main(String[] args) {
		test(new Object());
		try {
			test(null);
		}catch(NullPointerException e) {
			System.out.println("인자가 null입니다");
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요:");
		int i = 1;
		FileInputStream fis = null;
		try {
			i = sc.nextInt(); //숫자가 입력되지 않으면 (A입력) InputMismatchException발생
			fis = new FileInputStream("a.txt"); //파일자원과의 연결, 컴파일러가 감지함
			int readValue = fis.read(); //파일내용 1byte읽기
			System.out.println("파일의 1바이트내용= "+ readValue);
		} catch (FileNotFoundException e) {
			System.out.println("a.txt파일이 없습니다");
		} catch (IOException e) { //다중캐치
		
		} catch (InputMismatchException e) {
			System.out.println("숫자로 입력하세요. 숫자가 아니어서 1로 대신합니다");
		} finally {
			System.out.println("finally블럭입니다");
			if(fis !=null) { //if안에 try오는게 퍼포먼스가 더빠름
				try {
					fis.close(); //파일자원과의 연결해제
				}catch (IOException e) {
				}
			} 
		}
		test(i);
		System.out.println("끝");
		
		
	}
}
