package com.learnjava.callback;

/*
 * java通过接口来实现回调
 * 参考文章：https://www.cnblogs.com/liyuanhong/articles/10110137.html
 */



public interface Callback {
	public void tellAnswer(String answer);
}


class Teacher implements Callback{
//	private Student student;
//	public Teacher(Student student) {
//		this.student = student;
//	}
		
	@Override
	public void tellAnswer(String answer) {
		System.out.println("我的回答是： " + answer);
	}
	
	public void askStudent(Student student) {
		student.resolveQuestion(this);
	}
	
}

interface Student{
	public void resolveQuestion(Callback callback);
}

class Xiaoming implements Student{

	@Override
	public void resolveQuestion(Callback callback) {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		callback.tellAnswer("阳光");
	}
	
}