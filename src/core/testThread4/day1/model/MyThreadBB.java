package core.testThread4.day1.model;

public class MyThreadBB extends Thread {
	private ReentrantLockTest2 lockTest2;

	public MyThreadBB(ReentrantLockTest2 lockTest2) {
		super();
		this.lockTest2 = lockTest2;
	}
	
	@Override
	public void run() {
		lockTest2.testB();
	}
}
