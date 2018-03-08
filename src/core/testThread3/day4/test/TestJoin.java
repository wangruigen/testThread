package core.testThread3.day4.test;

import core.testThread3.day4.model.MyThread;

public class TestJoin {
	public static void main(String[] args) throws InterruptedException {
		MyThread myThread = new MyThread();
		myThread.start();
		myThread.join();//不加join主线程不会等子线程结束，直接运行完啦
		System.out.println("主线程执行，");
	}
}
