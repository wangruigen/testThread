package core.testThread4.day1.model;
/**
 * ReentrantLockd测试lock()是否获取对象监视器
 * @author wangruigen
 */
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
