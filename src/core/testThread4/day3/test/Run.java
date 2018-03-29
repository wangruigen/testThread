package core.testThread4.day3.test;

import core.testThread4.day3.model.Subject;
import core.testThread4.day3.model.ThreadA;
import core.testThread4.day3.model.ThreadB;

/**
 * 测试使用Condition实现一对一交叉打印
 * @author wangruigen
 */
public class Run {

	public static void main(String[] args) {
		Subject subject = new Subject();
		ThreadA ta = new ThreadA(subject);
		ThreadB tb = new ThreadB(subject);
		ta.start();
		tb.start();
	}

}
