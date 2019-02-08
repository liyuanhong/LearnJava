package com.learnjava.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

/*
 * java字符流学习 Reader
 * 参考地址：https://www.cnblogs.com/liyuanhong/articles/10356722.html
 */
public class LearnReader {
	public static void main(String[] args) {
		StringReaderTest test1 = new StringReaderTest();
		test1.doTest();
		FileReaderTest test2 = new FileReaderTest();
		test2.doTest();
		
	}
}

class StringReaderTest{
	public void doTest() {
		StringReader sRe = new StringReader("哈哈哈哈哈哈");
		
		//BufferedReader属于缓冲流，增加缓冲功能，避免频繁读写硬盘
		BufferedReader re = new BufferedReader(sRe);
		try {
			System.out.println(re.read());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

class FileReaderTest{
	public void doTest() {
		String curDir = System.getProperty("user.dir");
		//通过fileReader读取文件
		FileReader sRe1 = null;
		
		try {
			sRe1 = new FileReader(curDir + "/test/test.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		//BufferedReader属于缓冲流，增加缓冲功能，避免频繁读写硬盘
		BufferedReader re1 = new BufferedReader(sRe1);
		try {
			String txt = null;
			do {
				txt = re1.readLine();
				System.out.println(txt);
			}while(txt != null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

