package core.testThread2.day3.model;

public class DeadLockThreadB extends Thread {
	private DeadLock deadLock;


	public DeadLockThreadB() {
		super();
	}

	public DeadLockThreadB(DeadLock deadLock) {
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
		deadLock.methodA("b");
	}
}
