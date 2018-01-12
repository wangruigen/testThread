package core.testThread2.day1.model;

public class ThreadHasSynchronized extends Thread {
	@Override
	public void run() {
		ObjectHasSynchronized oSynchronized = new ObjectHasSynchronized();
		oSynchronized.service1();
	}
}
