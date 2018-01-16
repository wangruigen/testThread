/**
 * 同步代码块：
 * 1.一半同步，一半异步：多线程执行synchronized关键字的代码是同步执行，{@link core.testThread2.day2.model.HasSynchronizedTest}
 * 	非synchronized关键字代码块是异步执行{@link core.testThread2.day2.model.HasSynchronized}
 * 2.一个类中有多个同步代码块时synchronized(this),一个线程访问其中一个synchronized(this)方法时，其它线程会等待，这说明synchronized(this)
 * 对象监视器是一个，我自己的理解是：this就是唯一的线程锁。
 * 3.synchronized(非this)锁：{@link core.testThread2.day2.model.TaskTest}
 * @author wrg
 */
package core.testThread2.day2;