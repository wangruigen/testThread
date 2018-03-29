package core.testThread4.day1.model;
/**
 * ReentrantLock的线程测试
 * @author wangruigen
 */
public class Mythread extends Thread {
	private ReentrantLockTest reentrantLockTest;
	
	public Mythread() {
		super();
	}

	public Mythread(ReentrantLockTest reentrantLockTest) {
		super();
		this.reentrantLockTest = reentrantLockTest;
	}

	@Override
	public void run() {
		reentrantLockTest.testMethod();
	}
}
