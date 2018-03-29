package core.testThread4.day2.model;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试使用多个Condition对象来实现等待/通知
 * @author wangruigen
 */
public class MyService3 {
	private Lock lock = new ReentrantLock();
	private Condition conditionA = lock.newCondition();
	private Condition conditionB = lock.newCondition();
	
	public void awaitA() {
		try {
			lock.lock();
			System.out.println("awaitA time="+System.currentTimeMillis());
			conditionA.await();
		}catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	public void awaitB() {
		try {
			lock.lock();
			System.out.println("awaitB time="+System.currentTimeMillis());
			conditionB.await();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	public void signal_All_A() {
		try {
			lock.lock();
			System.out.println("signal A ");
			conditionA.signalAll();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
	public void signal_All_B() {
		try {
			lock.lock();
			System.out.println("signal B ");
			conditionB.signalAll();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
