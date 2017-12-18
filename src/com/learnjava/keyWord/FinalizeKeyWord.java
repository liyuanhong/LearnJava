package com.learnjava.keyWord;

public class FinalizeKeyWord {
	public static void main(String[] args) {
		Pelple peo = new Pelple("Lili");
		peo.printName();
		Pelple peo1 = new Pelple("liulei");
		peo1.printName();
	}
}

class Pelple{
	private String name;
	public Pelple(String name){
		this.name = name;
	}
	
	public void printName(){
		System.out.println(name);
	}	
	
	/*
	 * finalize ����������������׼���ͷŶ����ڴ��ʱ�����
	 * Ҳ����˵��������������׼���ͷŶ����ڴ��ʱ��ص�����
	 */
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("call finalize method !");
	}
}