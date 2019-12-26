package com.learnjava.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class MySocketClient {
	private int port;
	public static void main(String[] args) {
		MySocketClient client = new MySocketClient();
		client.createSocket(5000);
		
	}
	
	public void createSocket(int port){
		try {
			Socket socket = new Socket("127.0.0.1", port);
			OutputStream outputStream = socket.getOutputStream();
		    String message="你好  yiwangzhibujian";
		    socket.getOutputStream().write(message.getBytes("UTF-8"));
		    System.out.println("client获取服务端端口号:" + socket.getPort());
		    System.out.println("client获取本机端口号:" + socket.getLocalPort());
		    outputStream.close();
		    socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
				
	}

}
