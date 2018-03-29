package core.testThread4.day3.model;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Subject {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean flag = false;
	public void set() {
		try {
			lock.lock();
			while(flag) {
				condition.await();
			}
			System.out.println("打印★");
			flag = true;
			condition.signal();
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	public void get() {
		try {
			lock.lock();
			while(flag==false) {
				condition.await();
			}
			System.out.println("打印☆");
			flag = false;
			condition.signal();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}
}
