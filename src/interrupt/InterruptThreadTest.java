package interrupt;


import org.junit.Test;

public class InterruptThreadTest {

	@Test
	public void test() {
		InterruptThread thread = new InterruptThread();
		Thread t = new Thread(thread);
		t.start();
		try {
			Thread.sleep(2000);
			t.interrupt();//线程不一定立即停止
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void test2() {
		InterruptThread thread = new InterruptThread();
		Thread t = new Thread(thread);
		t.start();
		try {
			Thread.sleep(2000);
			t.interrupt();//线程不一定立即停止
			System.out.println("是否停止1："+t.interrupted());
			System.out.println("是否停止2："+t.interrupted());
			/**
			 * 打印的是两个false:
			 * 官方文档:
			 * 这个方法会清除线程的的终止状态，第二次调用会返回false。
			 */
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void test3() {
		try {
			InterruptThread thread = new InterruptThread();
			Thread t = new Thread(thread);
			t.start();
			Thread.sleep(2000);
			t.interrupt();//线程不一定立即停止
			System.out.println("是否停止1："+t.isInterrupted());
			System.out.println("是否停止2："+t.isInterrupted());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
}
