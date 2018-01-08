package threadName;

public class ThreadName extends Thread {
	
	public ThreadName() {
		System.out.println("gz method : name="+Thread.currentThread().getName());
	}
	
	@Override
	public void run() {
		System.out.println("run : name="+Thread.currentThread().getName());
		System.out.println(this.getName());
	}
}
