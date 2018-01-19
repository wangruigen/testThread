package core.testThread3.day1.model;

public class NotifyThread extends Thread {
	private Object lock;
	
	public NotifyThread(Object lock) {
		super();
		this.lock = lock;
	}
	
	public NotifyThread() {
		super();
	}
	
	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("into Notify run");
			lock.notify();
			System.out.println("notify end ");
		}
	}
}
