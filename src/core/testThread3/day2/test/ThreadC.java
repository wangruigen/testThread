package core.testThread3.day2.test;

import core.testThread3.day2.model.C;

public class ThreadC extends Thread {
	private C c;

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}

	public ThreadC(C c) {
		super();
		this.c = c;
	}

	public ThreadC() {
		super();
	}
	@Override
	public void run() {
		while(true){
			c.getValue();
		}
	}
}
