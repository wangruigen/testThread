package core.testThread.day2.model;

public class MyThread extends Thread {
	private int i;
	
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public void run() {
		synchronized (this) {
			while(true){
				i++;
			}
		}
	}
}
