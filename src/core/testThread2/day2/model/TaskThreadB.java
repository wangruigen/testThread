package core.testThread2.day2.model;

public class TaskThreadB extends Thread {
	private Task task;

	public TaskThreadB(Task task) {
		super();
		this.task = task;
	}

	public TaskThreadB() {
		super();
	}
	@Override
	public void run() {
		task.setName("B");
		task.setPassword("bbb");
		task.method(task);
	}
	
}
