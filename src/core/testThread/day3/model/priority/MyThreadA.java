package core.testThread.day3.model.priority;
/**
 * 线程具有继承性 线程A启动线程B 线程B的优先级和A一样
 * @author wrg
 */
public class MyThreadA extends Thread{
	@Override
	public void run() {
		System.out.println("thread priority is "+this.getPriority());
		MyThreadB myThreadB = new MyThreadB();
		myThreadB.start();
	}

}
