package test;

import model.MyThread;

public class Test {
	public static void main(String[] args) {
		MyThread mythread = new MyThread();
		Thread a = new Thread(mythread, "a");
		Thread b = new Thread(mythread, "b");
		Thread c = new Thread(mythread, "c");
		Thread d = new Thread(mythread, "d");
		Thread e = new Thread(mythread, "e");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
	}
}
