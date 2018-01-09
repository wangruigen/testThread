package core.testThread.day1.model.test;

import core.testThread.day1.model.MyThread1;

public class TestMain1 {
	public static void main(String[] args) {
		MyThread1 myThread1 = new MyThread1();
		System.out.println("begin");
		try{
			myThread1.start();
			myThread1.sleep(1000);
			myThread1.interrupt();
		}catch(Exception e){
			System.out.println("main catch");
			e.printStackTrace();
		}
		System.out.println("end");
		
	}
}
