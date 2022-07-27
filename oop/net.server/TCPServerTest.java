package net.server;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;

public class TCPServerTest {
	public static void main(String[] args) {
		int port = 5432;
		ServerSocket ss = null;
		Socket s = null;
		DataInputStream dis = null;
		try {
			//1. port열기
			ss = new ServerSocket(port);
			
			//2. 클라이언트기다리기, 소켓생성
			s = ss.accept();
			dis = new DataInputStream(s.getInputStream());
			String receiveData = null;
			while(!(receiveData = dis.readUTF()).equals("quit")) {
				System.out.println("클라이언트가 보내준 내용:" + receiveData);
			}
			
//			receiveData = dis.readUTF();
//			System.out.println("클라이언트가 보내준 내용:" + receiveData);
			
		} catch (BindException e) {
			System.out.println(port+"포트가 이미 사용중입니다.");
		} catch (SocketException e) {
//			System.out.println("소켓이 끊겼습니다. 클라이언트장애인가 확인하세요");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("클라이언트와 연결을 종료합니다");
		}
	}

}
