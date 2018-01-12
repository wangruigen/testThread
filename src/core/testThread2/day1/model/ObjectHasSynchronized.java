package core.testThread2.day1.model;
/**
 * 关键字synchronized拥有锁重入的功能，也就是在使用synchronized时，
 * <h1>可重入锁概念：自己可以再次获取自己的内部锁。比如线程A获取某对象
 * 的锁，此时这个对象锁还没有释放，当再次想要获取这个对象的锁的时候还是可以
 * 获取的，如果是不可锁重入的话，会出现死锁的情况。</h1>
 * <h1>当一个线程得到一个对象的锁后，再次请求此对象时是可以再次得到该对象的锁的(不会等待)。</h1>
 * @author wrg
 */
public class ObjectHasSynchronized {
	synchronized public void service1(){
		System.out.println("service1");
		service2();
	}
	synchronized public void service2(){
		System.out.println("service2");
		service3();
	}
	synchronized public void service3(){
		System.out.println("service3");
	}
}
