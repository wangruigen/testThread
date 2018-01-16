package core.testThread2.day2.model;

public class TaskThreadA extends Thread {
	private Task task;
	
	public TaskThreadA() {
		super();
	}

	public TaskThreadA(Task task) {
		super();
		this.task = task;
	}

	@Override
	public void run() {
		task.setName("A");
		task.setPassword("aaa");
		task.method(task);
	}
}
