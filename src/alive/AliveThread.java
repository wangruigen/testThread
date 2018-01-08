package alive;

public class AliveThread extends Thread {
	public AliveThread() {
		System.out.println("gz:"+isAlive());
	}
	@Override
	public void run() {
		super.run();
		System.out.println("run:"+isAlive());
	}
}
