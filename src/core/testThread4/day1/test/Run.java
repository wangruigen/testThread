package core.testThread4.day1.test;

import core.testThread4.day1.model.Mythread;
import core.testThread4.day1.model.ReentrantLockTest;

public class Run {

	public static void main(String[] args) {
		ReentrantLockTest reentrantLockTest = new ReentrantLockTest();
		Mythread t1 = new Mythread(reentrantLockTest);
		Mythread t2 = new Mythread(reentrantLockTest);
		Mythread t3 = new Mythread(reentrantLockTest);
		Mythread t4 = new Mythread(reentrantLockTest);
		Mythread t5 = new Mythread(reentrantLockTest);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
