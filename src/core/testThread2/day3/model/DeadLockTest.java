package core.testThread2.day3.model;

public class DeadLockTest {

	public static void main(String[] args) {
		DeadLock deadLock = new DeadLock();
		DeadLockThreadA deadLockThreadA = new DeadLockThreadA(deadLock);
		DeadLockThreadB deadLockThreadB = new DeadLockThreadB(deadLock);
		deadLockThreadA.start();
		deadLockThreadB.start();
	}

}
