package core.testThread4.day1.model;
/**
 * ReentrantLockd测试lock()是否获取对象监视器
 * @author wangruigen
 */
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
