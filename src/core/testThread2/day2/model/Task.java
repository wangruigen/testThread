package core.testThread2.day2.model;

public class Task {
	private String name;
	private String password;
	private Object lock = new Object();
	public Task() {
		super();
	}
	public Task(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void method(Task task){
		/**
		 * 锁定一个对象：
		 */
		synchronized (lock) {//多线程运行Task类中的方法时，使用Task是一个实例的情况，运行core.testThread2.day2.model.TaskTest main方法时打印是同步的。
			for (int i = 0; i < 100; i++) {
				System.out.println("thread="+Thread.currentThread().getName()+" name="+task.getName()+" password="+task.getPassword());
			}
		}
		
		/**
		 * 锁定非同一个对象：
		
		Object lock2 = new Object();
		synchronized (lock2) {//每个线程进来都是创建一个lock2对象，运行core.testThread2.day2.model.TaskTest main方法时打印是异步的。
			for (int i = 0; i < 100; i++) {
				System.out.println("thread="+Thread.currentThread().getName()+" name="+task.getName()+" password="+task.getPassword());
			}
		}
		 */
		
	}
}
