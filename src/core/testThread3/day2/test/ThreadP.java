package core.testThread3.day2.test;

import core.testThread3.day2.model.P;

public class ThreadP extends Thread{
	private P p;

	public ThreadP(P p) {
		super();
		this.p = p;
	}
	public ThreadP() {
		super();
	}
	@Override
	public void run() {
		while(true){
			p.setValue();
		}
	}
}
