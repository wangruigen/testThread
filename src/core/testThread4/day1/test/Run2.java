package core.testThread4.day1.test;

import core.testThread4.day1.model.MyThreadA;
import core.testThread4.day1.model.MyThreadB;
import core.testThread4.day1.model.MyThreadBB;
import core.testThread4.day1.model.ReentrantLockTest2;

/**
 * 测试ReenTrantLock的lock()方法是获得对象监视器
 * @author wrg
 */
public class Run2 {
	public static void main(String[] args) {
		ReentrantLockTest2 lockTest2 = new ReentrantLockTest2();
		MyThreadA ta = new MyThreadA(lockTest2);
		ta.setName("A");
		ta.start();
		MyThreadA taa = new MyThreadA(lockTest2);
		taa.setName("AA");
		taa.start();
		MyThreadB tb = new MyThreadB(lockTest2);
		tb.setName("B");
		tb.start();
		MyThreadBB tbb = new MyThreadBB(lockTest2);
		tbb.setName("BB");
		tbb.start();
	}
}
