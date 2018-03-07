package core.testThread3.day3.model;

import java.io.PipedOutputStream;

public class ThreadWrite extends Thread {
	
	private WriteDate write;
	private PipedOutputStream out;
	
	public ThreadWrite(WriteDate write, PipedOutputStream out) {
		super();
		this.write = write;
		this.out = out;
	}
	public ThreadWrite() {
		super();
	}
	
	@Override
	public void run() {
		write.writeMethod(out);
	}
	
}
