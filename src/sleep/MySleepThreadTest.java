package sleep;

//import static org.junit.Assert.*;

import org.junit.Test;

public class MySleepThreadTest {

	@Test
	public void test() {
		MySleepThread mySleepThread = new MySleepThread();
		System.out.println("begin = "+System.currentTimeMillis());
		mySleepThread.run();//run同步执行，代码顺序执行
		System.out.println("end = "+System.currentTimeMillis());
	}

	@Test
	public void test2() {
		MySleepThread2 mySleepThread2 = new MySleepThread2();
		System.out.println("begin = "+System.currentTimeMillis());
		mySleepThread2.run();//start异步执行
		System.out.println("end = "+System.currentTimeMillis());
	}
}
