package com.learnjava.javaSpecial;

/*
 * java多态学习
 */

public class MultiModelFruit {
	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.showFruitName();
		apple.showFruitColor();
		System.out.println("------------------------------");
		Fruit fu = new Apple();
		fu.showFruitName();
		fu.showFruitColor();
		System.out.println("------------------------------");
		Fruit fu1 = new Fruit();
		fu1.showFruitName();
		fu1.showFruitColor();
	}
}

//定义一个水果类
class Fruit {
	String fruitName;
	String fruitColor;
	
	public Fruit() {
		this.fruitName = "fruit";
		this.fruitColor = "anyColor";
	}
	
	public void showFruitName() {
		System.out.println(fruitName);
	}
	
	public void showFruitColor() {
		System.out.println(fruitColor);
	}
}

//苹果，继承了水果的属性和方法
class Apple extends Fruit{
	public Apple() {
		this.fruitName = "Apple";
		this.fruitColor = "red";
	}
}