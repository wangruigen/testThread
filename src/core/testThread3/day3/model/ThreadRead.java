package core.testThread3.day3.model;

import java.io.PipedInputStream;

public class ThreadRead extends Thread {
	private ReadData read;
	private PipedInputStream input;
	public ThreadRead(ReadData read, PipedInputStream input) {
		super();
		this.read = read;
		this.input = input;
	}
	public ThreadRead() {
		super();
	}
	
	@Override
	public void run() {
		read.readMethod(input);
	}
}
