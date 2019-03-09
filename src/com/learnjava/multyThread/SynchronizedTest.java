package com.learnjava.multyThread;

/********************************************
 *		synchronized同步机制（对应异步机制）
 *		synchronized的4种用法：
 *						一：修饰方法
 *						二：修饰代码块
 *						三：修饰一个静态方法
 *						四：修饰一个类
 *		参考地址：https://blog.csdn.net/sinat_32588261/article/details/72880159
 ********************************************/

public class SynchronizedTest {
	public static void main(String[] args) {
/*****************************************************************************
 * 						同步代码块测试（修饰代码块）
 * 
 *****************************************************************************/
		//(写法一)
		//一个线程访问一个对象中的synchronized(this)同步代码块时，其他试图访问该对象的线程将被阻塞
		/**当两个并发线程(thread1和thread2)访问同一个对象(syncThread)中的synchronized代码块时，
		在同一时刻只能有一个线程得到执行，另一个线程受阻塞，必须等待当前线程执行完这个代码块以后才能执行该代码块。
		Thread1和thread2是互斥的，因为在执行synchronized代码块时会锁定当前的对象，
		只有执行完该代码块才能释放该对象锁，下一个线程才能执行并锁定该对象
		 */
//		PlusThread thread1 = new PlusThread();
//		Thread th1 = new Thread(thread1);
//		Thread th2 = new Thread(thread1);
		
		//（写法二）
		//为什么写法二中thread1和thread2同时在执行。这是因为synchronized只锁定对象，每个对象只有一个锁（lock）与之相关联。
//		Thread th1 = new Thread(new PlusThread());
//		Thread th2 = new Thread(new PlusThread());
//		
//		th1.start();
//		th2.start();
		
/*****************************************************************************
 * 
 * 							同步方法测试（修饰一个方法）
 * 
 *****************************************************************************/
		//同步方法测试
//		PlusThread1 thread11 = new PlusThread1();
//		Thread th11 = new Thread(thread11);
//		Thread th12 = new Thread(thread11);
//		th11.start();
//		th12.start();
		
/*****************************************************************************
 * 
 * 							同步方法测试（修饰一个静态方法）
 * 		静态方法是属于类的而不属于对象的。同样的，synchronized修饰的静态方法锁定的是这个类的所有对象
 * 
 *****************************************************************************/
		//由于synchronized修饰的静态方法锁定的是这个累的所有对象，所以上面的（方法二）写法生效
//		Thread th21 = new Thread(new PlusThread2());
//		Thread th22 = new Thread(new PlusThread2());
//		
//		th21.start();
//		th22.start();
		
/*****************************************************************************
 * 
 * 							同步类测试（修饰一个类）
 * 				给class加锁和上例的给静态方法加锁是一样的，所有对象公用一把锁
 * 
 *****************************************************************************/
		//由于synchronized给class加锁，所以上面的（方法二）写法生效
		Thread th31 = new Thread(new PlusThread3());
		Thread th32 = new Thread(new PlusThread3());
		
		th31.start();
		th32.start();
		
		
		
		
	}
	
	
}

//定义同步代码块（修饰代码块）
class PlusThread implements Runnable {
	public static int monney = 0;
	
	@Override
	public void run() {
		System.out.println("synchronized修饰代码块");
		synchronized(this) {
			for(int i = 0;i < 6;i++) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(++monney);
			}
		}
	}
}

//修饰方法
class PlusThread1 implements Runnable{
	public static int monney1 = 0;
	
	public synchronized void plus() {
		for(int i = 0;i < 6;i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(++monney1);
		}
	}

	@Override
	public void run() {
		System.out.println("synchronized修饰方法");
		plus();
	}
}

//修饰一个静态方法
//静态方法是属于类的而不属于对象的。同样的，synchronized修饰的静态方法锁定的是这个类的所有对象。
class PlusThread2 implements Runnable{
	public static int monney2 = 0;
	
	public static synchronized void plus() {
		for(int i = 0;i < 6;i++) {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(++monney2);
		}
	}

	@Override
	public void run() {
		System.out.println("synchronized修饰静态方法");
		plus();
	}
}

//修饰一个类
//给class加锁和上例的给静态方法加锁是一样的，所有对象公用一把锁

class PlusThread3 implements Runnable{
	public static int monney3 = 0;
	
	public static void plus() {
		synchronized (PlusThread3.class) {
			for(int i = 0;i < 6;i++) {
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(++monney3);
			}
		}
	}

	@Override
	public void run() {
		System.out.println("synchronized修饰类");
		plus();
	}
}

/*
 * 总结：
 * 无论synchronized关键字加在方法上还是对象上，如果它作用的对象是非静态的，则它取得的锁是对象；
 * 如果synchronized作用的对象是一个静态方法或一个类，则它取得的锁是对类，该类所有的对象同一把锁。
 * 
 * 每个对象只有一个锁（lock）与之相关联，谁拿到这个锁谁就可以运行它所控制的那段代码。 
 */





