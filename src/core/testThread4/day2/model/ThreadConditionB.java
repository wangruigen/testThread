package core.testThread4.day2.model;
/**
 * 测试使用多个Condition对象来实现等待/通知,线程A调用wait_B
 * @author wangruigen
 */
public class ThreadConditionB extends Thread {
	private MyService3 myService3;

	public ThreadConditionB(MyService3 myService3) {
		this.myService3 = myService3;
	}
	@Override
	public void run() {
		myService3.awaitB();
	}
}
