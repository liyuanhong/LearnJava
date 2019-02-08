package com.learnjava.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class LearnWriter {
	public static void main(String[] args) {
		FileWriterTest fwt = new FileWriterTest();
		fwt.doTest();
	}
}


class FileWriterTest{
	public void doTest() {
		String curDir = System.getProperty("user.dir");
		
		System.out.println(curDir);
		
		File fi = new File(curDir + "/test/writer.txt");
		FileWriter fw = null;
		
		try {
			fw = new FileWriter(fi);
			fw.write("您好！");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}