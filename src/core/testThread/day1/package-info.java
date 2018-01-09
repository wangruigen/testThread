/**
 * 停止线程的方法
 * 1.异常法{@link core.testThread.day1.model.MyThread1} 建议使用
 * 2.线程配合return使用 {@link core.testThread.day1.model.MyThread2}
 * 3.暴力停止stop(),不推荐，会发生多线程"解锁"问题，多线程共享值会发生错乱。如线程1先读取共享对象A（A是多个成员变量值），此时A是被1占用，
 * 线程2等待1释放（修改）对象A，此时A可能出现数据不一致的情况
 * @author wrg
 */
package core.testThread.day1;