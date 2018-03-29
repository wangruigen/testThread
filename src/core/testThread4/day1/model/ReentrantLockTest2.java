package core.testThread4.day1.model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 测试ReentrantLock，的lock()方法被调用时，线程就持有了“对象监视器”，其他线程只有等到锁释放才能执行下面操作，
 * 效果和synchronized一样
 * @author wrg
 */
public class ReentrantLockTest2 {
	private Lock lock = new ReentrantLock();
	
	public void testA(){
		try{
			lock.lock();
			System.out.println("MethodA ThreadName="+Thread.currentThread().getName()+" begin Time="+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("MethodA ThreadName="+Thread.currentThread().getName()+" end Time="+System.currentTimeMillis());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	public void testB(){
		try{
			lock.lock();
			System.out.println("MethodB ThreadName="+Thread.currentThread().getName()+" begin Time="+System.currentTimeMillis());
			Thread.sleep(5000);
			System.out.println("MethodB ThreadName="+Thread.currentThread().getName()+" end Time="+System.currentTimeMillis());
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
}
