/**
 * Condition对象实现等待/通知机制，类似synchronized与wait()/notify()实现等待/通知一样
 * <h1>Condition与synchronized的区别：</h1>
 * <ol>
 * 	<li>Condition类是在jdk5中出现的技术，使用他有更好的灵活性，比如可以实现多路通知功能，也就是在
 * 一个Lock对象里面可以创建多个Condition（即对象监视器）对象，线程对象可以注册在指定的Condition中，
 * 从而可以有选择性的进行线程通知，在调度上更加灵活。
 * 	<li>在使用notify()/notifyAll()方法进行通知时，被通知的线程却是由JVM随机选择的。但使用ReentrantLock
 * 结合Condition类是可以实现前面介绍过的“选择性通知”，这个功能是非常重要的，而且在Condition类中是默认
 * 提供的。
 * <li>synchronized就相当于整个Lock对象中只有一个单一的Condition对象，所有的线程都注册在它的一个对象身上。
 * 线程开始notifyAll()时，需要通知所有的WAITING线程，没有选择权，会出现相当大的效率问题。
 * </ol>
 * @author wangruigen
 */
package core.testThread4.day2;
