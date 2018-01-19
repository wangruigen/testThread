package core.testThread3.day1.model;

public class WaitNoWaitThreadA extends Thread {
	private Object object;

	public WaitNoWaitThreadA(Object object) {
		super();
		this.object = object;
	}

	public WaitNoWaitThreadA() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		WaitNoWait w = new WaitNoWait();
		w.method(object);
	}
}
