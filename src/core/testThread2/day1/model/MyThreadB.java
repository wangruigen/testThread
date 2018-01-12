package core.testThread2.day1.model;

public class MyThreadB extends Thread {
	private ObjectHasPrivate objectHasPrivate;
	
	public MyThreadB() {
		super();
	}
	public MyThreadB(ObjectHasPrivate objectHasPrivate) {
		super();
		this.objectHasPrivate = objectHasPrivate;
	};
	
	@Override
	public void run() {
		super.run();
		objectHasPrivate.addI("b");
	}
}
