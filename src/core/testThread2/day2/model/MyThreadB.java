package core.testThread2.day2.model;

public class MyThreadB extends Thread {
	private HasSynchronized hasSynchronized;
	public MyThreadB() {
		super();
	}
	public MyThreadB(HasSynchronized hasSynchronized) {
		super();
		this.hasSynchronized = hasSynchronized;
	}
	@Override
	public void run() {
		hasSynchronized.method();
	}
}
