package core.testThread.day4.model;
/**
 * 1.cpu会将执行资源让给优先级高的线程，与代码顺序无关。
 * 2.优先级高的线程代码不一定先执行完，如将myThread1.setPriority(5)，myThread2.setPriority(6)。线程优先级相距不大，多次打印发现
 * 有时候myThread1也能先执行完，优先级高的线程不一定先执行完run中的方法
 * 总结：线程优先级与打印（代码执行顺序）无关。
 * @author wrg
 */
public class TestMain {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			MyThread1 myThread1 = new MyThread1();
			MyThread2 myThread2 = new MyThread2();
			myThread1.setPriority(5);
			myThread1.start();
			myThread2.setPriority(6);
			myThread2.start();
			
		}
		//通过打印看出，线程优先级高的总是先执行完
	}
}
