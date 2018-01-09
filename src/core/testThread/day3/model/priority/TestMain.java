package core.testThread.day3.model.priority;
/**
 * 测试线程优先级的继承性
 * @author wrg
 */
public class TestMain {
	public static void main(String[] args) {
		System.out.println("main thread priority is "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);//启动的后续线程优先级都是8
		MyThreadA myThreadA = new MyThreadA();
		myThreadA.start();
	}
}
