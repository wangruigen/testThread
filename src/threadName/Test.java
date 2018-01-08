package threadName;

public class Test {
	public static void main(String[] args) {
		ThreadName thread = new ThreadName();
		Thread a = new Thread(thread,"a");
		//a.start();
		a.run();
	}
}
