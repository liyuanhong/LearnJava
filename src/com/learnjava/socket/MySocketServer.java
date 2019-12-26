package com.learnjava.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocketServer {
	private int port;
	
	public static void main(String[] args) {
		MySocketServer server = new MySocketServer();
		server.createSocket(5000);
	}
	
	public void createSocket(int port){
		try {
			ServerSocket server = new ServerSocket(port);
			Socket socket = server.accept();
			InputStream inputStream = socket.getInputStream();
			byte[] data = new byte[4096];
			int len;
			StringBuilder sb = new StringBuilder();
			while((len = inputStream.read(data)) != -1){
				sb.append(new String(data, 0, len, "UTF-8"));
			}
			System.out.println("get message from client: " + sb);
			System.out.println("server获取客户端端口号:" + socket.getPort());
			System.out.println("server获取本机端口号:" + socket.getLocalPort());
			inputStream.close();
			socket.close();
			server.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setPort(int port){
		this.port = port;
	}
}
