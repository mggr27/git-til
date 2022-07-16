package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class KeyboardTest {

	public static void main(String[] args) {
		InputStream is = System.in; //노드스트림
//		try {
//			int readValue = is.read(); //byte단위읽기
//			System.out.println(readValue + "=" + (char)readValue );
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		Reader r = new InputStreamReader(is); //필터스트림
//		try {
//			int readValue = r.read(); //char단위로 읽기
//			System.out.println(readValue + "=" + (char)readValue);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
//		Reader r = new InputStreamReader(is); //필터스트림
//		try {
//			int readValue = -1;
//			while((readValue = r.read()) != -1) { //char단위로 읽기 콘솔스트림끝:Ctrl+z
//			System.out.println(readValue + "=" + (char)readValue);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		Reader r = new InputStreamReader(is); //필터스트림
		try {
			int readCnt = -1;
			char[] cbuf = new char[3];
			int off = 0;
			int len = cbuf.length;
			while((readCnt = r.read(cbuf, off, len)) != -1) { //char단위로 읽기 콘솔스트림끝:Ctrl+z
//				for(char c: cbuf) { //(X)
//				System.out.println(c);
				
//				for(int i=0; i<readCnt; i++) {
//					System.out.println(cbuf[i]);
//				}
//				System.out.println("---");
				
//				System.out.println(new String(cbuf,0,cbuf.length));
				System.out.println(new String(cbuf,0,readCnt));
//				System.out.println(new String(cbuf));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}