package core.testThread.day2.model.test;

import core.testThread.day2.model.MyThread;

public class TestMain {
	public static void main(String[] args) {
		//test1();
		test2();
	}
	/**
	 * 测试暂停和恢复线程
	 */
	public static void test1(){
		MyThread myThread = new MyThread();
		myThread.start();
		try {
			Thread.sleep(5000);
			//暂停线程
			myThread.suspend();
			System.out.println("A="+System.currentTimeMillis()+" i="+myThread.getI());
			Thread.sleep(5000);
			System.out.println("A="+System.currentTimeMillis()+" i="+myThread.getI());
			
			//恢复线程
			myThread.resume();
			System.out.println("B="+System.currentTimeMillis()+" i="+myThread.getI());
			Thread.sleep(5000);
			System.out.println("B="+System.currentTimeMillis()+" i="+myThread.getI());
			System.out.println("恢复线程之后i的值变了");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 测试线程1暂停线程，线程2能否访问共享对象
	 */
	public static void test2(){
		MyThread myThread = new MyThread();
		Thread threada = new Thread(myThread,"a");
		Thread threadb = new Thread(myThread,"b");
		
		threada.start();
		try {
			Thread.sleep(5000);
			//暂停线程a
			threada.suspend();
			System.out.println("A="+System.currentTimeMillis()+" i="+myThread.getI());
			Thread.sleep(5000);
			System.out.println("A="+System.currentTimeMillis()+" i="+myThread.getI());
			//启动线程b
			threadb.start();
			Thread.sleep(5000);
			System.out.println("B="+System.currentTimeMillis()+" i="+myThread.getI());
			Thread.sleep(5000);
			System.out.println("B="+System.currentTimeMillis()+" i="+myThread.getI());
			//恢复线程a
			threada.resume();
			//打印线程b
			Thread.sleep(5000);
			System.out.println("B="+System.currentTimeMillis()+" i="+myThread.getI());
			Thread.sleep(5000);
			System.out.println("B="+System.currentTimeMillis()+" i="+myThread.getI());
			System.out.println("能访问共享对象值，但此时的值一直在a线程中停留");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
