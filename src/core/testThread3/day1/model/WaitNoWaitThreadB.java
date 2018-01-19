package core.testThread3.day1.model;

public class WaitNoWaitThreadB extends Thread {
	private Object object;

	public WaitNoWaitThreadB(Object object) {
		super();
		this.object = object;
	}

	public WaitNoWaitThreadB() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		WaitNoWait waitNoWait = new WaitNoWait();
		waitNoWait.method(object);
	}
}
