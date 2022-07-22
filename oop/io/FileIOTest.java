package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOTest {
	public static void readNWriteByChar() {
		/*
		 * resource: a.txt
		 * node stream: FileReader
		 */
		String fileName = "a.txt";
		FileReader fr = null;
		
		/*
		 * dest: acopy1.txt
		 * node stream: FileWriter
		 */
		String copyFileName = "acopy1.txt";
		FileWriter fw = null;
		try {
			fr = new FileReader(fileName);
			fw = new FileWriter(copyFileName);
			int readValue = -1;
			while((readValue = fr.read()) != -1) {
				fw.write(readValue);
//				fw.flush();
			}
//			fw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fr !=null) {
				try {
					fr.close();
				}catch(IOException e){
				}
			}
			if(fw !=null) {
				try {
					fw.close(); //flush(); + 연결끊기
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
		
	public static void readNWriteByByte() {
		/* 입력
		 * resource : a.txt파일
		 * node stream : FileInputStream
		 */
		String fileName = "a.txt"; //".\\a.txt";와 같음 \\일반문자로 판단,이스케이프특수문자대신
                		  //"D:\\244\\MySE\\oop\\a.txt"; 절대경로
		                  //"..\\..\\a.txt"; //상대경로 .현재경로 ..상위경로
//		System.out.println(filename);
		FileInputStream fis = null;
		/* 출력
		 * dest: acopy.txt
		 * node stream: FileOutputStream
		 */
		String copyFileName = "acopy.txt";
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(fileName); //파일자원과의 연결
//			fos = new FileOutputStream(copyFileName); //파일목적지와의 연결. 파일이 만들어짐
			fos = new FileOutputStream(copyFileName, true); //파일이 존재하면 파일의 끝에 이어붙임
			int readValue = -1;
			while((readValue = fis.read()) !=-1) {
//				System.out.println((char)readValue);
				fos.write(readValue);
			}
		} catch (FileNotFoundException e) {//자식예외가 먼저 그담에 상위
			e.printStackTrace();
			System.out.println("a.txt파일이 없습니다");
//			a.txt파일 만들기
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) { //main에서 throws하지않기 무용지물
//		readNWriteByByte();
		readNWriteByChar();
	}

}
