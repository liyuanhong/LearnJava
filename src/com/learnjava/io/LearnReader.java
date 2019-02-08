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

/*
 * 字符流与字节流的区别：
 * 设备上的数据无论是图片或者视频，文字，它们都以二进制存储的。二进制的最终都是以一个8位为数据单元进行体现，所以计算机中的最小数据单元就是字节。
 * 意味着，字节流可以处理设备上的所有数据，所以字节流一样可以处理字符数据。
 * 结论：只要是处理纯文本数据，就优先考虑使用字符流。 除此之外都使用字节流。
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
			System.out.println(re.readLine());
			re.close();
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
			
			re1.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

