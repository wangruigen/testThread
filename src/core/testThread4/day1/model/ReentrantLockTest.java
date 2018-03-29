package core.testThread4.day1.model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/**
 * 测试ReentrantLock的基本使用
 * @author wrg
 */
public class ReentrantLockTest {
	private Lock lock = new ReentrantLock();
	
	public void testMethod(){
		lock.lock();//获取锁
		for (int i = 0; i < 5; i++) {
			System.out.println("ThreadName="+Thread.currentThread().getName()+"("+(i+1)+")");
		}
		lock.unlock();//释放锁
	}
}
