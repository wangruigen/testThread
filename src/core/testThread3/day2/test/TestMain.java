package core.testThread3.day2.test;

import core.testThread3.day2.model.C;
import core.testThread3.day2.model.P;

public class TestMain {
	public static void main(String[] args) throws InterruptedException {
		String lock = new String("");
		P p = new P(lock);
		C c = new C(lock);
		ThreadP threadP = new ThreadP(p);
		ThreadC threadC = new ThreadC(c);
		threadP.start();
		threadC.start();
	}
}
