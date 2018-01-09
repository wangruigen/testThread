package core.testThread.day3.model.priority;

public class MyThreadB extends Thread {
	@Override
	public void run() {
		System.out.println("MyThreadB priority is "+this.getPriority());
	}
}
