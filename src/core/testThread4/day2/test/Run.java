package core.testThread4.day2.test;

import core.testThread4.day2.model.MyService;
import core.testThread4.day2.model.ThreadA;
/**
 * 测试Condition.await()方法。
 * @author wangruigen
 */
public class Run {
	public static void main(String[] args) {
		MyService myService = new MyService();
		ThreadA threadA = new ThreadA(myService);
		threadA.start();
		//抛出异常，无监视器对象，需在await()方法之前调用lock.lock()方法来获得同步监视器
	}
}
