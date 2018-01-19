package core.testThread3.day1.model;
/**
 * 线程wait()之后，会立即释放锁
 * @author wrg
 */
public class WaitNoWait {
	public void method(Object object){
		synchronized(object){
			try {
				System.out.println ("Thread "+Thread.currentThread().getName()+" wait");
				object.wait();
				System.out.println("end wait ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
