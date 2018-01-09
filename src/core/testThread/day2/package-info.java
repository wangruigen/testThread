/**
 * 暂停线程：
 * 暂停线程意味着此线程还可以恢复运行。在java多线程中，可以使用suspend()方法
 * 暂停线程，使用resume()方法恢复线程的执行。
 * 缺点：使用supend()方法会独占线程，其他线程不能访问共享对象了
 * @author wrg
 */
package core.testThread.day2;