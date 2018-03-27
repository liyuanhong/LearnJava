package com.learnjava.keyWord.publicProtectPrivate.other;

public class TheProtectKeyword {
	protected String name = "mumu";
	
	protected void printName(){
		System.out.println(name);
	}
	
	public void doPrintName(){
		printName();
	}
}
