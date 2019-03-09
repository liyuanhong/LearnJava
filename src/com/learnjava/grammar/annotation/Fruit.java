package com.learnjava.grammar.annotation;

public class Fruit {
	public static void main(String[] args) {
		
	}
}

class Fruit1{
	private String name;
	public Fruit1(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
}

class Fruit2 extends Fruit1{
	private String name;
	
	public Fruit2(String name) {
		super(name);
		
	}
	
	/*
	 * @Override告诉编译器这个方法是一个重写方法(描述方法的元数据)，
	 * 如果父类中不存在该方法，编译器便会报错，提示该方法没有重写父类中的方法。
	 */
	@Override
	public String getName1(){
		return name;
	}
}