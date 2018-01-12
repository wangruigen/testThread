/**
 * 守护线程：
 * 	java线程分为守护线程（Daemon Thread）和用户线程(User Thread)，一般的线程都是用户线程,守护线程具有“陪伴”、给用户线程
 * 提供服务等含义。当用户线程结束时，守护线程也结束了，因为已经没有用户线程需要服务。如，虚拟机中的GC(垃圾回收器)。
 * 使用:{@link core.testThread.day5.model.TestMyThread}
 * <h1>守护线程不利于应用在IO、逻辑计算等环节。因为守护线程可能还没来得及操作，虚拟机就退出了</h1>
 * @author wrg
 */
package core.testThread.day5;