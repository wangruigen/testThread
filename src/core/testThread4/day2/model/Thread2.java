package core.testThread4.day2.model;

public class Thread2 extends Thread {
	private MyService2 myService2;

	public Thread2(MyService2 myService2) {
		super();
		this.myService2 = myService2;
	}
	@Override
	public void run() {
		myService2.await();
	}
}
