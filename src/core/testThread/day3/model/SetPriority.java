package core.testThread.day3.model;
/**
 * 设置线程优先级使用setPriority()方法,源码如下。
 * public final void setPriority(int newPriority) {
 *  ThreadGroup g;
 *      checkAccess();
 *      if (newPriority > MAX_PRIORITY || newPriority < MIN_PRIORITY) {
 *          throw new IllegalArgumentException();
 *      }
 *      if((g = getThreadGroup()) != null) {
 *          if (newPriority > g.getMaxPriority()) {
 *              newPriority = g.getMaxPriority();
 *          }
 *          setPriority0(priority = newPriority);
 *      }
 * }
 * @author wrg
 */
public class SetPriority {
	/**
	 * The minimum priority that a thread can have.
	 */
	public final static int MIN_PRIORITY = 1;

	/**
	 * The default priority that is assigned to a thread.
	 */
	public final static int NORM_PRIORITY = 5;

	/**
	 * The maximum priority that a thread can have.
	 */
	public final static int MAX_PRIORITY = 10;
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getPriority());//默认等级5
		int level = 8;
		Thread.currentThread().setPriority(level);
		System.out.println(Thread.currentThread().getPriority());//赋予等级8
		level = 0;//会抛出异常，等级低于1
		Thread.currentThread().setPriority(level);
		System.out.println(Thread.currentThread().getPriority());
		/**
		 * java的优先级分为1-10这10个等级，超过或者低于这个等级则会抛出IllegalArgumentException
		 * 异常。
		 * 成员变量是源代码中首先定义的三个等级：最小等级1，默认分配给线程的等级5，最大等级10.
		 */

	}
}
