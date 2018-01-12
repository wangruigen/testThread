package core.testThread2.day1.test;

import core.testThread2.day1.model.MyThreadA;
import core.testThread2.day1.model.MyThreadB;
import core.testThread2.day1.model.ObjectHasPrivate;
/**
 * <h1>方法内的变量一定是线程安全的</h1>
 * <h1>多线程访问对象中的成员变量，成员变量值是非线程安全的。</h1>
 * @author wrg
 */
public class TestObjectHasPrivate {

	public static void main(String[] args) {
		ObjectHasPrivate objectHasPrivate = new ObjectHasPrivate();
		/**
		 * 两个线程同时访问对象ObjectHasPrivate,i的值是非线程安全的
		 */
		MyThreadA myThreadA = new MyThreadA(objectHasPrivate);
		myThreadA.start();
		MyThreadB myThreadB = new MyThreadB(objectHasPrivate);
		myThreadB.start();
		/**
		 * ObjectHasPrivate对象的addI()方法加上同步关键字synchronized:
		 * synchronized public void addI(String username){
		 * 再次运行程序，是线程安全的
		 */
	}
}
