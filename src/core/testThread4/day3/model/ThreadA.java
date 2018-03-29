package core.testThread4.day3.model;

public class ThreadA extends Thread {
	private Subject subject ;

	public ThreadA(Subject subject) {
		super();
		this.subject = subject;
	}
	@Override
	public void run() {
		for(int i = 0;i<50;i++) {
			subject.set();
		}
	}
}
