package core.testThread4.day2.test;

import core.testThread4.day2.model.MyService2;
import core.testThread4.day2.model.Thread2;

/**
 * 测试使用一个Condition来实现 等待/通知
 * @author wangruigen
 */
public class Run2 {
	public static void main(String[] args) throws InterruptedException {
		MyService2 myService2 = new MyService2();
		Thread2 tw = new Thread2(myService2);
		tw.start();
		Thread.sleep(3000);
		myService2.signal();
	}
}
