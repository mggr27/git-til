package net.client;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPClientTest {
	public static void main(String[] args) {
		String serverIP = "127.0.0.1";
		int serverPORT = 5432;
		Socket s = null;
		DataOutputStream dos = null;
		Scanner sc = new Scanner(System.in);
		try {
			s = new Socket(serverIP, serverPORT);
			dos = new DataOutputStream(s.getOutputStream());
			//1.for 2.while 3.do-while
			String sendData = null;
			
//			while(!(sendData = sc.nextLine()).equals("quit")) {
//				dos.writeUTF(sendData);
//			}
			
//			while(true) {
//				sendData = sc.nextLine();
//				dos.writeUTF(sendData);
//				if(sendData.equals("quit")) {
//					break;
//				}
//			}
			
			do {
				sendData = sc.nextLine();
				dos.writeUTF(sendData);
			}while(!sendData.equals("quit"));
			
//			String sendData = "Hello";
//			dos.writeUTF(sendData);
//			dos.writeUTF(sendData);
		} catch (UnknownHostException e) {
//			e.printStackTrace();
			System.out.println("IP가 잘못되었거나 호스트명이 잘못되었습니다");
		} catch(ConnectException e) {
			System.out.println("서버와의 연결이 실패되었습니다");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
