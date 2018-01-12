package core.testThread2.day1.test;

import core.testThread2.day1.model.ObjectHasSynchronized;
import core.testThread2.day1.model.ThreadHasSynchronized;

/**
 * 测试synchronized锁重入{@link ObjectHasSynchronized}
 * @author wrg
 */
public class TestObjectHasSynchronized {

	public static void main(String[] args) {
		ThreadHasSynchronized hasSynchronized = new ThreadHasSynchronized();
		hasSynchronized.start();
	}

}
