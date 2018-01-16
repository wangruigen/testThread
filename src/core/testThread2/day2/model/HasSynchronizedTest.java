package core.testThread2.day2.model;
/**
 * 多线程执行非同步的代码是异步的，执行同步代码是队列顺序的
 * @author wrg
 */
public class HasSynchronizedTest {

	public static void main(String[] args) {
		HasSynchronized hsHasSynchronized = new HasSynchronized();
		MyThreadA myThreadA = new MyThreadA(hsHasSynchronized);
		myThreadA.setName("A");
		MyThreadB myThreadB = new MyThreadB(hsHasSynchronized);
		myThreadB.setName("B");
		myThreadA.start();
		myThreadB.start();
	}
}
