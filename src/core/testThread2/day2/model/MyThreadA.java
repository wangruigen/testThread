package core.testThread2.day2.model;

public class MyThreadA extends Thread {
	private HasSynchronized hasSynchronized;
	
	public MyThreadA() {

	}
	
	
	public MyThreadA(HasSynchronized hasSynchronized) {
		super();
		this.hasSynchronized = hasSynchronized;
	}


	@Override
	public void run() {
		hasSynchronized.method();
	}
}
