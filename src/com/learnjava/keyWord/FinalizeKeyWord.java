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
	 * finalize 方法在垃圾回收器准备释放对象内存的时候调用
	 * 也就是说，垃圾回收器在准备释放对象内存的时候回调用他
	 */
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println("call finalize method !");
	}
}