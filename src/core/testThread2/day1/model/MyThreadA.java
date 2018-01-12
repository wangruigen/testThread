package core.testThread2.day1.model;

public class MyThreadA extends Thread {
	private ObjectHasPrivate objectHasPrivate;
	
	public MyThreadA() {
	}
	
	public MyThreadA(ObjectHasPrivate objectHasPrivate) {
		super();
		this.objectHasPrivate = objectHasPrivate;
	}

	@Override
	public void run() {
		super.run();
		objectHasPrivate.addI("a");
	}
}
