package core.testThread4.day2.test;

import core.testThread4.day2.model.MyService3;
import core.testThread4.day2.model.ThreadConditionA;
import core.testThread4.day2.model.ThreadConditionB;

/**
 * 测试使用多个Condition对象来实现等待/通知,并控制哪个线程能被唤醒
 * @author wangruigen
 */
public class Run3 {
	public static void main(String[] args) {
		/*
		 * 这里我只唤醒A线程
		 */
		MyService3 myService3 = new MyService3();
		ThreadConditionA threadConditionA = new ThreadConditionA(myService3);
		threadConditionA.setName("A");
		threadConditionA.start();//使线程A处于WAITING状态
		ThreadConditionB threadConditionB = new ThreadConditionB(myService3);
		threadConditionB.setName("B");
		threadConditionB.start();//使线程B处于WAITING状态
		
		myService3.signal_All_A();//这里只唤醒A线程,B一直处于WAITING
	}
}
