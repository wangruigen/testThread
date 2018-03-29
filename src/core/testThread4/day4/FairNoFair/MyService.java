package core.testThread4.day4.FairNoFair;

import java.util.concurrent.locks.ReentrantLock;

public class MyService {
	
	private ReentrantLock lock;

	public MyService(boolean isFair) {
		super();
		this.lock = new ReentrantLock(isFair);
	}
	public void serviceMethod() {
		try {
			lock.lock();
			System.out.println("ThreadName="+Thread.currentThread().getName()+"获得锁定");
			
		}finally {
			lock.unlock();
		}
	}
}
