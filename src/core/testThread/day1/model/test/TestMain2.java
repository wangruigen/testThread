package core.testThread.day1.model.test;

import core.testThread.day1.model.MyThread2;

public class TestMain2 {
	public static void main(String[] args) throws InterruptedException {
		MyThread2 myThread2 = new MyThread2();
		myThread2.start();
		myThread2.sleep(1000);
		myThread2.interrupt();
	}
}
