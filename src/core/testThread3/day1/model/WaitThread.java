package core.testThread3.day1.model;

public class WaitThread extends Thread {
	private Object lock;
	
	public WaitThread(Object lock) {
		super();
		this.lock = lock;
	}
	
	public WaitThread() {
		super();
	}

	@Override
	public void run() {
		synchronized (lock) {
			System.out.println("into run WaitThread and wait");
			try {
				lock.wait();
				System.out.println("wait end ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
