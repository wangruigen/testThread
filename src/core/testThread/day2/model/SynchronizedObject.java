package core.testThread.day2.model;
/**
 * 在使用suspend与resume方法时，如果使用不当，极易造成公共的
 * 同步对象的独占，使得其他线程无法访问公共同步对象
 * @author wrg
 */
public class SynchronizedObject {
	synchronized public void printString(){
		System.out.println(Thread.currentThread().getName()+"---begin");
		if(Thread.currentThread().getName().equals("a")){
			System.out.println("a线程永远  suspend 了！");
			/**
			 * 线程名为a的线程暂停
			 */
			Thread.currentThread().suspend();
		}
		System.out.println(Thread.currentThread().getName()+"---end");
	}
}
