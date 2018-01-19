package core.testThread3.day1.test;

import org.junit.Test;

import core.testThread3.day1.model.NotifyThread;
import core.testThread3.day1.model.WaitThread;
/**
 * <h1>wait()机制的实现：</h1>
 * 方法wait()的作用是使当前执行代码的线程进行等待，wait()方法是Object类的方法，该方法
 * 用来将当前线程置入“预执行队列”中，并且在wait()所在的代码处进行停止执行，直到接到通知或被中断为止。
 * 在调用wait()之前，线程必须获得该对象的对象级别所，即只能在同步方法或同步代码块中调用wait()方法。
 * 在执行wait()方法后，当前线程释放锁。在从wait()返回前，线程与其他线程竞争重新获得锁。如果调用wait()
 * 时没有持有适当的锁，则抛出IllegalMonitorStateException，它是RuntimeException的一个子类，因此，不需要
 * try-catch语句进行捕捉异常。
 * <h1>notify()机制的实现：</h1>
 * 方法notify()也要在同步方法或者同步代码块中调用，即在调用前，线程也必须获得该对象的对象级别锁。如果调用
 * notify()时没有适当的锁，也会抛出IllegalMonitorStateException。该方法用来通知那些可能等待该对象的对象锁
 * 的其他线程，如果有多个线程等待，则由线程规划器随机挑选出其中一个呈wait状态的线程，对其发出通知notify，并
 * 使他的等待获取该对象的对象锁。<br>
 * 需说明的是，在执行notify()方法后，当前线程不会马上释放该对象锁，呈wait状态的线程也不能
 * 马上获取该对象锁，要等到notify()方法的线程将程序执行完毕，也就是推出synchronized代码块
 * 后，当前线程才会释放锁，而呈wait状态所在的线程才可以获取该对象锁。
 */
public class WaitAndNotifyTest {
	/**
	 * 调用wait()不是同步方法或代码块会抛出IllegalMonitorStateException
	 */
	@Test
	public void waitTest1(){
		try{
			System.out.println("11");
			String string = new String("");
			string.wait();
			System.out.println("22");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	/**
	 * 调用wait()前获取对象锁，不会抛出IllegalMonitorStateException
	 */
	@Test
	public void waitTest2(){
		try{
			String string = new String("");
			synchronized (string) {
				string.wait();
			}
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
	/**
	 * 等待/通知
	 * @throws InterruptedException 
	 */
	@SuppressWarnings("static-access")
	@Test
	public void waitAndNotify(){
		try{
			Object lock = new Object();
			WaitThread waitThread = new WaitThread(lock);
			waitThread.start();
			waitThread.sleep(3000);
			NotifyThread notifyThread = new NotifyThread(lock);
			notifyThread.start();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
