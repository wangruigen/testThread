package core.testThread2.day3.model;

public class DeadLockThreadA extends Thread {
	private DeadLock deadLock;

	
	public DeadLockThreadA() {
		super();
	}

	public DeadLockThreadA(DeadLock deadLock) {
		super();
		this.deadLock = deadLock;
	}

	public DeadLock getDeadLock() {
		return deadLock;
	}

	public void setDeadLock(DeadLock deadLock) {
		this.deadLock = deadLock;
	}
	
	@Override
	public void run() {
		deadLock.methodA("a");
	}
}
