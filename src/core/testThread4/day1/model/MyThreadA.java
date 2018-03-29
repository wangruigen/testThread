package core.testThread4.day1.model;

public class MyThreadA extends Thread {
	private ReentrantLockTest2 lockTest2;

	public MyThreadA(ReentrantLockTest2 lockTest2) {
		super();
		this.lockTest2 = lockTest2;
	}

	public MyThreadA() {
		super();
	}
	@Override
	public void run() {
		lockTest2.testA();
	}
}
