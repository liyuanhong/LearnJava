package com.learnjava.keyWord;

public class BreakKeyword {
	public static void main(String[] args) {
		int flag = 0;
		while(true) {
			if(flag < 10) {
				flag++;
			}else {
				break;
			}
			System.out.println(flag);
		}
		
		System.out.println("-----------------------------------------");
		
		for(int i = 0;i < 50;i++) {
			if(i == 10) {
				break;
			}
			System.out.println(i);
		}
	}
}
