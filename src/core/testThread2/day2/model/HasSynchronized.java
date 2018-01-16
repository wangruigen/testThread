package core.testThread2.day2.model;
/**
 * 多线程执行非同步的代码是异步的，执行同步代码是队列顺序的
 * @author wrg
 */
public class HasSynchronized {
	public void method(){
		System.out.println("非同步：");
		for (int i = 0; i < 20; i++) {
			System.out.println("Thread is "+Thread.currentThread().getName()+" and i is "+i);
		}
		synchronized (this) {//多线程执行非同步的代码是异步的，执行同步代码是队列顺序的
			System.out.println("同步：");
			for (int i = 0; i < 20; i++) {
				System.out.println("Thread is "+Thread.currentThread().getName()+" and i is "+i);
			}
		}
	}
}
