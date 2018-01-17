package core.testThread2.day4.model;
/**
 * {@link RunThread}
 * @author wrg
 */
public class RunThreadTest {

	public static void main(String[] args) throws InterruptedException {
		RunThread runThread = new RunThread();
		runThread.start();
		Thread.sleep(1000);
		/**
		 * runThread.setRunning(false);更新的是公共堆栈的值，但是
		 * 线程一直在共有堆栈中取值，为保证线程取值是公共堆栈中的最新值，
		 * 使用volatile关键字修饰变量
		 */
		runThread.setRunning(false);
		System.out.println("isRunning变成false");
	}

}
