package core.testThread2.day2.model;
/**
 * synchronized(非this)案列{@link TaskTest}
 * <h1>synchronized(非this)的优点:</h1>
 * <ol>
 * 	<li>如果在类中有很多个synchronized方法，这时虽然能实现同步，但会受到阻塞，所以影响
 *运行效率；但如果使用同步代码块锁非this对象，则synchronized(非this)代码块中的程序与
 *同步方法是异步的，不与其他锁this同步方法争抢this锁，则可以大大提高运行效率。
 * </ol>
 * @author wrg
 */
public class TaskTest {
	public static void main(String[] args) {
		Task task = new Task();//这里是同一个对象，两个线程执行，锁定的变量String lock=new String()，lock也是同一个。
		TaskThreadA taskThreadA = new TaskThreadA(task);
		taskThreadA.setName("A");
		taskThreadA.start();
		TaskThreadB taskThreadB = new TaskThreadB(task);
		taskThreadB.setName("B");
		taskThreadB.start();
	}
}
