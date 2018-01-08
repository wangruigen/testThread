package alive;

public class TestAliveThread {
	public static void main(String[] args) throws InterruptedException {
		AliveThread thread = new AliveThread();
		thread.start();
		Thread.sleep(1000);
		System.out.println(thread.isAlive());
	}
}
