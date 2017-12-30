package com.learnjava.keyWord;

public class FinalizeKeyWord {
	public static void main(String[] args) {
		for(int i = 0;i < 100;i++){
			Pelple peo = new Pelple("Lili");
			peo.printName();
			Pelple peo1 = new Pelple("liulei");
			peo1.printName();
		}
		
		/*
		 * 强制执行垃圾回收（当然也可以通过多次重复循环执行程序，来触发垃圾回收动作的执行）
		 */
		System.gc();
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
		System.out.println("call finalize method !");
		super.finalize();
	}
}